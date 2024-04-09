<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<style>
.nav-head {
	color: #5c2321;
	font-weight: bold;
	font-size: 14px;
}

.nav-head:hover a {
	color: red;
}
</style>
<header class="container" style="box-shadow: 20px gray;">
	<div class="center_header text-center row mt-3">
		<div class="col-2">
			<a href="${url}home"><img
				src="https://theme.hstatic.net/1000104153/1001164818/14/logo.png?v=62"
				alt="" style="width: 130px; height: 130px;"></a>
		</div>

		<div
			class="col-7 d-flex align-items-center justify-content-center py-0">
			<!-- Thay đổi col-5 thành col-6 -->
			<nav class="navbar navbar-expand-lg">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav m-auto mb-2 mb-lg-0">
						<li class="nav-item nav-head"><a class="nav-link"
							aria-current="page" href="${url}home"><i
								class="bi bi-house me-2"></i>Trang Chủ</a></li>
						<li class="nav-item nav-head"><a class="nav-link"
							href="${url}product/list"><i class="bi bi-cake2 me-2"></i>Sản
								phẩm</a></li>
						<li class="nav-item dropdown nav-head"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"><i
								class="bi bi-card-list me-2"></i>Danh Mục</a>
							<ul class="dropdown-menu">
								<c:forEach var="lb" items="${lbList}">
									<li><a class="dropdown-item"
										href="${url}loaibanh/${lb.maLoaiBanh}">${lb.tenLoaiBanh}</a></li>
								</c:forEach>
							</ul></li>
						<li class="nav-item dropdown nav-head"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"><i
								class="bi bi-person-circle me-2"></i>${ttdn}</a>
							<ul class="dropdown-menu">
								<c:if test="${ttdn == 'Tài khoản'}">
									<li><a class="dropdown-item" href="${url}register">Đăng
											ký</a></li>
									<li><a class="dropdown-item" href="${url}login">Đăng
											nhập</a></li>
									<li><a class="dropdown-item" href="${url}forgotpassword">Quên
											mật khẩu</a></li>
									<li>
								</c:if>
								<c:if test="${ttdn != 'Tài khoản'}">
									<li><a class="dropdown-item" href="${url}logout">Đăng
											xuất</a></li>
									<li><a class="dropdown-item" href="">Đổi mật khẩu</a></li>
									<li><a class="dropdown-item" href="">Cập nhật tài
											khoản</a></li>
								</c:if>
								<c:if test="${isloginUs.vaiTro == 1}">
									<li><a class="dropdown-item" href="${url}admin/home">Quản lý</a></li>
								</c:if>
							</ul></li>
						<li class="nav-item nav-head"><a class="nav-link" href="${url}cart"><i
								class="bi bi-bag-check me-2"></i>Giỏ Hàng</a></li>
					</ul>
				</div>
			</nav>
		</div>
		<div
			class="col-3 d-flex align-items-center justify-content-center py-0">
			<!-- Thay đổi col-4 thành col-3 -->
			<div class="bottom_header text-center">
				<form class="m-auto" role="search">
					<div class="input-group m-0">
						<input class="form-control inputSearch" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">
							<i class="bi bi-search"></i>
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</header>