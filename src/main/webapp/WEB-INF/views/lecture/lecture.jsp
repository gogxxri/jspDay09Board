<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Gyuri's page - Lecture</title>
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
					<h2>lecture</h2>
					<p>렉처어</p>
				</div>
			</div>
			<!-- bottom-->
			<jsp:include page = "/inc/bottom.jsp" ></jsp:include>
		</div>
	</div>
	</body>
</html>