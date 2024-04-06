package com.sweetcake.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/sweetcake/admin/home", "/sweetcake/admin/editproduct" })
public class HomeAdminServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getServletPath().contains("editproduct")) {
			req.setAttribute("viewadmin", "/views/admin/editsanpham.jsp");
		}
		if (!resp.isCommitted()) {
			req.getRequestDispatcher("/views/admin/layoutAdmin.jsp").forward(req, resp);
		}
	}
}
