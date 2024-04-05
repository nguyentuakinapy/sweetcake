<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sweet Cake Bakery</title>
</head>
<!-- BOOTSTRAPS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<!-- ICON -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<c:set var="url"
	value="${pageContext.request.contextPath}/nguyentuakina/"
	scope="request"></c:set>
<c:set var="urlimg" value="${pageContext.request.contextPath}/images/"
	scope="request"></c:set>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/style.css">
<body>
	<jsp:include page="/views/layout/header.jsp"></jsp:include>
	<jsp:include page="${views}"></jsp:include>
	<jsp:include page="/views/layout/footer.jsp"></jsp:include>
</body>

</html>