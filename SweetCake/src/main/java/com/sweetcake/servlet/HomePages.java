package com.sweetcake.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.LoaiBanhDAO;
import com.sweetcake.dao.LoaiBanhDAOImplements;
import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.SanPham;
import com.sweetcake.utils.JpaUtils;

@WebServlet({ "/sweetcake/home", "/sweetcake/product", "/sweetcake/search", "/sweetcake/login", "/sweetcake/register",
		"/sweetcake/logout", "/sweetcake/category" })
public class HomePages extends HttpServlet {
	private SanPhamDAO spDao = new SanPhamDAOImplements();
	private LoaiBanhDAO lbDao = new LoaiBanhDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<SanPham> spList = spDao.findAll();
		spList.forEach(f -> {
			System.out.println(f.getTenSp());
		});
		if (req.getServletPath().contains("home")) {
			this.doHome(req, resp);
		} else if (req.getServletPath().contains("product")) {
			this.doProduct(req, resp);
		} else if (req.getServletPath().contains("search")) {
			this.doSearch(req, resp);
		} else if (req.getServletPath().contains("login")) {
			this.doLogin(req, resp);
		} else if (req.getServletPath().contains("register")) {
			this.doRegister(req, resp);
		} else if (req.getServletPath().contains("logout")) {
			this.doLogOut(req, resp);
		} else if (req.getServletPath().contains("category")) {
			this.doCategory(req, resp);
		}

		req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);
	}

	private void doCategory(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doLogOut(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doRegister(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doLogin(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doSearch(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doProduct(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doHome(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("lbList", lbDao.findAll());

		req.setAttribute("views", "/views/layout/main.jsp");
	}
}
