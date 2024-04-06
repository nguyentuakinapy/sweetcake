<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<div class="container">
	<div class="row">
		<div class="col-6" style="border-right: 2px solid #000;">
			<div class="card" style="width: 18rem;">
				<img
					src="https://upload.wikimedia.org/wikipedia/en/b/bd/Doraemon_character.png"
					class="card-img-top" alt="Doraemon">
			</div>
		</div>
		<div class="col-6">
			<div class="h2 text-center mb-3">Đăng nhập</div>
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
							for="flexCheckDefault"> Nhớ mật khẩu </label>
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
		</div>
	</div>
</div>