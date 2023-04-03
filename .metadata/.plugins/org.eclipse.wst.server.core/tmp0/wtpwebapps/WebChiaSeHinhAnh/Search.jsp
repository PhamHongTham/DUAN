<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<title>PIXEL</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.2/examples/headers/">
<link rel="stylesheet" href="css/style.css">

</head>
<body>
	<header class="mb-3 border-bottom" style="padding: 20px 60px 20px 80px">
			<div>

				<div
					class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
				<div>						<a style="padding:0 20px 0 20px; text-decoration: none; color: black; font-family:monospace; font-weight: bold; font-size: 30px"
							href="HomeControl">PIXEl</a>
					</div>
					
					<ul
						class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
						
					</ul>
				
					<form action="SearchControl" method="post" class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search" style="display: flex">
						<%-- <select name="idCate" class="form-select"
						aria-label="Default select example"
						style="width: 130px; height: 38px; border-radius: 10px 0px 0px 10px;">
						<option selected>Tất cả hình ảnh</option>
						<c:forEach items="${listC}" var="C">
							<option value="${C.idCategory}">${C.cname}</option>
						</c:forEach>
					</select> --%>
						<input value="${txtSearch}" name="search" type="search" class="form-control" placeholder="Search..."
							aria-label="Search">
					</form>
					<p style="padding:0 15px 0 30px; font-weight: bold; margin-top: 17px">${sessionScope.acc.lastName} ${sessionScope.acc.firstName}</p>
					 <c:if test="${sessionScope.acc != null}">
						<div class="dropdown text-end">
							<a href="#"
								class="d-block link-dark text-decoration-none dropdown-toggle"
								data-bs-toggle="dropdown" aria-expanded="false">
								<c:if test="${sessionScope.acc.uImages != null}">
								<img
								src="img/userimage/${sessionScope.acc.uImages}" alt="" width="32"
								height="32" class="rounded-circle">
								</c:if>
								
								
								<c:if test="${sessionScope.acc.uImages == null}">
								<img
								src="https://cdn-icons-png.flaticon.com/512/1946/1946429.png" alt="" width="32"
								height="32" class="rounded-circle">
								</c:if>
								
								
							</a>
							<ul class="dropdown-menu text-small">
								<li><a class="dropdown-item" href="AboutControl?Uid=${sessionScope.acc.userID}">About
										Me</a></li>
								<li><a class="dropdown-item" href="LogoutControl">Logout</a></li>
							</ul>
						</div>
					</c:if>
					<c:if test="${sessionScope.acc == null}">
						<a href="Login.jsp"
							style="padding-left: 30px; size: 20px; text-decoration: none; color: black;">Login</a>
					</c:if>
					<div style="position: relative; left: 100px;"></div>
				</div>
			</div>
		</header>
		<script src="assets/dist/js/bootstrap.bundle.min.js"></script>
		<!-- end header -->
	
	<div class="container">
	${alert}
		<div class="image-container">
			<c:forEach items="${listI}" var="I">
				<a
					href="ImageDetail?Iid=${I.idImage}&Uid=${I.userID}&Cid=${I.idCategory}">
					<img src="img/dataImg/${I.images}" alt="Lỗi">
				</a>
			</c:forEach>
		</div>
	</div>
</body>
</html>