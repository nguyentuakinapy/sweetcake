<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<
<style>
.listLoaiBanh:hover {
	color: red;
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
						<div class="col-md-4 col-sm-6 col-12 text-center">
							<a href="#" class="text-decoration-none"> <img
								src="${sp.hinhAnh}" class="w-100" alt=""> <span
								class="text-primary">${sp.tenSp}<br> <em
									class="text-danger fw-bold"> ${sp.gia} </em>
							</span>
							</a>
						</div>
					</c:forEach>
				</div>

			</div>
		</div>
	</div>
</div>