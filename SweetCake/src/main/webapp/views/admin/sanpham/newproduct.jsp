<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<main class="app-content">
	<div class="app-title">
		<ul class="app-breadcrumb breadcrumb side">
			<li class="breadcrumb-item active"><a href="#"><b>Thêm
						mới sản phẩm</b></a></li>
		</ul>
		<div id="clock"></div>
	</div>

	<form class="tile" method="post">
		<div class="d-flex justify-content-between">
			<button class="btn btn-add" formaction="${url}admin/create">
				Thêm mới</button>
			<a class="btn btn-success" href="${url}admin/listproduct">Quay
				lại</a>
		</div>
		<div class="mb-3">
			<label class="form-label">Mã sản phẩm</label> <input type="text"
				name="maSp" value="${maSp}" class="form-control"
				placeholder="Mã sản phẩm ..." readonly="readonly">
		</div>
		<div class="mb-3">
			<label class="form-label">Tên sản phẩm</label> <input type="text"
				class="form-control" placeholder="Tên sản phẩm ..." name="tenSp"
				value="${sanpham.tenSp}">
		</div>
		<div class="mb-3">
			<label class="form-label">Mô tả</label> <input type="text"
				class="form-control" placeholder="Mô tả sản phẩm ..." name="moTa"
				value="${sanpham.moTa}">
		</div>
		<div class="mb-3">
			<label class="form-label">Hạn sử dụng</label> <input type="date"
				placeholder="yyyy-MM-dd" class="form-control" name="date"
				value="${sanpham.date}">
		</div>
		<div class="mb-3">
			<label class="form-label">Giá bán</label> <input type="text"
				class="form-control" placeholder="Giá ..." name="gia"
				value="${sanpham.gia}">
		</div>
		<div class="mb-3">
			<label class="form-label">Hình ảnh</label> <input type="text"
				class="form-control" placeholder="Hình ảnh ..." name="hinhAnh"
				value="${sanpham.hinhAnh}">
		</div>
		<div class="mb-3">
			<label class="form-label">Trạng thái</label> <input type="text"
				class="form-control" placeholder="Hình ảnh ..." name="trangThai"
				value="${sanpham.trangThai}">
		</div>
		<div class="mb-3">
			<label class="form-label">Loại bánh</label> <select name="maloaiBanh"
				class="form-select">
				<c:forEach var="lb" items="${lbList}">
					<option value="${lb.maLoaiBanh}">${lb.tenLoaiBanh}</option>
				</c:forEach>
			</select>
		</div>
	</form>

</main>