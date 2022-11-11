<%@ page import="javax.swing.JOptionPane"%>
<%@ page import="javax.swing.*"%>


<%@ page import="java.sql.Connection"%>
<%@ page import="LibWeb5.my_base_class"%>
<%@ page import="java.sql.PreparedStatement"%>

<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");	//нужен для нормального чтения русского при вводе
String user=request.getParameter("username");

my_base_class.insertPublishingHouseInDB(user, "city001");

System.out.println("user::"+user);

response.sendRedirect("index3.html");


my_base_class.selectAuthor();

%>
</body>
</html>