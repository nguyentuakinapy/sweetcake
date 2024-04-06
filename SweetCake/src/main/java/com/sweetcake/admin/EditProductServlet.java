package com.sweetcake.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.SanPham;

@WebServlet("/sweetcake/admin/editproduct/*")
public class EditProductServlet extends HttpServlet {
	private SanPhamDAO spDao = new SanPhamDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getServletPath().contains("product")) {
			SanPham sp = spDao.findByID(req.getPathInfo().substring(1));
			req.setAttribute("sanpham", sp);
			req.setAttribute("viewadmin", "/views/admin/sanpham/detailproduct.jsp");
		}
		if (!resp.isCommitted()) {
			req.getRequestDispatcher("/views/admin/layoutAdmin.jsp").forward(req, resp);
		}
	}
}
