package com.sweetcake.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.SanPham;

@WebServlet("/sweetcake/loadmore")
public class LoadMore extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SanPhamDAO spDao = new SanPhamDAOImplements();

		List<SanPham> sp = spDao.findTop3(Integer.parseInt(req.getParameter("amount")));
		PrintWriter out = resp.getWriter();
		sp.forEach(s -> {
			out.println("<div class=\"col-md-4 my-3 countproduct\">\r\n" + "		<div class=\"card \">\r\n"
					+ "			<div class=\"card-body\">\r\n" + "				<a\r\n"
					+ "					href=\"${pageContext.request.contextPath}/fm/video/detail/" + s.getMaSp()
					+ "\">\r\n" + "					<img class=\"img-fluid\" src=\"" + s.getHinhAnh() + "\">\r\n"
					+ "				</a>\r\n" + "			</div>\r\n" + "\r\n"
					+ "			<div class=\"card-footer\" style=\"height: 80px\">\r\n"
					+ "				<span class=\"text-primary\">" + s.getTenSp() + "<br> <em\r\n"
					+ "					class=\"text-danger fw-bold\">" + s.getGia() + "</em>\r\n"
					+ "				</span>\r\n" + "			</div>\r\n" + "		</div>\r\n" + "	</div>");
		});
	}
}