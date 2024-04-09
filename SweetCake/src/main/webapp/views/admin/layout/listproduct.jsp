<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<main class="app-content">
	<div class="app-title">
		<ul class="app-breadcrumb breadcrumb side">
			<li class="breadcrumb-item active"><a href="#"><b>Danh
						sách sản phẩm</b></a></li>
		</ul>
		<div id="clock"></div>
	</div>

	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<div class="tile-body">

					<div class="row element-button">
						<div class="col-sm-2">
							<a class="btn btn-add btn-sm" href="${url}admin/create"
								title="Thêm"><i class="fas fa-plus"></i> Thêm bánh</a>
						</div>
						<div class="col-sm-2">
							<a class="btn btn-delete btn-sm nhap-tu-file" type="button"
								title="Nhập" onclick="myFunction(this)"><i
								class="fas fa-file-upload"></i> Tải từ file</a>
						</div>

						<div class="col-sm-2">
							<a class="btn btn-delete btn-sm print-file" type="button"
								title="In" onclick="myApp.printTable()"><i
								class="fas fa-print"></i> In dữ liệu</a>
						</div>
						<div class="col-sm-2">
							<a class="btn btn-delete btn-sm print-file js-textareacopybtn"
								type="button" title="Sao chép"><i class="fas fa-copy"></i>
								Sao chép</a>
						</div>

						<div class="col-sm-2">
							<a class="btn btn-excel btn-sm" href="" title="In"><i
								class="fas fa-file-excel"></i> Xuất Excel</a>
						</div>
						<div class="col-sm-2">
							<a class="btn btn-delete btn-sm pdf-file" type="button"
								title="In" onclick="myFunction(this)"><i
								class="fas fa-file-pdf"></i> Xuất PDF</a>
						</div>
						<div class="col-sm-2">
							<a class="btn btn-delete btn-sm" type="button" title="Xóa"
								onclick="myFunction(this)"><i class="fas fa-trash-alt"></i>
								Xóa tất cả</a>
						</div>
					</div>
					<form method="post">
						<table class="table table-hover table-bordered js-copytextarea"
							cellpadding="0" cellspacing="0" border="0" id="sampleTable">
							<thead>
								<tr>
									<th width="10"><input type="checkbox" id="all"></th>
									<th width="180">Tên bánh</th>
									<th width="60">Ảnh</th>
									<th width="300">Mô tả</th>
									<th width="120">Hạn sử dụng</th>
									<th width="90">Giá</th>
									<th width="80">Trạng thái</th>
									<th width="150">Loại bánh</th>
									<th width="100">Khác</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="sp" items="${spList}">
									<tr>
										<td width="10"><input type="checkbox" name="check1"
											value="1"></td>
										<td>${sp.tenSp}</td>
										<td><img class="w-100" src="${sp.hinhAnh}" /></td>
										<td>${sp.moTa}</td>
										<td>${sp.date}</td>
										<td><fmt:formatNumber value="${sp.gia}" type="number" />đ</td>
										<td>${sp.trangThai == 1 ? "Còn hàng" : "Hết hàng"}</td>
										<td>${sp.loaiBanh.tenLoaiBanh}</td>
										<td class="table-td-center text-center"><button
												class="btn btn-primary btn-sm trash" type="button"
												title="Xóa">
												<i class="fas fa-trash-alt"></i>
											</button> <a class="btn btn-primary btn-sm edit"
											href="${url}admin/editproduct/${sp.maSp}" type="button"
											title="Sửa" id="show-emp" data-toggle="modal"
											data-target="#ModalUP"> <i class="fas fa-edit"></i>
										</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</main>