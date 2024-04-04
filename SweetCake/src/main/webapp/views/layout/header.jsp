<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<header class="container">
	<div class="center_header text-center row mt-3">
		<div class="col-3">
			<img
				src="https://theme.hstatic.net/1000104153/1001164818/14/logo.png?v=62"
				alt="" style="width: 130px; height: 130px;">
		</div>
		<div class="col-9 ">
			<nav class="navbar navbar-expand-lg float-end">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Trang Chủ</a></li>

						<li class="nav-item"><a class="nav-link" href="#">Tin Tức</a>
						</li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Danh Mục </a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="#">Bánh sinh nhật</a></li>
								<li><a class="dropdown-item" href="#">Bánh mỳ </a></li>
								<li><a class="dropdown-item" href="#">Bánh tươi </a></li>
								<li><a class="dropdown-item" href="#">Bánh ngọt </a></li>
								<li><a class="dropdown-item" href="#">Bánh quy khô </a></li>
								<li><a class="dropdown-item" href="#">Chocolate</a></li>
								<li><a class="dropdown-item" href="#">Bánh miếng nhỏ </a></li>
								<li><a class="dropdown-item" href="#">Bánh trung thu </a></li>
								<li><a class="dropdown-item" href="#">Bánh truyền thống</a></li>
								<li><a class="dropdown-item" href="#">Bánh mỳ đông lạnh
								</a></li>
								<li><a class="dropdown-item" href="#">Bánh Giáng sinh</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link" href="#">Tài
								Khoản </a></li>
						<li class="nav-item"><a class="nav-link" href="#">Giỏ
								Hàng</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<div class="bottom_header text-center">
		<span class="text-danger h4">Sweet Cake bakery</span>
		<form class="m-auto mt-3" style="width: 50%;" role="search">
			<div class="input-group ">
				<input class="form-control inputSearch" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</div>
		</form>
	</div>
</header>