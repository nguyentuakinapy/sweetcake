<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Sweet Cake Bakery | Quản trị Admin</title>
<c:set var="url" value="${pageContext.request.contextPath}/sweetcake/"
	scope="request"></c:set>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Main CSS-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/views/admin/css/css.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
<!-- or -->
<link rel="stylesheet"
	href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
<!-- Font-icon css-->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">

</head>

<body onload="time()" class="app sidebar-mini rtl">
	<!-- Navbar-->
	<header class="app-header">
		<!-- Sidebar toggle button-->
		<a class="app-sidebar__toggle" href="#" data-toggle="sidebar"
			aria-label="Hide Sidebar"></a>
		<!-- Navbar Right Menu-->
		<ul class="app-nav">


			<!-- User Menu-->
			<li><a class="app-nav__item" href="${url}logout"><i
					class='bx bx-log-out bx-rotate-180'></i> </a></li>
		</ul>
	</header>
	<!-- Sidebar menu-->
	<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
	<aside class="app-sidebar">
		<div class="app-sidebar__user">
			<img class="app-sidebar__user-avatar"
				src="https://theme.hstatic.net/1000104153/1001164818/14/logo.png?v=62"
				width="50px" alt="User Image">
			<div>
				<p class="app-sidebar__user-name">
					<b>${user.hoTen}</b>
				</p>
				<p class="app-sidebar__user-designation">Chào mừng bạn trở lại</p>
			</div>
		</div>
		<hr>
		<ul class="app-menu">
			<li><a class="app-menu__item " href="${url}admin/billproduct"><i
					class='app-menu__icon bx bx-cart-alt'></i> <span
					class="app-menu__label">Hóa đơn</span></a></li>
			<li><a class="app-menu__item " href="${url}admin/listproduct"><i
					class='app-menu__icon bx bx-tachometer'></i><span
					class="app-menu__label">Sản phẩm</span></a></li>
			<!--  actice -->
			<li><a class="app-menu__item" href="${url}admin/category"><i
					class='app-menu__icon bx bx-id-card'> </i> <span
					class="app-menu__label">Loại bánh</span></a></li>
			<li><a class="app-menu__item" href="${url}admin/listnguoidung"><i
					class='app-menu__icon bx bx-user-voice'></i><span
					class="app-menu__label">Người dùng</span></a></li>
			<li><a class="app-menu__item" href="#"><i
					class='app-menu__icon bx bx-purchase-tag-alt'></i><span
					class="app-menu__label">Thống kê</span></a></li>
			<li><a class="app-menu__item" href="#"><i
					class='app-menu__icon bx bx-task'></i><span class="app-menu__label">Đơn
						hàng</span></a></li>

			<li><a class="app-menu__item" href="${url}home"><i
					class='app-menu__icon bx bx-run'></i><span class="app-menu__label">Về
						trang chủ </span></a></li>
		</ul>
	</aside>
	<main>
		<jsp:include page="${viewadmin}"></jsp:include>
	</main>


	<!--
  MODAL
-->
	<div class="modal fade" id="ModalUP" tabindex="-1" role="dialog"
		aria-hidden="true" data-backdrop="static" data-keyboard="false">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">

				<div class="modal-body">
					<div class="row">
						<div class="form-group  col-md-12">
							<span class="thong-tin-thanh-toan">
								<h5>Chỉnh sửa thông tin nhân viên cơ bản</h5>
							</span>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-6">
							<label class="control-label">Mã nhân viên</label> <input
								class="form-control" type="text" required value="#CD2187"
								disabled>
						</div>
						<div class="form-group col-md-6">
							<label class="control-label">Họ và tên</label> <input
								class="form-control" type="text" required value="Võ Trường">
						</div>
						<div class="form-group  col-md-6">
							<label class="control-label">Số điện thoại</label> <input
								class="form-control" type="number" required value="09267312388">
						</div>
						<div class="form-group col-md-6">
							<label class="control-label">Địa chỉ email</label> <input
								class="form-control" type="text" required
								value="truong.vd2000@gmail.com">
						</div>
						<div class="form-group col-md-6">
							<label class="control-label">Ngày sinh</label> <input
								class="form-control" type="date" value="15/03/2000">
						</div>
						<div class="form-group  col-md-6">
							<label for="exampleSelect1" class="control-label">Chức vụ</label>
							<select class="form-control" id="exampleSelect1">
								<option>Bán hàng</option>
								<option>Tư vấn</option>
								<option>Dịch vụ</option>
								<option>Thu Ngân</option>
								<option>Quản kho</option>
								<option>Bảo trì</option>
								<option>Kiểm hàng</option>
								<option>Bảo vệ</option>
								<option>Tạp vụ</option>
							</select>
						</div>
					</div>
					<BR> <a href="#"
						style="float: right; font-weight: 600; color: #ea0000;">Chỉnh
						sửa nâng cao</a> <BR> <BR>
					<button class="btn btn-save" type="button">Lưu lại</button>
					<a class="btn btn-cancel" data-dismiss="modal" href="#">Hủy bỏ</a>
					<BR>
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>
	<!--
  MODAL
