<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- 브라우저가 보낸 데이터를 받아야함.==> 자바로 짜야함! -->
   <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함.==> 자바로 짜야함! -->
	<% 
	//자바코드 넣는 부분!!
	//HttpServletRequest request = new HttpServletRequest();
	//tomcat은 미리 reqyest를 만들어서 내장시켜놨어요!
	String id = request.getParameter("id"); //"apple"
	String pw = request.getParameter("pw"); //"1234"
	String name = request.getParameter("name"); //"apple"
	String tel = request.getParameter("tel"); //"010"
	
	//가방을 만들어서 값들을 넣고!
	//jsp에서 자동 Import - 해당클래스 클릭한 다음 컨트롤 + 쉬프트 + m
	MemberVO bag = new MemberVO();
	bag.setId(id);
	bag.setPw(pw);
	bag.setName(name);
	bag.setTel(tel);
	
	//dao에게 가방을 전달하자.!
	MemberDAO3 dao = new MemberDAO3();
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
회원가입 요청되었음.
<hr color="red">
가입한 id : <%= id %> <br>
가입한 pw : <%= pw %> <br>
가입한 name : <%= name %> <br>
가입한 tel : <%= tel %> <br>
</body>
</html>