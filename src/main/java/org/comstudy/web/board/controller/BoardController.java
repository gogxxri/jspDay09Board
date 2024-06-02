package org.comstudy.web.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy.web.board.model.BoardDAOImpl;
import org.comstudy.web.board.model.BoardDTO;


@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String mkUrlPattern(HttpServletRequest req) {
		String reqUri = req.getRequestURI();
		String ctxPath = req.getContextPath();
		int i = ctxPath.length();
		String urlPattern= reqUri.substring(i);
		
		
		return urlPattern;
	}
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String urlPattern = mkUrlPattern(req);
		System.out.println("urlPattern : " + urlPattern);
		
		String viewName = "/WEB-INF/views/board/list.jsp";
		
		switch(urlPattern) {
		
		case "/board/input.do" : 
			viewName = "/WEB-INF/views/board/insert.jsp";
			 break;
		case "/board/detail.do" : 
			viewName = "/WEB-INF/views/board/select.jsp";
			break;
		case "/board/modify.do" : 
			viewName = "/WEB-INF/views/board/update.jsp";
			break;
		case "/board/delete.do" : 
			viewName = "/WEB-INF/views/board/delete.jsp";
			break;
		default : viewName = "/WEB-INF/views/board/list.jsp";
		}
		
		//viewName으로 forward
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String urlPattern = mkUrlPattern(req);
	    System.out.println("urlPattern : " + urlPattern);

	    String viewName = "/WEB-INF/views/board/list.jsp";

	    switch (urlPattern) {
	        case "/board/input.do":
	            // 게시글 작성 로직 추가
	            insertBoard(req, resp);
	            viewName = "/WEB-INF/views/board/list.jsp";
	            break;
	        default:
	            viewName = "/WEB-INF/views/board/list.jsp";
	    }

	    // viewName으로 forward
	    RequestDispatcher view = req.getRequestDispatcher(viewName);
	    view.forward(req, resp);
	}

	private void insertBoard(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    // 게시글 삽입 로직 구현
	    // BoardDTO 객체 생성 및 사용자 입력 받아서 설정
	    BoardDTO board = new BoardDTO();
	    board.setAuthor(req.getParameter("author"));
	    board.setEmail(req.getParameter("email"));
	    board.setTitle(req.getParameter("title"));
	    board.setContent(req.getParameter("content"));
	    board.setPassword(req.getParameter("password"));

	    // BoardDAOImpl 객체 생성
	    BoardDAOImpl dao = new BoardDAOImpl();
	    
	    // BoardDAOImpl의 insert 메서드 호출하여 데이터베이스에 게시글 삽입
	    dao.insert(board);
	}

}
