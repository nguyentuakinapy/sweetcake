<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<div style="border-top: 2px solid #F0EBEA;" class="mt-2">
	<div class="container">
		<div class="row mt-2 w-75 m-auto">
			<div class="col-5">
				<div
					class="card d-flex align-items-center justify-content-center mt-5">
					<img
						src="https://theme.hstatic.net/1000104153/1001164818/14/home_category_2_banner.jpg?v=62"
						class="w-100">
				</div>
			</div>
			<div class="col-7">
				<form method="post">
					<div class="h2 text-center mb-3">Đăng nhập</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Tên
							người dùng</label> <input type="text" class="form-control"
							id="exampleFormControlInput1" placeholder="Thanhsaumui"
							value="${username}" name="username">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Mật
							khẩu</label> <input type="password" name="password" class="form-control"
							value="${password}" id="exampleFormControlInput1">
					</div>
					<div class="row d-flex">
						<div class="col-6 forch">
							<div class="form-check">
								<input class="form-check-input" name="remember" type="checkbox"
									value="" id="flexCheckDefault"> <label
									class="form-check-label" for="flexCheckDefault"> Nhớ
									mật khẩu </label>
							</div>
						</div>
						<div class="col-6 quen text-end">
							<a href="${url}forgotpassword">Quên mật khẩu</a>
						</div>
						<h6>${check}</h6>
					</div>
					<div class="text-center mt-5">
						<button type="submit" style="border-radius: 20px;"
							class="btn btn-primary px-5">Đăng nhập</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>