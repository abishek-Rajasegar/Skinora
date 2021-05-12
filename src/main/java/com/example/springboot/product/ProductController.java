package com.example.springboot.product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Controller
public class ProductController {

	ProductService productService = new ProductService();

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String singleFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("skintype") String skintype,
			RedirectAttributes redirectAttributes, Model model) throws IOException, TesseractException {

		byte[] bytes = file.getBytes();
		Path path = Paths.get(file.getOriginalFilename());

		Files.write(path, bytes);

		File convFile = convert(file);

		Tesseract tesseract = new Tesseract();

		tesseract.setDatapath("E:\\tessdata");

		tesseract.setLanguage("eng");

		String text = tesseract.doOCR(convFile);

		System.out.println(text);

		String[] arr = text.split(",|:");

		List<String> inglist = Arrays.asList(arr);

		System.out.println(inglist);

		if (skintype == null) {
			return "index.jsp";
		}

		String value = productService.skinType(inglist, skintype);

		if (value.equals("1")) {
			model.addAttribute("message", "This product suits best for your skin type");
			System.out.println("Best Product");
		} else if (value.equals("-1")) {

			model.addAttribute("message", "This product will not suit your skin type.");
			System.out.println("worst");

		} else {
			model.addAttribute("message", "Warning! There are few ingredients like" + value.toLowerCase() +" which will not suit your skin type.");
			System.out.println("Warning");
		}

		return "index.jsp";

	}

//    @RequestMapping("/result")
//    public String result() {
//        return "result.html";
//    }

	public static File convert(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		convFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}

}
