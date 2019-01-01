<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="header">
	<div class="container">
		<div class="row">
			<div class="col-md-2 col-sm-2">
				<div class="logo">
					<a href="${pageContext.request.contextPath }/"><img
						src='<c:url value='/resources/images/logo.png'/>' alt="FlatShop"></a>
				</div>
			</div>
			<div class="col-md-10 col-sm-10">
				<div class="header_top">
					<div class="row">
						<div class="col-md-3"></div>
						<div class="col-md-6"></div>
						<div class="col-md-3">
							<ul class="usermenu">
								<c:if test="${empty sessionScope.user}">
									<li><a href="${pageContext.request.contextPath }/login"
										class="log">Login</a></li>
									<li><a href="${pageContext.request.contextPath }/register"
										class="reg">Register</a></li>
								</c:if>
								<c:if test="${not empty sessionScope.user}">
									<c:if test="${sessionScope.type eq'user' }">
										<li class="dropdown"><a class="dropdown-toggle">hi
												${sessionScope.user.userFirstName }</a>
											<div class="dropdown-menu">
												<ul class="mega-menu-links">
													<li><a href="index.html">logout</a></li>
													<li><a href="home2.html">cart</a></li>

												</ul>
											</div></li>
									</c:if>
									<c:if test="${sessionScope.type eq 'employee' }">
										<li><a>${sessionScope.user.employeeName }</a></li>
									</c:if>
								</c:if>
							</ul>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
				<div class="header_bottom">
					<ul class="option">
						<li id="search" class="search">
							<form>
								<input class="search-submit" type="submit" value=""><input
									class="search-input" placeholder="Enter your search term..."
									type="text" value="" name="search">
							</form>
						</li>

					</ul>
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="active dropdown"><a href="/home"
								class="dropdown-toggle" data-toggle="dropdown">Home</a>
								<div class="dropdown-menu">
									<ul class="mega-menu-links">
										<li><a href="index.html">home</a></li>
										<li><a href="home2.html">home2</a></li>
										<li><a href="home3.html">home3</a></li>
										<li><a href="productlitst.html">Productlitst</a></li>
										<li><a href="productgird.html">Productgird</a></li>
										<li><a href="details.html">Details</a></li>
										<li><a href="cart.html">Cart</a></li>
										<li><a href="checkout.html">CheckOut</a></li>
										<li><a href="checkout2.html">CheckOut2</a></li>
										<li><a href="contact.html">contact</a></li>
									</ul>
								</div></li>
							<li><a href="productgird.html">men</a></li>
							<li><a href="productlitst.html">women</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Fashion</a>
								<div class="dropdown-menu mega-menu">
									<div class="row">
										<div class="col-md-6 col-sm-6">
											<ul class="mega-menu-links">
												<li><a href="productgird.html">New Collection</a></li>
												<li><a href="productgird.html">Shirts & tops</a></li>
												<li><a href="productgird.html">Laptop & Brie</a></li>
												<li><a href="productgird.html">Dresses</a></li>
												<li><a href="productgird.html">Blazers & Jackets</a></li>
												<li><a href="productgird.html">Shoulder Bags</a></li>
											</ul>
										</div>
										<div class="col-md-6 col-sm-6">
											<ul class="mega-menu-links">
												<li><a href="productgird.html">New Collection</a></li>
												<li><a href="productgird.html">Shirts & tops</a></li>
												<li><a href="productgird.html">Laptop & Brie</a></li>
												<li><a href="productgird.html">Dresses</a></li>
												<li><a href="productgird.html">Blazers & Jackets</a></li>
												<li><a href="productgird.html">Shoulder Bags</a></li>
											</ul>
										</div>
									</div>
								</div></li>
							<li><a href="productgird.html">gift</a></li>
							<li><a href="productgird.html">kids</a></li>
							<li><a href="productgird.html">blog</a></li>
							<li><a href="productgird.html">jewelry</a></li>
							<li><a href="contact.html">contact us</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>