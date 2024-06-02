<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<%@ include file="/inc/mainStyle.jsp" %>
<style>
    .form-group {
        margin-bottom: 15px;
        border: none;
    }
    .form-label {
        display: inline-block;
        width: 100px;
        text-align: right;
        margin-right: 10px;
        border: none;
    }
    .form-control {
        width: 200px;
    }
    .form-action {
        margin-left: 120px;
        border: none;
    }
</style>
</head>
<body>
    <div id="root">
        <div class="container">
            <!-- top menu -->
            <jsp:include page="/inc/top.jsp"></jsp:include>
            <div id="middle">
                <!-- side menu -->
                <jsp:include page="/inc/leftside.jsp"></jsp:include>
                
                <!-- main content -->
                <div id="maincontent">
                    <h1>게시글 작성</h1>
                    <div id="formcontent">
                        <form action="<%= request.getContextPath() %>/board/submit.do" method="post">
                            <div class="form-group">
                                <label for="author" class="form-label">작성자 :</label>
                                <input type="text" class="form-control" id="author" name="author"/>
                            </div>
                            <div class="form-group">
                                <label for="email" class="form-label">전자메일 :</label>
                                <input type="text" class="form-control" id="email" name="email"/>
                            </div>
                            <div class="form-group">
                                <label for="title" class="form-label">제목 :</label>
                                <input type="text" class="form-control" id="title" name="title"/>
                            </div>
                            <div class="form-group">
                                <label for="content" class="form-label">내용 :</label>
                                <input type="text" class="form-control" id="content" name="content"/>
                            </div>
                            <div class="form-group">
                                <label for="password" class="form-label">비밀번호 :</label>
                                <input type="password" class="form-control" id="password" name="password"/>
                            </div>
                            <div class="form-action">
                                <button type="submit" onclick="location.href='<%= request.getContextPath() %>/board/list.do'">작성</button>
                                <button type="button" onclick="location.href='<%= request.getContextPath() %>/board/list.do'">목록으로 돌아가기</button>
                            </div>
                        </form>
                    </div>          
                </div>
            </div>
            <!-- bottom-->
            <jsp:include page="/inc/bottom.jsp"></jsp:include>
        </div>
    </div>
</body>
</html>