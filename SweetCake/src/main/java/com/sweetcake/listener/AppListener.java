package com.sweetcake.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class AppListener implements ServletContextListener, HttpSessionListener {
	int onlineVisitors = 0;

//  Khi ứng dụng tắt đi
//	servlet
	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

//  Khi ứng dụng khởi động
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		onlineVisitors = 0;
	}

//  Khi có người vào website
//	http
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		onlineVisitors++;

		ServletContext applicationScope = se.getSession().getServletContext();
		applicationScope.setAttribute("visitors", onlineVisitors);
	}

//  Khi có người rời website
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		onlineVisitors--;

		ServletContext applicationScope = se.getSession().getServletContext();
		applicationScope.setAttribute("visitors", onlineVisitors);
	}
}
