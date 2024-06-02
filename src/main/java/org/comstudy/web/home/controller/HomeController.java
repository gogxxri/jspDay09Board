package org.comstudy.web.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/app")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String page = req.getParameter("page");
		String viewName="/index.jsp";
		switch(page) {
		case "profile" : viewName = "/WEB-INF/views/profile/profile.jsp"; break;
		case "gallery" : viewName = "/WEB-INF/views/gallery/gallery.jsp"; break;
		case "lecture" : viewName = "/WEB-INF/views/lecture/lecture.jsp"; break;
		case "board" : viewName = "/WEB-INF/views/board/list.jsp"; break;
		
		}
		
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}

}
