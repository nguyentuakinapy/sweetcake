package com.sweetcake.admin;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.SanPham;

@WebServlet({ "/sweetcake/admin/editproduct/*", "/sweetcake/admin/create", "/sweetcake/admin/update",
		"/sweetcake/admin/delete" })
public class EditProductServlet extends HttpServlet {
	private SanPhamDAO spDao = new SanPhamDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SanPham sp = new SanPham();
		try {
			BeanUtils.populate(sp, req.getParameterMap());
			System.out.println(sp.getTenSp());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (req.getServletPath().contains("product")) {
			SanPham sp1 = spDao.findByID(req.getPathInfo().substring(1));
			req.setAttribute("sanpham", sp1);
			req.setAttribute("viewadmin", "/views/admin/sanpham/detailproduct.jsp");
		} else if (req.getServletPath().contains("create")) {

		}
		if (!resp.isCommitted()) {
			req.getRequestDispatcher("/views/admin/layoutAdmin.jsp").forward(req, resp);
		}
	}
}
