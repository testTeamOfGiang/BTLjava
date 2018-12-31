<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>home page</title>
</head>
<body id="home">
	<div class="wrapper">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="clearfix"></div>


		<div class="hom-slider">
			<div class="container">
				<div id="sequence">
					<div class="sequence-prev">
						<i class="fa fa-angle-left"></i>
					</div>
					<div class="sequence-next">
						<i class="fa fa-angle-right"></i>
					</div>
					<ul class="sequence-canvas">
						<c:forEach items="${slides }" var="slide">
							<li class="animate-in">

								<div class="flat-caption caption2 formLeft delay400 text-center">
									<h1>${slide.slideTitle }</h1>
								</div>
								<div class="flat-caption caption3 formLeft delay500 text-center">
									<p>${slide.slideContent }</p>
								</div>
								<div class="flat-button caption4 formLeft delay600 text-center">
									<a class="more" href="#">More Details</a>
								</div>
								<div class="flat-image formBottom delay200" data-duration="5"
									data-bottom="true">
									<img
										src="${pageContext.request.contextPath }/images/${slide.slideImage}"
										alt="">
								</div>
							</li>
						</c:forEach>

					</ul>
				</div>
			</div>
			<div class="promotion-banner">
				<div class="container">
					<div class="row">
						<div class="col-md-4 col-sm-4 col-xs-4">
							<div class="promo-box">
								<img src='<c:url value='/resources/images/promotion-01.png'/>'
									alt="">
							</div>
						</div>
						<div class="col-md-4 col-sm-4 col-xs-4">
							<div class="promo-box">
								<img src='<c:url value='/resources/images/promotion-02.png'/>'
									alt="">
							</div>
						</div>
						<div class="col-md-4 col-sm-4 col-xs-4">
							<div class="promo-box">
								<img
									src='<c:url value='/resources/images/promotion-03.png'/>'
									alt="">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<div class="clearfix"></div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>