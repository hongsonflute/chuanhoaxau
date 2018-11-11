<%@page import="model.user"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>header page</title>
</head>
<body>


<%
	user u=null;
	if(session.getAttribute("user")!=null)
	{
		u=(user)session.getAttribute("user");
	}

%>
<div style="padding:0px 0px; margin-bottom: -16px;"  class="jumbotron text-center" style="margin-bottom:0">
  <h1>Chuẩn Hóa Văn Bản</h1>
  <p>Chuẩn hóa xâu ký tự theo cách của bạn!!!</p> 
</div>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 <div class="container">
  <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">Trang Chủ</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
    
    <%
    if(u!=null){%>
    	<li class="nav-item">
        <a class="nav-link">Xin chào, <%=u.getUserName() %></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logoutController">Đăng Xuất</a>
      </li>
    <%}
    else
    {%>
    <li class="nav-item">
        <a class="nav-link" href="register.jsp">Đăng Ký</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.jsp">Đăng Nhập</a>
      </li>
    <%} 
    %>
      <li class="nav-item">
        <a class="nav-link" href="huongdan.jsp">Hướng Dẫn</a>
      </li>
       
    </ul>
  </div> 
  </div> 
</nav>




</body>
</html>