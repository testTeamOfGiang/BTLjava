<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<title>admin page</title>
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
						<div class="product-tag leftbar" style="margin-top: 0;">
							<h4 class="title">
								<strong> Quản lý nội dung </strong>
							</h4>
							<ul>
								<li><a>Thông báo sự kiện</a></li>
								<li><a>Thông tin liên hệ</a></li>
							</ul>
						</div>
						<div class="product-tag leftbar">
							<h3 class="title">
								<strong>Quản lý Hàng hóa</strong>
							</h3>
							<ul>
								<li><a href="#">Danh sách hàng hóa</a></li>
								<li><a href="#"> Danh sách đơn nhập </a></li>
								<li><a href="#"> Màu sắc sản phẩm </a></li>
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
						<div class="fbl-box leftbar">
							<h3 class="title">Facebook</h3>
							<span class="likebutton"> <a href="#"> <img
									src="images/fblike.png" alt="">
							</a>
							</span>
							<p>12k people like Flat Shop.</p>
							<ul>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
								<li><a href="#"> </a></li>
							</ul>
							<div class="fbplug">
								<a href="#"> <span> <img src="images/fbicon.png"
										alt="">
								</span> Facebook social plugin
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>