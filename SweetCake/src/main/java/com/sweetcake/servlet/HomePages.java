package com.sweetcake.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

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
		NguoiDung user;
		if (req.getMethod().equals("POST")) {
			try {
				user = new NguoiDung();
				// TODO Auto-generated method stub
				if (req.getMethod().equals("post")) {
					NguoiDungDAO NDdao = new NguoiDungDAOImplements();
					try {
						NguoiDung user1 = new NguoiDung();
						BeanUtils.populate(user1, req.getParameterMap());
						req.setAttribute("user", user1);
						String repassword = req.getParameter("repassword");
						System.out.print("" + repassword);
						if (user.getMaNguoiDung().equals("")) {
							req.setAttribute("check", "Không để trống tên đăng nhập!");
						} else if (user.getMatKhau().equals("")) {
							req.setAttribute("check", "Không để trống mật khẩu!");
						} else if (user.getHoTen().equals("")) {
							req.setAttribute("check", "Không để trống họ và tên!");
						} else if (user.getEmail().equals("")) {
							req.setAttribute("check", "Không để trống email!");
						} else {
							if (!user.getMatKhau().equals(repassword)) {
								req.setAttribute("check", "Mật khẩu nhập lại không khớp!");
							} else {
								NDdao.create(user);
								req.getSession().setAttribute("loggedInUser", user);
								System.out.println("" + user.getHoTen());
								resp.sendRedirect(req.getContextPath() + "/sweetcake/home");
							}
						}
					} catch (Exception e) {
						resp.sendRedirect(req.getContextPath() + "/sweetcake/home");
					}
				}
			} catch (Exception e) {
				// Xử lý ngoại lệ
				req.setAttribute("check", "Đã xảy ra lỗi: " + e.getMessage());
			}
		}
		req.setAttribute("views", "/views/layout/register.jsp");

	}

	private void doLogin(HttpServletRequest req, HttpServletResponse resp) {
		String username = CookieUtils.get("username", req);
		String password = CookieUtils.get("password", req);

		req.setAttribute("username", username);
		req.setAttribute("password", password);
		if (req.getMethod().equals("POST")) {
			NguoiDungDAO NDdao = new NguoiDungDAOImplements();
			username = req.getParameter("username");
			password = req.getParameter("password");
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
