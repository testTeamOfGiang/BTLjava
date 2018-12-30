<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon"
	href='<c:url value='/resources/images/favicon.png'/>'>
<link href='<c:url value='/resources/css/bootstrap.css'/>'
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,300,300italic,400italic,500,700,500italic,100italic,100'
	rel='stylesheet' type='text/css'>
<link href='<c:url value='/resources/css/font-awesome.min.css'/>'
	rel="stylesheet">
<link rel="stylesheet"
	href='<c:url value='/resources/css/flexslider.css'/>' type="text/css"
	media="screen" />
<link href='<c:url value='/resources/css/sequence-looptheme.css'/>'
	rel="stylesheet" media="all" />
<link href='<c:url value='/resources/css/style.css'/>' rel="stylesheet">
<title>${test }</title>
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js">
</script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js">
</script>
<![endif]-->
</head>
<body>
	<div class="wrapper">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="clearfix"></div>

		<div class="container_fullwidth">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<div class="special-deal leftbar" style="margin-top: 0;">
							<h4 class="title">
								Special <strong> Deals </strong>
							</h4>
							<div class="special-item">
								<div class="product-image">
									<a href="details.html"> <img
										src="images/products/thum/products-01.png" alt="">
									</a>
								</div>
								<div class="product-info">
									<p>
										<a href="details.html"> Licoln Corner Unit </a>
									</p>
									<h5 class="price">$300.00</h5>
								</div>
							</div>
							<div class="special-item">
								<div class="product-image">
									<a href="details.html"> <img
										src="images/products/thum/products-02.png" alt="">
									</a>
								</div>
								<div class="product-info">
									<p>
										<a href="details.html"> Licoln Corner Unit </a>
									</p>
									<h5 class="price">$300.00</h5>
								</div>
							</div>
							<div class="special-item">
								<div class="product-image">
									<a href="details.html"> <img
										src="images/products/thum/products-03.png" alt="">
									</a>
								</div>
								<div class="product-info">
									<p>
										<a href="details.html"> Licoln Corner Unit </a>
									</p>
									<h5 class="price">$300.00</h5>
								</div>
							</div>
						</div>
						<div class="category leftbar">
							<h3 class="title">Categories</h3>
							<ul>
								<li><a href="#"> Men </a></li>
								<li><a href="#"> Women </a></li>
								<li><a href="#"> Salon </a></li>
								<li><a href="#"> New Trend </a></li>
								<li><a href="#"> Living room </a></li>
								<li><a href="#"> Bed room </a></li>
							</ul>
						</div>
						<div class="get-newsletter leftbar">
							<h3 class="title">
								Get <strong> newsletter </strong>
							</h3>
							<p>Casio G Shock Digital Dial Black.</p>
							<form>
								<input class="email" type="text" name=""
									placeholder="Your Email..."> <input class="submit"
									type="submit" value="Submit">
							</form>
						</div>

					</div>
					<div class="col-md-9">
						<div class="checkout-page">
							<ol class="checkout-steps">
								<li class="steps active"><a href="checkout.html"
									class="step-title"> Login </a>
									<div class="step-description">
										<div class="row">
											<div class="col-md-6 col-sm-6">
												<div class="new-customer">
													<h5>New Customer</h5>
													<label> <span class="input-radio"> <input
															type="radio" name="user">
													</span> <span class="text"> I wish to subscribe to the
															Herbal Store newsletter. </span>
													</label> <label> <span class="input-radio"> <input
															type="radio" name="user">
													</span> <span class="text"> My delivery and billing
															addresses are the same. </span>
													</label>
													<p class="requir">By creating an account you will be
														able to shop faste be up to date on an order's status, and
														keep track of the orders you have previously made.</p>
													<button>Continue</button>
												</div>
											</div>
											<div class="col-md-6 col-sm-6">
												<div class="run-customer">
													<h5>Rerunning Customer</h5>
													<form>
														<div class="form-row">
															<label class="lebel-abs"> Email <strong
																class="red"> * </strong>
															</label> <input type="text" class="input namefild" name="">
														</div>
														<div class="form-row">
															<label class="lebel-abs"> Password <strong
																class="red"> * </strong>
															</label> <input type="text" class="input namefild" name="">
														</div>
														<p class="forgoten">
															<a href="#"> Forgoten your password? </a>
														</p>
														<button>Login</button>
													</form>
												</div>
											</div>
										</div>
									</div></li>
							</ol>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>

		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>