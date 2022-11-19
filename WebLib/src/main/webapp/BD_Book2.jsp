<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
	<%@include file="home_start.jsp" %>
<%ResultSet RS = (ResultSet) request.getAttribute("MBC");%>


<table border = "1" width = "100%">
<tr>


	<th>Название книги</th>
	<th>Автор</th>
</tr>
<style>
.button-wrapper{
  float: right;	
  style = "color: #0000f0;";
}
</style>

<%
		try {
			while(RS.next()){%><tr><th><%
				out.println (RS.getString ("book.title"));%></th><th><%
			    out.println (RS.getString ("NEW"));%></th></tr><%
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}%>
		 
</table>

<!--
<form action = "My_servlet">-->
		<!--<button value = "Return"   name = "act" >Назад</button>-->
		<button >Назад</button>
		<div class="button-wrapper">
     	<!--	<button value = "Add"  name = "act" >Добавить</button>-->
		<button>Добавить</button>
		</div>
<!--
</form>-->


