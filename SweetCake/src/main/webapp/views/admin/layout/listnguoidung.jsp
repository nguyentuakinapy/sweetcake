<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<main class="app-content">
	<div class="app-title">
		<ul class="app-breadcrumb breadcrumb side">
			<li class="breadcrumb-item active"><a href="#"><b>Danh
						sách người dùng</b></a></li>
		</ul>
		<div id="clock"></div>
	</div>

	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<div class="tile-body">

					<div class="row element-button">
						<div class="col-sm-2">

							<a class="btn btn-add btn-sm" href="#" title="Thêm"><i
								class="fas fa-plus"></i> Tạo mới</a>
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
					<table class="table table-hover table-bordered js-copytextarea"
						cellpadding="0" cellspacing="0" border="0" id="sampleTable">
						<thead>
							<tr>
								<th width="10"><input type="checkbox" id="all"></th>
								<th width="150">Tên đăng nhập</th>
								<th width="100">Mật khẩu</th>
								<th width="300">Họ và tên</th>
								<th width="120">Giới tinh</th>
								<th width="90">Email</th>
								<th width="80">Số điện thoại</th>
								<th width="150">Vai trò</th>
								<th width="100">Địa chỉ</th>
								<th width="100">Khác</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="nd" items="${ndList}">
								<tr>
									<td width="10"><input type="checkbox" name="check1"
										value="1"></td>
									<td>${nd.maNguoiDung}</td>
									<td>${nd.matKhau}</td>
									<td>${nd.hoTen}</td>
									<td>${nd.gioiTinh == 0 ? "Nam" : "Nữ"}</td>
									<td>${nd.email}</td>
									<td>${nd.soDienThoai}</td>
									<td>${nd.vaiTro == 1 ? "Admin" : "Khách hàng"}</td>
									<td>${nd.diaChi}</td>
									<td class="table-td-center text-center"><button
											class="btn btn-primary btn-sm trash" type="button"
											title="Xóa">
											<i class="fas fa-trash-alt"></i>
										</button>
										<button class="btn btn-primary btn-sm edit" type="button"
											title="Sửa" id="show-emp" data-toggle="modal"
											data-target="#ModalUP">
											<i class="fas fa-edit"></i>
										</button></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</main>