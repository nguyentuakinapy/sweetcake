package com.sweetcake.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.dao.SanPhamDAO;
import com.sweetcake.dao.SanPhamDAOImplements;
import com.sweetcake.entity.SanPham;
import com.sweetcake.utils.JpaUtils;

@WebServlet("/home")
public class HomePages extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManager em = JpaUtils.getEntityManager();
		SanPhamDAO spDao = new SanPhamDAOImplements();
		List<SanPham> spList = spDao.findAll();
		spList.forEach(f -> {
			System.out.println(f.getTenSp());
		});
	}
}
