<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest();
    	//car.run(); //부품은 소문자로!!!
    	String no = request.getParameter("no"); //no=100 주소 받을때는 어떻게 해야하나?
		//String 변수를 만들어주어야한다.
		//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
		BbsDAO dao = new BbsDAO();
	    dao.delete(Integer.parseInt(no));
		
		
		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 삭제를 원하는 번호는  <%= no %>
</body>
</html>