
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="includes/main_start.jsp" %>

   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.*"%>
    <%@ page import="java.sql.*"%>    

 
<br>
 <link rel="stylesheet" type="text/css" href="includes/find_book.css">
<div class="search">
<form method="get"  action="My_servlet">
  <p>Поиск книги по наименованию:</p>
<input type="text" class="q" name="searchBookName"  placeholder="Наименование книги"/>
  <br>
  <input type="Submit" class="s" value="Find" name="submit_book1"/>
  <br>
  <br>
  
  <p>Поиск книги по автору:</p>
  <input type="text" class="t" name="sqlnameautor"  placeholder="Фамилия"/>
<input type="text" class="t" name="contactName"  placeholder="Имя"/>
<br>
<input type="Submit" class="s" value="Find1" name="submit_book1"/>
<br>
<br>

<p>Поиск по издательству:</p>
<input type="text" class="q" name="searchpublishing_house"  placeholder="Наименование издательства"/>
  <br>
  <input type="Submit" class="s" value="Find2" name="submit_book1"/>
  <br>
  <br>
  

  
    <p>Поиск по разделу:</p>
<input type="text" class="q" name="searchsection"  placeholder="Наименование разделу"/>
  <br>
  <input type="Submit" class="s" value="Find3" name="submit_book1"/>
  <br>
  <br>
  
  
</form>
 </div>
   
<br>

<%@include file="includes/main_end.jsp" %>

