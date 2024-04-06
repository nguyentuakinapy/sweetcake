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
import javax.servlet.http.HttpServletResponse;

import com.sweetcake.entity.NguoiDung;

@WebFilter(urlPatterns = { "/sweetcake/admin/*" })
public class BlockUserFilter implements Filter {
	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		NguoiDung user = (NguoiDung) req.getSession().getAttribute("isloginUs");
		if (user == null) {
			resp.sendRedirect(req.getContextPath() + "/sweetcake/home");
		} else {
			if (user.getVaiTro() != 1) {
				resp.sendRedirect(req.getContextPath() + "/sweetcake/home");
			} else {
				chain.doFilter(request, response);
			}
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
