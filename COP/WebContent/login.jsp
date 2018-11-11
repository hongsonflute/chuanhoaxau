<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<title>Login Page</title>
</head>
<body>
<%
	String msg=null;
	if(request.getAttribute("erroLogin")!=null)
	{
		 msg=(String)request.getAttribute("erroLogin");
	}
	
%>
	<jsp:include page="header.jsp"></jsp:include>
	<div  class="container" style="margin-top:30px">
	<div class="container-fluid">
	
	<form action="loginController" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Username" name="username">
    <small id="emailHelp" class="form-text text-muted"><span style="color:red"><%if(msg!=null){%><%=msg%><%}%></span></small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Đăng Nhập</button>
</form>

	</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>