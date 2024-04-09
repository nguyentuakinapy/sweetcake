package com.sweetcake.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.NguoiDungDAO;
import com.sweetcake.dao.NguoiDungDAOImplements;
import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.NguoiDung;

import com.sweetcake.utils.CookieUtils;

@WebServlet({ "/sweetcake/home", "/sweetcake/product", "/sweetcake/search", "/sweetcake/login", "/sweetcake/register",
		"/sweetcake/logout", "/sweetcake/category" })
public class HomePages extends HttpServlet {
	private SanPhamDAO spDao = new SanPhamDAOImplements();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		if (!resp.isCommitted()) {
			req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);
		}
	}

	private void doCategory(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doLogOut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().invalidate();
		resp.sendRedirect(req.getContextPath() + "/sweetcake/home");
		return;
	}

	private void doRegister(HttpServletRequest req, HttpServletResponse resp) {

		req.setAttribute("views", "/views/layout/register.jsp");
	}

	private void doLogin(HttpServletRequest req, HttpServletResponse resp) {
		if (req.getMethod().equals("POST")) {
			NguoiDungDAO NDdao = new NguoiDungDAOImplements();
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			if (!username.isEmpty() && !password.isEmpty()) {
				try {
					NguoiDung user = NDdao.findByID(username);
					if (user != null && user.getMatKhau().equals(password)) {
						req.getSession().setAttribute("isloginUs", user);
						int hours = (req.getParameter("remember") == null) ? 0 : 30 * 24;
						CookieUtils.add("username", username, hours, resp);
						CookieUtils.add("password", password, hours, resp);
						if (user.getVaiTro() == 1) {
							resp.sendRedirect(req.getContextPath() + "/sweetcake/admin/home");
						} else {
							resp.sendRedirect(req.getContextPath() + "/sweetcake/home");
						}
						return;
					} else {
						req.setAttribute("check", "Thông tin đăng nhập không đúng");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				req.setAttribute("check", "Vui lòng không để trống !");
			}
		}
		req.setAttribute("views", "/views/layout/login.jsp");
	}

	private void doSearch(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doProduct(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

	}

	private void doHome(HttpServletRequest req, HttpServletResponse resp) {

		req.setAttribute("views", "/views/layout/main.jsp");
	}
}
