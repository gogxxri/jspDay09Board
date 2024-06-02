<%@page import="org.comstudy.web.board.model.BoardDAOImpl"%>
<%@page import="org.comstudy.web.board.model.BoardDTO"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Gyuri's page - Gallery</title>
	    <%@ include file="/inc/mainStyle.jsp" %>
	</head>
	<body>
	<div id="root">
	    <div class="container">
	        <!-- top menu -->
	        <jsp:include page = "/inc/top.jsp"></jsp:include>
	        <div id="middle">
	            <!-- side menu -->
	            <jsp:include page = "/inc/leftside.jsp"></jsp:include>
	            
	            <!-- main menu -->
	            <div id="maincontent">
	                <h1>게시글 목록</h1>
	                <div id="listcontent">
	                    <table border ="1">
	                        <thead>
	                            <tr>
	                                <th>번호</th><th>제목</th><th>작성자</th><th>이메일</th><th>날짜</th>
	                            </tr>
	                        </thead>
	                        <tbody id="boardList">
	                            <%
	                                BoardDAOImpl dao = new BoardDAOImpl();
	                                List<BoardDTO> boardList = null;
	                                try {
	                                    boardList = dao.selectAll();
	                                } catch (Exception e) {
	                                    e.printStackTrace();
	                                    out.println("게시글을 불러오는 중 오류가 발생했습니다.");
	                                }
	                                
	                                if (boardList != null) {
	                                    for (BoardDTO board : boardList) {
	                            %>
	                                <tr>
	                                    <td><%= board.getAnum() %></td>
	                                    <td><%= board.getTitle() %></td>
	                                    <td><%= board.getAuthor() %></td>
	                                    <td><%= board.getEmail() %></td>
	                                    <td><%= board.getWriteday() %></td>
	                                </tr>
	                            <% 
	                                    }
	                                }
	                            %>
	                        </tbody>
	                    </table>                    
	                </div>                  
	                <div id="board">
	                    <a href="board/input.do?num=1">글 쓰기</a>
	                    <a href="board/detail.do?num=1">글 상세보기</a>
	                    <a href="board/modify.do?num=1">글 수정</a>
	                    <a href="board/delete.do?num=1">글 삭제</a>
	                </div>
	            </div>
	        </div>
	        <!-- bottom-->
	        <jsp:include page = "/inc/bottom.jsp" ></jsp:include>
	    </div>
	</div>
	</body>
</html>