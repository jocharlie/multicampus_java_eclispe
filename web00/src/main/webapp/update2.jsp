<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest();
    	//car.run(); //부품은 소문자로!!!
    	String no = request.getParameter("no");
    	String content = request.getParameter("content");//no=100 주소 받을때는 어떻게 해야하나?
		//String 변수를 만들어주어야한다.
		//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
		
		//1. 받은 데이터를 dao에게 주기 위하여 가방을 만들어서 넣자.!!!!!!!!
	
	BbsVO bag = new BbsVO();
	bag.setNo(Integer.parseInt(no));
	bag.setContent(content);
	
	//2. dao에게 가방을 전달하면서 insert해달라고 하자.!
	
	BbsDAO dao = new BbsDAO();
	dao.update(bag);
		
		
		
		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 수정을 원하는 번호는  <%= no %>
당신이 수정을 원하는 contents는  <%= content %>
</body>
</html>