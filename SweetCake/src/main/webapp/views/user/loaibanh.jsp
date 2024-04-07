<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<
<style>
.listLoaiBanh:hover {
	color: red;
}

.product-hover img {
	transition: filter 0.8s ease;
}

.product-hover:hover .button-container {
	opacity: 1;
}

.product-hover:hover img {
	filter: blur(2px);
}

.image-container {
	position: relative;
}

.button-container {
	transition: opacity 1s ease;
	opacity: 0;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	position: absolute;
	transition: opacity 0.8s ease;
}
</style>
<div style="border-top: 2px solid #F0EBEA;">
	<div class="container mt-2">
		<div class="row">
			<div class="col-3">
				<ul class="mt-5" style="list-style-type: none;">
					<c:forEach var="lb" items="${lbList}">
						<li><a class="dropdown-item listLoaiBanh"
							href="${url}loaibanh/${lb.maLoaiBanh}"><i
								class="bi bi-check-circle me-2"></i>${lb.tenLoaiBanh}</a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="col-9">
				<h3>${tenLoaiBanh}</h3>
				<div class="row">
					<c:forEach var="sp" items="${spList}">
						<div class="col-md-4 col-sm-6 col-12 text-center product-hover">
							<div class="image-container">
								<img src="${sp.hinhAnh}" class="w-100" alt=""> <a href="#"
									class="text-decoration-none" class="text-primary">${sp.tenSp}<br>
									<em class="text-danger fw-bold"> ${sp.gia} </em>
								</a>
								<div class="button-container d-flex">
									<a class="btn btn-success mx-1"><i
										class="bi bi-currency-dollar"></i></a> <a
										class="btn btn-warning mx-1"><i
										class="bi bi-ticket-detailed"></i></a> <a
										class="btn btn-danger mx-1"><i class="bi bi-bag-plus"></i></a>
								</div>
							</div>

						</div>
					</c:forEach>
				</div>

			</div>
		</div>
	</div>
</div>