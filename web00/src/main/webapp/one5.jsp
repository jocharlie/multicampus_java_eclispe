

<%@page import="multi.MUSICVO"%>
<%@page import="multi.MUSICDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	MUSICDAO dao = new MUSICDAO();
    	MUSICVO bag2 = dao.one(id);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 번호는 <%= id %>
<hr color="red">
 <table class="table table-dark table-striped">
 	<tr>
 		<td>음악 아이디</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>음악제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>작곡가</td>
 		<td><%= bag2.getArtist() %></td>
 	</tr>
 	<tr>
 		<td>음악이미지</td>
 		<td><%= bag2.getImg() %></td>
 	</tr>
 	<tr>
 		<td>음악내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	
 </table>
</body>
</html>