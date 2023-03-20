<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
   <!-- 브라우저가 보낸 데이터를 받아야함.==> 자바로 짜야함! -->
   <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함.==> 자바로 짜야함! -->
   
        <!-- 1. 전달된 값 받아주세요.(request이용) -->
   <!-- 2. dao에게 값 전달.(DAO이용) 생략 -->
   <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요.-->
   
   
	<% 
	//자바코드 넣는 부분!!
	//HttpServletRequest request = new HttpServletRequest();
	//tomcat은 미리 request를 만들어서 내장시켜놨어요!
	
	/* String id = request.getParameter("id"); //"apple"
	String title = request.getParameter("title"); //"1234"
	String content = request.getParameter("content"); //"1234"
	String location = request.getParameter("location"); //"1234"
	String director = request.getParameter("director"); //"1234"
	*/
	
	
	
	//1. 받은 데이터를 dao에게 주기 위하여 가방을 만들어서 넣자.!!!!!!!!
	
	/*MovieVO bag = new MovieVO();
	
	bag.setId(id);
	bag.getTitle(title);
	bag.setContent(content);
	bag.setLocation(location);
	bag.Director(director);
	*/
	
	//2. dao에게 가방을 전달하면서 insert해달라고 하자.!
	
	MovieDAO dao = new MovieDAO();
	dao.insert(bag);
	
	
	%> 
	
	<!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background: lime;
}
</style>
</head>
<body>
무비무비무비무비무비~!<br>
<hr color="red">


</body>
</html>