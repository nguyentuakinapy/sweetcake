<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<div style="border-top: 2px solid #F0EBEA;">
	<div class="container">
		<div class="row mt-2 w-75 m-auto">
			<div class="col-5">
				<div
					class="card d-flex align-items-center justify-content-center mt-5">
					<img
						src="https://file.hstatic.net/1000104153/file/z5217034617446_2874828fadd82545f30380d9302d999b_b7b2336d1fad45d5add2591eb95ea76f_2048x2048.jpg"
						class="w-100">
				</div>
			</div>
			<div class="col-7">
				<div class="h2 text-center mb-3">Đăng ký</div>
				<form method="post">
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Tên
							đăng nhập</label> <input type="text" class="form-control"
							id="exampleFormControlInput1" placeholder="Thanhsaumui">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Họ
							và tên</label> <input type="text" class="form-control"
							id="exampleFormControlInput1">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Email</label>
						<input type="email" class="form-control"
							id="exampleFormControlInput1">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Mật
							khẩu</label> <input type="password" class="form-control"
							id="exampleFormControlInput1">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Nhập
							lại mật khẩu</label> <input type="password" class="form-control"
							id="exampleFormControlInput1">
					</div>
					<div class="row d-flex">
						<div class="col-6 forch">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="flexCheckDefault"> <label class="form-check-label"
									for="flexCheckDefault">Nhớ mật khẩu </label>
							</div>
						</div>
						<div class="col-6 quen text-end">
							<a href="" class="fw-bold">Đăng nhập</a>
						</div>
					</div>
					<div class="text-center mt-5">
						<button type="button" style="border-radius: 20px;"
							class="btn btn-primary px-5">Đăng ký</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>