-->

	<!-- Essential javascripts for application to work-->
	<!-- <script src="js/jquery-3.2.1.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>-->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	-->
	<!-- <script src="src/jquery.table2excel.js"></script>
  <script src="js/main.js"></script> 

  <script src="js/plugins/pace.min.js"></script> -->
	<!-- Page specific javascripts-->
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script> -->
	<!-- Data table plugin-->
	<!-- <script type="text/javascript" src="js/plugins/jquery.dataTables.min.js"></script>
  <script type="text/javascript" src="js/plugins/dataTables.bootstrap.min.js"></script> -->
	<script>
    function deleteRow(r) {
      var i = r.parentNode.parentNode.rowIndex;
      document.getElementById("myTable").deleteRow(i);
    }
    jQuery(function () {
      jQuery(".trash").click(function () {
        swal({
          title: "Cảnh báo",

          text: "Bạn có chắc chắn là muốn xóa nhân viên này?",
          buttons: ["Hủy bỏ", "Đồng ý"],
        })
          .then((willDelete) => {
            if (willDelete) {
              swal("Đã xóa thành công.!", {

              });
            }
          });
      });
    });
    // oTable = $('#sampleTable').dataTable();
    // $('#all').click(function (e) {
    //   $('#sampleTable tbody :checkbox').prop('checked', $(this).is(':checked'));
    //   e.stopImmediatePropagation();
    // });


    //Thời Gian
    function time() {
      var today = new Date();
      var weekday = new Array(7);
      weekday[0] = "Chủ Nhật";
      weekday[1] = "Thứ Hai";
      weekday[2] = "Thứ Ba";
      weekday[3] = "Thứ Tư";
      weekday[4] = "Thứ Năm";
      weekday[5] = "Thứ Sáu";
      weekday[6] = "Thứ Bảy";
      var day = weekday[today.getDay()];
      var dd = today.getDate();
      var mm = today.getMonth() + 1;
      var yyyy = today.getFullYear();
      var h = today.getHours();
      var m = today.getMinutes();
      var s = today.getSeconds();
      m = checkTime(m);
      s = checkTime(s);
      nowTime = h + " giờ " + m + " phút " + s + " giây";
      if (dd < 10) {
        dd = '0' + dd
      }
      if (mm < 10) {
        mm = '0' + mm
      }
      today = day + ', ' + dd + '/' + mm + '/' + yyyy;
      tmp = '<span class="date"> ' + today + ' - ' + nowTime +
        '</span>';
      document.getElementById("clock").innerHTML = tmp;
      clocktime = setTimeout("time()", "1000", "Javascript");

      function checkTime(i) {
        if (i < 10) {
          i = "0" + i;
        }
        return i;
      }
    }
    //In dữ liệu
    var myApp = new function () {
      this.printTable = function () {
        var tab = document.getElementById('sampleTable');
        var win = window.open('', '', 'height=700,width=700');
        win.document.write(tab.outerHTML);
        win.document.close();
        win.print();
      }
    }
    //Sao chép dữ liệu
    var copyTextareaBtn = document.querySelector('.js-textareacopybtn');

    copyTextareaBtn.addEventListener('click', function (event) {
      var copyTextarea = document.querySelector('.js-copytextarea');
      copyTextarea.focus();
      copyTextarea.select();

      try {
        var successful = document.execCommand('copy');
        var msg = successful ? 'successful' : 'unsuccessful';
        console.log('Copying text command was ' + msg);
      } catch (err) {
        console.log('Oops, unable to copy');
      }
    });


    //Modal
    $("#show-emp").on("click", function () {
      $("#ModalUP").modal({ backdrop: false, keyboard: false })
    }); 
  </script>
</body>

</html>