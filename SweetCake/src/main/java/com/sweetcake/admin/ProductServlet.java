package com.sweetcake.admin;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import com.sweetcake.dao.LoaiBanhDAO;
import com.sweetcake.dao.LoaiBanhDAOImplements;
import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.LoaiBanh;
import com.sweetcake.entity.SanPham;

@WebServlet({ "/sweetcake/admin/editproduct/*", "/sweetcake/admin/listproduct", "/sweetcake/admin/create",
		"/sweetcake/admin/update", "/sweetcake/admin/newproduct" })
public class ProductServlet extends HttpServlet {
	private SanPhamDAO spDao = new SanPhamDAOImplements();
	private LoaiBanhDAO lbDao = new LoaiBanhDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<SanPham> spList;
		SanPham sp = new SanPham();
		try {
			DateConverter converter = new DateConverter();
			converter.setPattern("yyyy-MM-dd");
			ConvertUtils.register(converter, Date.class);

			BeanUtils.populate(sp, req.getParameterMap());
			String maLoaiBanh = req.getParameter("maloaiBanh");
			if (maLoaiBanh != null) {
				int lb = Integer.parseInt(maLoaiBanh);
				if (sp.getLoaiBanh() == null) {
					sp.setLoaiBanh(new LoaiBanh());
				}
				sp.getLoaiBanh().setMaLoaiBanh(lb);
			}
			System.out.println(req.getParameter("maloaiBanh"));
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.setAttribute("lbList", lbDao.findAll());

		if (req.getServletPath().contains("listproduct")) {
			spList = spDao.findAll();
			req.setAttribute("spList", spList);

			req.setAttribute("viewadmin", "/views/admin/layout/listproduct.jsp");
		} else if (req.getServletPath().contains("product")) {
			SanPham sp1 = spDao.findByID(req.getPathInfo().substring(1));
			req.setAttribute("sanpham", sp1);
			req.setAttribute("viewadmin", "/views/admin/sanpham/detailproduct.jsp");
		} else if (req.getServletPath().contains("newproduct")) {
			this.newProduct(req, resp);
		} else if (req.getServletPath().contains("create")) {
			spDao.create(sp);
			resp.sendRedirect(req.getContextPath() + "/sweetcake/admin/listproduct");
			return;
		} else if (req.getServletPath().contains("update")) {
			spDao.update(sp);
			resp.sendRedirect(req.getContextPath() + "/sweetcake/admin/listproduct");
			return;
		}
		if (!resp.isCommitted()) {
			req.getRequestDispatcher("/views/admin/layoutAdmin.jsp").forward(req, resp);
		}
	}

	private void newProduct(HttpServletRequest req, HttpServletResponse resp) {
		List<SanPham> spCheck = spDao.findAll();
		String maSp = spCheck.get(spCheck.size() - 1).getMaSp();
		String subString = maSp.substring(2);
		int maSpCount = Integer.parseInt(subString) + 1;
		if (maSpCount < 100) {
			req.setAttribute("maSp", "SP0" + maSpCount);
		} else {
			req.setAttribute("maSp", "SP" + maSpCount);
		}
		System.out.println(maSpCount);
		req.setAttribute("viewadmin", "/views/admin/sanpham/newproduct.jsp");
	}

//	public boolean checkDetailProduct(HttpServletRequest req, HttpServletResponse resp, SanPham sp) {
//		if (sp.getTenSp().equals("")) {
//			
//		} else if (sp.getMoTa().equals("")) {
//
//		} else if (sp.getDate().equals("")) {
//
//		} else if (sp.getGia() == 0) {
//
//		} else if (sp.getHinhAnh().equals("")) {
//
//		}
//		return false;
//	}
}
