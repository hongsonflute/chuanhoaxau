<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chuẩn hóa xâu ký tự</title>
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<style>
  .fakeimg {
      height: 200px;
      background: #aaa;
  }
  </style>
</head>
<body>
	
	<%	
		String in=null;
		String kq=null;
		String rong=null;
		request.getAttribute("ketqua");
		kq=(String) request.getAttribute("ketqua");
		
		request.getAttribute("dauvao");
		in=(String) request.getAttribute("dauvao");
		
		request.getAttribute("rong");
		rong=(String) request.getAttribute("rong");
	%>
	

<jsp:include page="header.jsp"></jsp:include>

<div class="container" style="margin-top:30px">
  <div class="row">
    <div class="col-sm-4">
      <h2>About Us</h2>
      <h5>Nhóm số 10 - KTPM2</h5>
      <div class="fakeimg"><image  src="https://www.cbronline.com/wp-content/uploads/2017/10/AI-coder-770x513.jpg" width="350px" height="200px"></image></div>
      <p>Some text about me in culpa qui officia deserunt mollit anim..</p>
      <h3>Some Links</h3>
      <p>Lorem ipsum dolor sit ame.</p>
      <ul class="nav nav-pills flex-column">
        <li class="nav-item">
          <a class="nav-link active" href="#">Active</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#">Disabled</a>
        </li>
      </ul>
      <hr class="d-sm-none">
    </div>
    <div class="col-sm-8">
    
    
      <h4>CHUẨN HÓA VĂN BẢN</h4>
      <form action="chuanhoaController" method="post">
      <b>Nội dung cần chuẩn hóa:</b><%if(rong!=null){%><p style="color:red"><%=rong%></p><%}%>
      <textarea style="border-radius:5px " rows="8" cols="100" name="input" ><%if(in!=null){%><%=in%><%}%></textarea>
      <br>
      <input class="btn btn-primary" type="submit" value="Chuẩn hóa ">
      <a href="<%=request.getContextPath()%>/index.jsp" class="btn btn-primary">Xóa Trắng</a><br>
      <b>Kết quả chuẩn hóa:</b>
      <textarea style="border-radius:5px " rows="8" cols="100" name="input"><%if(kq!=null){%><%=kq%><%}%></textarea>
      <br>
      </form>

    </div>
  </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>