package com.sweetcake.user;

import java.io.IOException;
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
import java.util.List;

/**
 * Servlet implementation class SanPhamServlet
 */
@WebServlet({ "/sweetcake/product/list", "/sweetcake/product/detail" })
public class SanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoaiBanhDAO lbDao = new LoaiBanhDAOImplements();

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SanPhamDAO spdao = new SanPhamDAOImplements();
		String path = req.getServletPath();
		req.setAttribute("lbList", lbDao.findAll());

		if (path.contains("list")) {
			List<SanPham> products = spdao.listSP();
			products.forEach(f -> {
				System.out.println(f.getTenSp());
			});
			req.setAttribute("list", products);
			req.setAttribute("views", "/views/user/list.jsp");
		} else {
//				if (path.contains("detail")) {
//				String videoId = req.getPathInfo().substring(1);
//				Video video = vdao.findById(videoId);
//				req.setAttribute("video", video);
			//
//				User user = (User) req.getSession().getAttribute("user");
////				List<Favorite> favorites = fdao.findByUsername(user.getId());
//				List<Favorite> favorites = fdao.findByUsername("myntd");
//				req.setAttribute("favorites", favorites);
//				req.setAttribute("page", "video/detail.jsp");
		}

		req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);
	}

}
