package com.sweetcake.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.sweetcake.dao.LoaiBanhDAO;
import com.sweetcake.dao.LoaiBanhDAOImplements;
import com.sweetcake.entity.NguoiDung;

@WebFilter(urlPatterns = "/*")
public class SetUserFilter implements Filter {
	private LoaiBanhDAO lbDao = new LoaiBanhDAOImplements();

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		NguoiDung loggedInUser = (NguoiDung) req.getSession().getAttribute("isloginUs");
		req.setAttribute("lbList", lbDao.findAll());
		if (loggedInUser != null) {
			req.setAttribute("user", loggedInUser);
			req.setAttribute("ttdn", loggedInUser.getHoTen());
		} else {
			req.setAttribute("ttdn", "Tài khoản");
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
