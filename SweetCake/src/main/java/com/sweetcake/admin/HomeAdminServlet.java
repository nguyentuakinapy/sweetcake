package com.sweetcake.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.HoaDonDAO;
import com.sweetcake.dao.HoaDonDAOImplements;
import com.sweetcake.dao.LoaiBanhDAO;
import com.sweetcake.dao.LoaiBanhDAOImplements;
import com.sweetcake.dao.NguoiDungDAO;
import com.sweetcake.dao.NguoiDungDAOImplements;
import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.HoaDon;
import com.sweetcake.entity.LoaiBanh;
import com.sweetcake.entity.NguoiDung;
import com.sweetcake.entity.SanPham;

@WebServlet({ "/sweetcake/admin/home", "/sweetcake/admin/listproduct", "/sweetcake/admin/billproduct",
		"/sweetcake/admin/listnguoidung", "/sweetcake/admin/category" })
public class HomeAdminServlet extends HttpServlet {
	private SanPhamDAO spDao = new SanPhamDAOImplements();
	private NguoiDungDAO ndDao = new NguoiDungDAOImplements();
	private LoaiBanhDAO lbDao = new LoaiBanhDAOImplements();
	private HoaDonDAO hdDao = new HoaDonDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getServletPath().contains("listproduct")) {
			this.doListProduct(req, resp);
		} else if (req.getServletPath().contains("billproduct")) {
			this.doBillProduct(req, resp);
		} else if (req.getServletPath().contains("listnguoidung")) {
			this.doListNguoiDung(req, resp);
		} else if (req.getServletPath().contains("category")) {
			this.doCategory(req, resp);
		}
		if (!resp.isCommitted()) {
			req.getRequestDispatcher("/views/admin/layoutAdmin.jsp").forward(req, resp);
		}
	}

	private void doCategory(HttpServletRequest req, HttpServletResponse resp) {
		List<LoaiBanh> lbList = lbDao.findAll();
		req.setAttribute("lbList", lbList);
		req.setAttribute("viewadmin", "/views/admin/layout/listloaibanh.jsp");
	}

	private void doListNguoiDung(HttpServletRequest req, HttpServletResponse resp) {
		List<NguoiDung> ndList = ndDao.findAll();
		req.setAttribute("ndList", ndList);
		req.setAttribute("viewadmin", "/views/admin/layout/listnguoidung.jsp");
	}

	private void doBillProduct(HttpServletRequest req, HttpServletResponse resp) {
		List<HoaDon> hdList = hdDao.findAll();
		req.setAttribute("hdList", hdList);
		req.setAttribute("viewadmin", "/views/admin/layout/listhoadon.jsp");
	}

	private void doListProduct(HttpServletRequest req, HttpServletResponse resp) {
		List<SanPham> spList = spDao.findAll();
		req.setAttribute("spList", spList);

		req.setAttribute("viewadmin", "/views/admin/layout/listproduct.jsp");
	}
}
