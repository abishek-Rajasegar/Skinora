package com.example.springboot.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public String skinType(List<String> productList, String skinType) {
		int positive = 0, negative = 0, nutralizer = 0;

		List<String> positiveIngrediants;
		List<String> negativeIngrediants;

		String positiveList[] = null;
		String negativeList[] = null;

		if (skinType.equals("soft")) {
			positiveList = new String[] { "glycine", "hexadecanoic acid", " 2-ethylhexyl ester", "octyl palmitate",
					"ethylhexyl palmitate", "portulacaceae.", "portulaca oleracea l", "Purselane",
					"portulaca oleracea extract", "hexadecyl 2-ethylhexanoate", "cetyl ethylhexanoate",
					"6-o-palmitoylascorbic acid", "ascorbyl palmitate", "cyclohexasiloxane",
					"hydrolyzed hyaluronic acid", "sodium polyacrylate", "alpha-d-glucopyranoside",
					" alpha-d-glucopyranosyl", "trehalose", "hydrolyzed hyaluronic acid", "cholesterol", "beta glucan",
					"hyaluronic acid", "rosmarinus officinalis leaf extract", "maltodextrin", "glyceryl caprylate",
					"1h-purine-2", "6-dione", " 3,7-dihydro-1", "3,7-trimethyl", "caffeine",
					"aloe barbadensis leaf extract", "alpha-d-glucopyranoside", " alpha-d-glucopyranosyl", "trehalose",
					"titanium dioxide", "chamomilla recutita flower extract", "aka l-ascorbic acid", "ascorbic acid",
					"sodium 5-oxo-2-pyrrolidinecarboxylate", "sodium pca", "1,3,4-octadecanetriol", "2-octadecanamide",
					"stearoyl-c18-phytosphingosine", "stearoyl-4-hydroxysphinganine", "ceramide np", "1,3-propanediol",
					"tromethamine", "arginine", "centella asiatica extract\r\n" + "", "hydrogenated lecithin",
					"lecithins", " hydrogenated", "cyclopentasiloxane", "decamethylcyclopentasiloxane",
					"sodium citrate", "adenosine", " 6-Amino-9-beta-D-ribofuranosyl-9H-purine",
					"helianthus annuus seed oil", "1-carboxy-n", "n,n-trimethyl-", " hydroxide", "betaine",
					"aloe barbadensis leaf juice", "butyrospermum parkii butter", "23-hexamethyltetracosane",
					"squalane", "camellia sinensis leaf extract", "pentylene glycol", "stearic acid",
					"3-pyridinecarboxamide", "niacinamide", "water", "aqua", "deionized", "distilledwater",
					"micromatrix", "fractile", "glycerin", "glycerol(inn)", "glycerol (rifm)", "glycerolum (ep)",
					"glycyl alcohol", "1,2,3-propanetriol", "1,2,3-trihydroxypropane", "butylene glycol", "butane-1",
					"3-diol", "3-diol", "ethylhexylglycerin", "2-propanediol", "sodium hyaluronat", "tocopherol",
					"3,4-dihydro-2", "5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2h-benzopyran-6-ol",
					"alpha.-tocopherol", "vitamin e", "caprylyl glycol", "aka octane-1", "2-diol", "1,2 hexanediol",
					"propanediol", "1,3-dihydroxypropane", "dimethicone", "tocopheryl acetate", "3,4-dihydro-2",
					"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2H-benzopyran-6-yl acetate", "panthenol",
					"butanamide", " 2,4-dihydroxy-N-(3-hydroxypropyl)-3,3-dimethyl-", " (2R)-; dl-Panthenol" };

			negativeList = new String[] { "kaolin", "butyl methoxydibenzoylmethane", "ethylhexyl salicylate",
					"beta glucan", "cucumis sativus fruit extract", "mica", "polysorbate 60", "benzyl alcohol",
					"3,7-dimethyl-6-octen-1-ol", "citronellol", "propanoic acid", "lactic acid", "salicylic acid",
					"ethanol", "alcohol", "sodium chloride", "polysorbate 20", "sorbitan", "monododecanoate",
					" poly(oxy-1,2-ethanediyl)", "titanium dioxide", "tetrasodium etidronate", "tetrasodium edta",
					"sodium palm kernelate", "cocamidopropyl betaine", "sodium stearate", "sodium palmitate",
					"sodium lauroyl isethionate", "citric acid", "xanthan gum", "phenoxyethanol", "2-Phenoxyethanol",
					"Parfum", "disodium edta", "disodium dihydrogen ethylenediaminetetraacetate",
					"2,3-propanetricarboxylic acid", "2-hydroxy-1", "titanium dioxide", "sodium tallowate",
					"sodium isethionate" };
		}

		else if (skinType.equals("dry")) {
			positiveList = new String[] { "glycine", "hexadecanoic acid", " 2-ethylhexyl ester", "octyl palmitate",
					"ethylhexyl palmitate", "portulacaceae.", "portulaca oleracea l", "Purselane",
					"portulaca oleracea extract", "hexadecyl 2-ethylhexanoate", "cetyl ethylhexanoate",
					"cocos nucifera oil", "6-o-palmitoylascorbic acid", "ascorbyl palmitate", "cyclohexasiloxane",
					"hydrolyzed hyaluronic acid", "sodium polyacrylate", "beta glucan", "alpha-d-glucopyranoside",
					" alpha-d-glucopyranosyl", "trehalose", "hydrolyzed hyaluronic acid", "cholesterol", "beta glucan",
					"hyaluronic acid", "rosmarinus officinalis leaf extract", "cucumis sativus fruit extract",
					"d-glucitol", "sorbitol", "maltodextrin", "glyceryl caprylate", "1h-purine-2", "6-dione",
					" 3,7-dihydro-1", "3,7-trimethyl", "caffeine", "aloe barbadensis leaf extract",
					"alpha-d-glucopyranoside", " alpha-d-glucopyranosyl", "trehalose", "titanium dioxide",
					"chamomilla recutita flower extract", "aka l-ascorbic acid", "ascorbic acid",
					"sodium 5-oxo-2-pyrrolidinecarboxylate", "sodium pca", "1,3,4-octadecanetriol", "2-octadecanamide",
					"stearoyl-c18-phytosphingosine", "stearoyl-4-hydroxysphinganine", "ceramide np", "1,3-propanediol",
					"tromethamine", "arginine", "centella asiatica extract", "hydrogenated lecithin", "lecithins",
					" hydrogenated", "cyclopentasiloxane", "decamethylcyclopentasiloxane", "sodium citrate",
					"silicon dioxide", "silica", "adenosine", " 6-Amino-9-beta-D-ribofuranosyl-9H-purine",
					"helianthus annuus seed oil", "1-carboxy-n", "n,n-trimethyl-", " hydroxide", "betaine",
					"aloe barbadensis leaf juice", "butyrospermum parkii butter", "23-hexamethyltetracosane",
					"squalane", "camellia sinensis leaf extract", "pentylene glycol", "stearic acid",
					"3-pyridinecarboxamide", "niacinamide", "tocopherol", "3,4-dihydro-2",
					"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2h-benzopyran-6-ol", "alpha.-tocopherol",
					"vitamin e", "1,2 Hexanediol", "1,3-dihydroxypropane", "dimethicone", "tocopheryl acetate",
					"3,4-dihydro-2", "5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2H-benzopyran-6-yl acetate",
					"panthenol", "butanamide", " 2,4-dihydroxy-N-(3-hydroxypropyl)-3,3-dimethyl-",
					" (2R)-; dl-Panthenol",
					"\"panthenol\",\r\n"
							+ "\"butanamide\", \" 2,4-dihydroxy-N-(3-hydroxypropyl)-3,3-dimethyl-\", \" (2R)-; dl-Panthenol\"",
					"" };

			negativeList = new String[] { "kaolin", "butyl methoxydibenzoylmethane", "ethylhexyl salicylate", "mica",
					"polysorbate 60", "benzyl alcohol", "2,6-octadien-1-ol", "3,7-dimethyl-(2e)", "ceraniol",
					"propanoic acid", "lactic acid", "salicylic acid", "ethanol", "alcohol", "sodium chloride",
					"polysorbate 20", "sorbitan", "monododecanoate", " poly(oxy-1,2-ethanediyl)", "pentylene glycol",
					"titanium dioxide", "tetrasodium etidronate", "tetrasodium edta", "sodium palm kernelate",
					"cocamidopropyl betaine", "sodium stearate", "sodium isethionate", "sodium palmitate",
					"sodium tallowate", "sodium lauroyl isethionate", "titanium dioxide" };
		}

		else if (skinType.equals("oily")) {
			positiveList = new String[] { "glycine", "hexadecanoic acid", " 2-ethylhexyl ester", "octyl palmitate",
					"ethylhexyl palmitate", "portulacaceae", "portulaca oleracea l", "Purselane",
					"portulaca oleracea extract", "kaolin", "6-o-palmitoylascorbic acid", "ascorbyl palmitate",
					"cyclohexasiloxane", "hydrolyzed hyaluronic acid", "alpha-d-glucopyranoside",
					" alpha-d-glucopyranosyl", "trehalose", "cholesterol", "beta glucan", "hyaluronic acid",
					"rosmarinus officinalis leaf extract", "cucumis sativus fruit extract", "maltodextrin", "mica",
					"1h-purine-2", "6-dione", " 3,7-dihydro-1", "3,7-trimethyl", "caffeine",
					"aloe barbadensis leaf extract", "alpha-d-glucopyranoside", " alpha-d-glucopyranosyl", "trehalose",
					"titanium dioxide", "chamomilla recutita flower extract", "aka l-ascorbic acid", "ascorbic acid",
					"sodium 5-oxo-2-pyrrolidinecarboxylate", "sodium pca", "1,3,4-octadecanetriol", "2-octadecanamide",
					"stearoyl-c18-phytosphingosine", "stearoyl-4-hydroxysphinganine", "ceramide np", "1,3-propanediol",
					"tromethamine", "arginine", "centella asiatica extract", "salicylic acid", "hydrogenated lecithin",
					"lecithins", " hydrogenated", "cyclopentasiloxane", "decamethylcyclopentasiloxane",
					"sodium citrate", "silicon dioxide", "silica", "adenosine",
					" 6-Amino-9-beta-D-ribofuranosyl-9H-purine", "1-carboxy-n", "n,n-trimethyl-", " hydroxide",
					"betaine", "aloe barbadensis leaf juice", "aloe barbadensis leaf juice",
					"butyrospermum parkii butter", "camellia sinensis leaf extract", "pentylene glycol",
					"3-pyridinecarboxamide", "niacinamide", "sodium palm kernelate", "tocopherol", "3,4-dihydro-2",
					"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2h-benzopyran-6-ol", "alpha.-tocopherol",
					"vitamin e", "1,3-dihydroxypropane", "dimethicone", "tocopheryl acetate", "3,4-dihydro-2",
					"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2H-benzopyran-6-yl acetate", "sodium stearate" };

			negativeList = new String[] { "butyl methoxydibenzoylmethane", "hexadecyl 2-ethylhexanoate",
					"cetyl ethylhexanoate", "cocos nucifera oil", "ethylhexyl salicylate", "sodium polyacrylate",
					"beta glucan", "hydrolyzed hyaluronic acid", "hexadecanoic acid", "palmitic acid",
					"glyceryl caprylate", "polysorbate 60", "benzyl alcohol", "3,7-dimethyl-6-octen-1-ol",
					"citronellol", "2,6-octadien-1-ol", "3,7-dimethyl-(2e)", "ceraniol", "propanoic acid",
					"lactic acid", "ethanol", "alcohol", "helianthus annuus seed oil", "sodium chloride",
					"23-hexamethyltetracosane", "squalane", "polysorbate 20", "sorbitan", "monododecanoate",
					" poly(oxy-1,2-ethanediyl)", "stearic acid", "titanium dioxide", "tetrasodium etidronate",
					"tetrasodium edta", "cocamidopropyl betaine", "sodium isethionate", "sodium palmitate",
					"sodium tallowate", "sodium lauroyl isethionate", "titanium dioxide", "alcohols", " c16-18",
					"cetearyl alcohol", "1,2 Hexanediol", "glyceryl stearate", "stearic acid",
					"monoester with glycerol" };
		}

		else if (skinType.equals("combined")) {
			positiveList = new String[] { "glycine", "hexadecanoic acid", " 2-ethylhexyl ester", "octyl palmitate",
					"ethylhexyl palmitate", "portulaca oleracea l", "Purselane", "portulaca oleracea extract",
					"hexadecyl 2-ethylhexanoate", "cetyl ethylhexanoate", "6-o-palmitoylascorbic acid",
					"ascorbyl palmitate", "cyclohexasiloxane", "ethylhexyl salicylate", "hydrolyzed hyaluronic acid",
					"sodium polyacrylate", "alpha-d-glucopyranoside", " alpha-d-glucopyranosyl", "trehalose",
					"hydrolyzed hyaluronic acid", "cholesterol", "beta glucan", "hyaluronic acid",
					"rosmarinus officinalis leaf extract", "cucumis sativus fruit extract", "maltodextrin", "mica",
					"glyceryl caprylate", "1h-purine-2", "6-dione", " 3,7-dihydro-1", "3,7-trimethyl", "caffeine",
					"aloe barbadensis leaf extract", "alpha-d-glucopyranoside", " alpha-d-glucopyranosyl", "trehalose",
					"titanium dioxide", "chamomilla recutita flower extract", "aka l-ascorbic acid", "ascorbic acid",
					"sodium 5-oxo-2-pyrrolidinecarboxylate", "sodium pca", "1,3,4-octadecanetriol", "2-octadecanamide",
					"stearoyl-c18-phytosphingosine", "stearoyl-4-hydroxysphinganine", "ceramide np", "tromethamine",
					"arginine", "centella asiatica extract", "hydrogenated lecithin", "lecithins", " hydrogenated",
					"cyclopentasiloxane", "decamethylcyclopentasiloxane", "sodium citrate", "adenosine",
					" 6-Amino-9-beta-D-ribofuranosyl-9H-purine", "helianthus annuus seed oil", "1-carboxy-n",
					"n,n-trimethyl-", " hydroxide", "betaine", "aloe barbadensis leaf juice",
					"butyrospermum parkii butter", "camellia sinensis leaf extract", "pentylene glycol", "stearic acid",
					"3-pyridinecarboxamide", "niacinamide", "tocopherol", "3,4-dihydro-2",
					"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2h-benzopyran-6-ol", "alpha.-tocopherol",
					"vitamin e", "1,2 hexanediol", "1,3-dihydroxypropane", "dimethicone", "tocopheryl acetate",
					"\"3,4-dihydro-2\",\"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2H-benzopyran-6-yl acetate\"",
					"\"panthenol\",\r\n"
							+ "					\"butanamide\",\" 2,4-dihydroxy-N-(3-hydroxypropyl)-3,3-dimethyl-\",\" (2R)-; dl-Panthenol\"",
					"\"alcohols\",\" c16-18\",\"cetearyl alcohol\"" };

			negativeList = new String[] { "kaolin", "butyl methoxydibenzoylmethane", "cocos nucifera oil",
					"polysorbate 60", "benzyl alcohol", "3,7-dimethyl-6-octen-1-ol", "citronellol", "2,6-octadien-1-ol",
					"3,7-dimethyl-(2e)", "ceraniol", "propanoic acid", "lactic acid", "salicylic acid", "ethanol",
					"alcohol", "silicon dioxide", "silica", "sodium chloride", "23-hexamethyltetracosane", "squalane",
					"polysorbate 20", "sorbitan", "monododecanoate", " poly(oxy-1,2-ethanediyl)", "titanium dioxide",
					"tetrasodium etidronate", "tetrasodium edta", "sodium palm kernelate", "cocamidopropyl betaine",
					"sodium stearate", "sodium isethionate", "sodium palmitate", "sodium tallowate", "titanium dioxide",
					"sodium lauroyl isethionate" };
		}

		else {
			positiveList = new String[] { "glycine", "hexadecanoic acid", " 2-ethylhexyl ester", "octyl palmitate",
					"ethylhexyl palmitate", "portulacaceae.", "portulaca oleracea l", "Purselane",
					"portulaca oleracea extract", "hexadecyl 2-ethylhexanoate", "cetyl ethylhexanoate",
					"6-o-palmitoylascorbic acid", "ascorbyl palmitate", "cyclohexasiloxane",
					"hydrolyzed hyaluronic acid", "sodium polyacrylate", "alpha-d-glucopyranoside",
					" alpha-d-glucopyranosyl", "trehalose", "hydrolyzed hyaluronic acid", "cholesterol", "beta glucan",
					"hyaluronic acid", "rosmarinus officinalis leaf extract", "maltodextrin", "glyceryl caprylate",
					"1h-purine-2", "6-dione", " 3,7-dihydro-1", "3,7-trimethyl", "caffeine",
					"aloe barbadensis leaf extract", "alpha-d-glucopyranoside", " alpha-d-glucopyranosyl", "trehalose",
					"titanium dioxide", "chamomilla recutita flower extract", "aka l-ascorbic acid", "ascorbic acid",
					"sodium 5-oxo-2-pyrrolidinecarboxylate", "sodium pca", "1,3,4-octadecanetriol", "2-octadecanamide",
					"stearoyl-c18-phytosphingosine", "stearoyl-4-hydroxysphinganine", "ceramide np", "1,3-propanediol",
					"tromethamine", "arginine", "centella asiatica extract\r\n" + "", "hydrogenated lecithin",
					"lecithins", " hydrogenated", "cyclopentasiloxane", "decamethylcyclopentasiloxane",
					"sodium citrate", "adenosine", " 6-Amino-9-beta-D-ribofuranosyl-9H-purine",
					"helianthus annuus seed oil", "1-carboxy-n", "n,n-trimethyl-", " hydroxide", "betaine",
					"aloe barbadensis leaf juice", "butyrospermum parkii butter", "23-hexamethyltetracosane",
					"squalane", "camellia sinensis leaf extract", "pentylene glycol", "stearic acid",
					"3-pyridinecarboxamide", "niacinamide", "water", "aqua", "deionized", "distilledwater",
					"micromatrix", "fractile", "glycerin", "glycerol(inn)", "glycerol (rifm)", "glycerolum (ep)",
					"glycyl alcohol", "1,2,3-propanetriol", "1,2,3-trihydroxypropane", "butylene glycol", "butane-1",
					"3-diol", "3-diol", "ethylhexylglycerin", "2-propanediol", "sodium hyaluronat", "tocopherol",
					"3,4-dihydro-2", "5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2h-benzopyran-6-ol",
					"alpha.-tocopherol", "vitamin e", "caprylyl glycol", "aka octane-1", "2-diol", "1,2 hexanediol",
					"propanediol", "1,3-dihydroxypropane", "dimethicone", "tocopheryl acetate", "3,4-dihydro-2",
					"5,7,8-tetramethyl-2-(4,8,12-trimethyltridecyl)-2H-benzopyran-6-yl acetate", "panthenol",
					"butanamide", " 2,4-dihydroxy-N-(3-hydroxypropyl)-3,3-dimethyl-", " (2R)-; dl-Panthenol" };

			negativeList = new String[] { "kaolin", "butyl methoxydibenzoylmethane", "ethylhexyl salicylate",
					"beta glucan", "cucumis sativus fruit extract", "mica", "polysorbate 60", "benzyl alcohol",
					"3,7-dimethyl-6-octen-1-ol", "citronellol", "propanoic acid", "lactic acid", "salicylic acid",
					"ethanol", "alcohol", "sodium chloride", "polysorbate 20", "sorbitan", "monododecanoate",
					" poly(oxy-1,2-ethanediyl)", "titanium dioxide", "tetrasodium etidronate", "tetrasodium edta",
					"sodium palm kernelate", "cocamidopropyl betaine", "sodium stearate", "sodium palmitate",
					"sodium lauroyl isethionate", "citric acid", "xanthan gum", "phenoxyethanol", "2-Phenoxyethanol",
					"Parfum", "disodium edta", "disodium dihydrogen ethylenediaminetetraacetate",
					"2,3-propanetricarboxylic acid", "2-hydroxy-1", "titanium dioxide", "sodium tallowate",
					"sodium isethionate" };
		}

		positiveIngrediants = new ArrayList<String>(Arrays.asList(positiveList));
		negativeIngrediants = new ArrayList<String>(Arrays.asList(negativeList));

		System.out.println(positiveIngrediants);

		System.out.println();

		System.out.println(negativeIngrediants);

		String ans = "";
		for (int i = 0; i < productList.size(); i++) {

			if (positiveIngrediants.contains((productList.get(i)).toLowerCase().trim())) {
				positive++;
			} else if (negativeIngrediants.contains((productList.get(i).toLowerCase().trim()))) {
				negative++;
				ans += productList.get(i) + " , ";
			} else {
				continue;
			}

		}

		System.out.println("p:" + positive + " N :" + negative + " Nut :" + nutralizer);

		if (positive > negative) {
			if ((positive - negative) > 2) {
				return "1";
			} else {
				System.out.println(ans);
				return ans;
				
			}

		} else {
			return "-1";
		}
	}

}
