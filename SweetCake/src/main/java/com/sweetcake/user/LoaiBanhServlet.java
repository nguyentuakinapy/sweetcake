package com.sweetcake.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.LoaiBanhDAO;
import com.sweetcake.dao.LoaiBanhDAOImplements;
import com.sweetcake.entity.LoaiBanh;
import com.sweetcake.entity.SanPham;

@WebServlet("/sweetcake/loaibanh/*")
public class LoaiBanhServlet extends HttpServlet {
	LoaiBanhDAO lbDao = new LoaiBanhDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getServletPath().contains("loaibanh")) {
			Integer maLoaiBanh = Integer.parseInt(req.getPathInfo().substring(1));
			LoaiBanh lb = lbDao.findByID(maLoaiBanh);
			List<SanPham> spList = lb.getSpList();
			req.setAttribute("spList", spList);
			req.setAttribute("lbList", lbDao.findAll());
			req.setAttribute("views", "/views/user/loaibanh.jsp");
		}
		req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);

	}
}
