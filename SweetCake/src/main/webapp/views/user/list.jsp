<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="text-center h3 text-primary mt-4">
		<span>Sản Phẩm Mới</span>
	</div>
	<div class="row">
		<c:forEach var="sp" items="${list}">
			<div class="col-md-4 my-3">
				<div class="card " >
					<div class="card-body">
						<a href="${pageContext.request.contextPath}/fm/video/detail/${v.id}">
							<img class="img-fluid"
								src="${sp.hinhAnh}">
						</a>
					</div>

					<div class="card-footer" style="height:80px">
						<span class="text-primary">${sp.tenSp}
					  	<br>
					  	<em class="text-danger fw-bold"> ${sp.gia}</em> </span>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
		
	<div class="view text-center mt-5">
		<button class=" btn btn-danger">Xem thêm</button>
	</div>
	</div>
</body>
</html>