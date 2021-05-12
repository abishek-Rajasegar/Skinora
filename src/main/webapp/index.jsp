
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<style>
#more {
	display: none;
}

.resizeImg {
	height: 290px;
	width: 210px;
	padding: 10px;
	box-shadow: 6px 6px 15px 5px;
}
</style>
<title>Skinora</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/one-page-wonder.min.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark navbar-custom ">
		<div class="container">
			<a class="navbar-brand" href="index.html"> <img
				src="img/logooo.jpg" alt="logo"
				style="width: 35px; height: 35px; border-radius: 50px">
				Skinora
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="#">Sign Up</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Log In</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<header class="masthead text-center text-white">
		<div class="masthead-content">
			<div class="container">
				<h2 class="masthead-subheading mb-0" style="color: black;">Worried
					about Which Skin Product to buy?</h2>
				<h3 class="" style="color: black;">Don't worry we will help you</h3>
				<a href="#toggleForm"
					class="btn btn-primary btn-xl rounded-pill mt-5">Click Here</a>
				<br>
				
				
				<%if(request.getAttribute("message")!=null){ %>
				<br>
				<h3>Your Product Result</h3>  
			    	<br>  
			    	  <h4> ${message} </h4>
				
				<%} %>	
			</div>
		</div>
		<div class="bg-circle-1 bg-circle"></div>
		<div class="bg-circle-2 bg-circle"></div>
		<div class="bg-circle-3 bg-circle"></div>
		<div class="bg-circle-4 bg-circle"></div>
	</header>

	<section style="background: rgb(25, 194, 123)">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6 order-lg-2">
					<div class="p-5">
						<img class="img-fluid rounded-circle" src="img/normal.jpeg"
							alt="Oily">
					</div>
				</div>
				<div class="col-lg-6 order-lg-1">
					<div class="p-5">
						<h2 class="display-4">Normal Skin</h2>
						<p align="justify">
							<b> Skin is generally classified as “normal” if it isn’t
								overly oily or dry and doesn’t face any persistent skin concerns
								or conditions. This well-balanced healthy skin type has even
								levels of moisture and hydration, uniform texture and no obvious
								problem areas. That said, normal skin can experience slight
								variations in oiliness and dryness and even the occasional
								breakout when exposed to environmental stressors like UV rays
								and pollution. </b>
						</p>

						<p>
							<a class="btn btn-primary" data-toggle="collapse"
								href="#multiCollapseExample1" role="button"
								aria-expanded="false" aria-controls="multiCollapseExample1">View
								More</a>
						</p>
						<div class="row">
							<div class="col">
								<div class="collapse multi-collapse" id="multiCollapseExample1">
									<div class="card card-body bg-transparent">
										<h5>Ingredients to look for</h5>
										<b> 1. zinc oxide<br> 2. titanium dioxide<br> 3.
											glycolic acid <br> 4.polyhydroxy acids<br>
										</b>
									</div>
								</div>
							</div>




						</div>
					</div>
				</div>
			</div>
			</div>
	</section>



	<section style="background: rgb(191, 194, 25)">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6">
					<div class="p-5">
						<img class="img-fluid rounded-circle" src="img/dryyy.jpg" alt="">
					</div>
				</div>
				<div class="col-lg-6">
					<div class="p-5">
						<h2 class="display-4">Dry Skin</h2>
						<p align="justify">
							<b>Dry is used to describe a skin type that produces less
								sebum than normal skin. As a result of the lack of sebum, dry
								skin lacks the lipids that it needs to retain moisture and build
								a protective shield against external influences. This leads to
								an impaired barrier function. Dry skin Xerosis exists in varying
								degrees of severity and in different forms that are not always
								clearly distinguishable.</b>
						</p>

						<p>
							<a class="btn btn-primary" data-toggle="collapse"
								href="#multiCollapseExample2" role="button"
								aria-expanded="false" aria-controls="multiCollapseExample1">View
								More</a>
						</p>
						<div class="row">
							<div class="col">
								<div class="collapse multi-collapse" id="multiCollapseExample2">
									<div class="card card-body bg-transparent">
										<h5>Ingredients to look for</h5>
										<b> 1. Hyaluronic Acid<br> 2. Glycerin<br> 3.
											Vitamin E <br> 4.Lactic Acid<br>5.Aloe Vera
										</b>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
			</div>
			
	</section>


	<section style="background: rgb(25, 194, 123)">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6 order-lg-2">
					<div class="p-5">
						<img class="img-fluid rounded-circle" src="img/combined.jpg"
							alt="combined">
					</div>
				</div>
				<div class="col-lg-6 order-lg-1">
					<div class="p-5">
						<h3 class="display-4">Combined Skin</h3>
						<p align="justify">
							<b> In combination skin the skin types vary in the T-zone and
								the cheeks. The so-called T-zone can differ substantially from a
								very slim zone to an extended area. The oilier parts of
								combination skin are caused by an over production of sebum. The
								drier parts of combination skin are caused by a lack of sebum
								and a corresponding lipid deficiency </b>
						</p>

						<p>
							<a class="btn btn-primary" data-toggle="collapse"
								href="#multiCollapseExample3" role="button"
								aria-expanded="false" aria-controls="multiCollapseExample1">View
								More</a>
						</p>
						<div class="row">
							<div class="col">
								<div class="collapse multi-collapse" id="multiCollapseExample3">
									<div class="card card-body bg-transparent">
										<h5>Ingredients to look for</h5>
										<b> 1. Hyaluronic Acid<br> 2. Salicylic Acid<br>
											3. Niacinamide <br> 4. Retinol<br>
										</b>
									</div>
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>
	</section>

	<section>
		<div style="background: rgb(191, 194, 25)">
			<div class="row align-items-center">
				<div class="col-lg-6">
					<div class="p-5">
						<img class="img-fluid rounded-circle" src="img/oilyy.jpg" alt="">
					</div>
				</div>
				<div class="col-lg-6">
					<div class="p-5">
						<h2 class="display-4">Oily SKin</h2>
						<p align="justify">
							<b>Oily is used to describe a skin type with heightened sebum
								production. An over production is known as seborrhea. Oily skin
								is prone to comedones blackheads and whiteheads and to the
								varying forms of acne. With mild acne, a significant number of
								comedones appear on the face and frequently on the neck,
								shoulders, back and chest too </b>
						</p>

						<p>
							<a class="btn btn-primary" data-toggle="collapse"
								href="#multiCollapseExample3" role="button"
								aria-expanded="false" aria-controls="multiCollapseExample1">View
								More</a>
						</p>
						<div class="row">
							<div class="col">
								<div class="collapse multi-collapse" id="multiCollapseExample3">
									<div class="card card-body bg-transparent">
										<h5>Ingredients to look for</h5>
										<b> 1. Hyaluronic Acid<br> 2. Glycerin<br> 3.
											Vitamin E <br> 4.Lactic Acid<br>5.Aloe Vera
										</b>
									</div>
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>
	</section>


	<section style="background-color: black" class="text-light">
		<br>

		<div class="container">
			<div class="row align-items-center">
				<div class="col-12 col-sm-8 mx-auto">
					<h2 class="masthead-subheading mx-auto align-center"
						style="color: rgb(191, 194, 25); border: 1px solid rgb(191, 194, 25); border-radius: 1em; padding: 20px">
						Find the Right Product For Your Skin</h2>
					<form action="/upload" method="POST" enctype="multipart/form-data"
						id="toggleForm">

						<div class="form-group" style="text-align: center">
							<label for="exampleInputEmail1" style="color: rgb(25, 194, 123)">
								<b><h4>Skin Type</h4></b>
							</label> <br>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="skintype"
									id="inlineRadio1" value="normal"> <label
									class="form-check-label" for="inlineRadio1">Normal</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="skintype"
									id="inlineRadio2" value="dry"> <label
									class="form-check-label" for="inlineRadio2">Dry</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="skintype"
									id="inlineRadio2" value="oily"> <label
									class="form-check-label" for="inlineRadio2">Oily</label>
							</div>

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="skintype"
									id="inlineRadio2" value="soft"> <label
									class="form-check-label" for="inlineRadio2">Soft/Sensitive</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="skintype"
									id="inlineRadio2" value="combined"> <label
									class="form-check-label" for="inlineRadio2">Combined</label>
							</div>

						</div>
						<br>

						<div class="form-group" style="text-align: center">
							<label for="exampleInputEmail1" style="color: rgb(25, 194, 123)">
								<b><h4>Existing Skin Problem</h4></b>
							</label> <br>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio1" value="option1">
								<label class="form-check-label" for="inlineRadio1">Acne</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Dark
									Circle</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Wrinkles</label>
							</div>

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Sunburn</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Redness</label>
							</div>

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Black
									Heads</label>
							</div>
							<br> <br>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Dull
									Skin</label>
							</div>

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">White
									Heads</label>
							</div>

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Freckle</label>
							</div>

							<div class="form-check form-check-inline">
								<input class="form-check-input" type="checkbox"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Irritation</label>
							</div>

						</div>

						<br>
						<div class="form-group" style="text-align: center">
							<label for="exampleInputEmail1" style="color: rgb(25, 194, 123)">
								<b><h4>Environmental Conditions</h4></b>
								</h4> </b>
							</label> <br>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio"
									name="inlineRadioOptions" id="inlineRadio1" value="option1">
								<label class="form-check-label" for="inlineRadio1">Pollution
									Free </label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Polluted</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Normal</label>
							</div>

						</div>

						<br>

						<div class="form-group" style="text-align: center">
							<label for="exampleInputEmail1" style="color: rgb(25, 194, 123)">
								<b><h4>Daily water Consumption</h4></b>
								</h4> </b>
							</label> <br>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio"
									name="inlineRadioOptions" id="inlineRadio1" value="option1">
								<label class="form-check-label" for="inlineRadio1">1-2
									Liter</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">2-3
									Liter</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio"
									name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">3-4
									Liter</label>
							</div>

						</div>
						<br>



						<div class="form-group" style="text-align: center">
							<label for="exampleInputEmail1" style="color: rgb(25, 194, 123)">
								<b><h4>Upload Ingredients</h4></b>
								</h4> </b>
							</label> <br> <input type="file" class="custom-file-input1"
								name="file">
						</div>

						<button type="submit" class="btn btn-block btn-primary">Submit</button>
						<br>
					</form>
				</div>
			</div>
		</div>
	</section>


	<section style="background: rgb(25, 194, 123); align-items: center;">
		<br>
		<div class="container">
			<div class="row ">
				<div class="col-12 col-md-3 ">

					<img class="img-responsive resizeImg" src="./img/c5.jpeg"
						alt="Card image cap">

				</div>

				<div class="col-12 col-md-3">

					<img class="img-responsive resizeImg " src="./img/c6.jpeg"
						alt="Card image cap ">

				</div>

				<div class="col-12 col-md-3 ">

					<img class="img-responsive resizeImg " src="./img/c7.jpeg"
						alt="Card image cap ">

				</div>

				<div class="col-12 col-md-3 ">
					<img class="img-responsive resizeImg " src="./img/c8.jpeg"
						alt="Card image cap ">
				</div>

			</div>
			<br>
			<p>
				<a class="btn offset-5" data-toggle="collapse"
					href="#multiCollapseExample3" role="button" aria-expanded="false"
					aria-controls="multiCollapseExample1">View More</a>
			</p>

			<div class="collapse multi-collapse" id="multiCollapseExample3">
				<div class="row">




					<div class="col-12 col-md-3 ">

						<img class="img-responsive resizeImg " src="./img/c1.jpg"
							alt="Card image cap ">

					</div>


					<div class="col-12 col-md-3 ">

						<img class="img-responsive resizeImg " src="./img/c2.jpg"
							alt="Card image cap ">

					</div>


					<div class="col-12 col-md-3 ">

						<img class="img-responsive resizeImg " src="./img/c3.jpg"
							alt="Card image cap ">

					</div>


					<div class="col-12 col-md-3 ">

						<img class="img-responsive resizeImg " src="./img/c4.jpg"
							alt="Card image cap ">

					</div>

				</div>



			</div>
		</div>
		<br>
	</section>



	<footer class="py-5 bg-black ">
		<div class="container ">
			<p class="m-0 text-center text-white small ">&copy; Skinora 2021</p>
		</div>
	</footer>

	<script src="vendor/jquery/jquery.min.js "></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js "></script>


</body>

</html>