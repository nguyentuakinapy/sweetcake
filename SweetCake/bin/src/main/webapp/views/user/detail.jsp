<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<style>
.detail-danger {
	height: auto;
}

.detail-danger img {
	max-height: 500px;
	border-radius: 20% 5%;
	filter: drop-shadow(1px 1px 12px gray);
}
</style>

<div style="border-top: 2px solid #F0EBEA;">
	<div class="container w-75 m-auto mt-5">
		<div class="row">
			<div class="col-5 detail-danger">
				<img
					src="${cakeDetail.hinhAnh}"
					class="w-100" alt="">
			</div>
			<div class="col-7">
				<h3 class="mt-4">${cakeDetail.tenSp}</h3>
				<h5 class="my-3">

					<fmt:formatNumber type="currency" currencySymbol="VND"
						value="${cakeDetail.gia}" />
				</h5>
				<div class="input-group mt-3">
					<button class="btn btn-danger fw-bold px-3">-</button>
					<div style="width: 50px;">
						<input type="text" class="form-control text-center" value="1"
							disabled>
					</div>
					<button class="btn btn-success fw-bold px-3">+</button>
				</div>
				<button class="btn btn-dark px-5 mt-4">Thêm vào giỏ hàng</button>
			</div>
		</div>
		<div>
			<h2 class="text-primary text-center fw-bold mt-4">Sản phẩm liên
				quan</h2>
		</div>
	</div>
</div>