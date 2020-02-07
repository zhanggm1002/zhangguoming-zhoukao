<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
	<div class="col-8 offset-2" style="margin-top: 30px;">
	
		<form class="form-inline">
		  <div class="form-group mx-sm-3 mb-2">
		    <input type="text" class="form-control" id="inputPassword2" placeholder="请输入项目名称">
		  </div>
		  <button type="submit" class="btn btn-primary mb-2">查询</button>
		</form>
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col"><input type="checkbox"></th>
		      <th scope="col">#</th>
		      <th scope="col">项目名称</th>
		      <th scope="col">投资金额</th>
		      <th scope="col">分管领导</th>
		      <th scope="col">分管部分</th>
		      <th scope="col">操作</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <th scope="row"><input type="checkbox"></th>
		      <th scope="row">1</th>
		      <td>项目1</td>
		      <td>12.00</td>
		      <td>领导1</td>
		      <td>部分1</td>
		      <td><button type="button" class="btn btn-primary">查看详情</button></td>
		    </tr>
		    <tr>
		      <th scope="row"><input type="checkbox"></th>
		      <th scope="row">1</th>
		      <td>项目1</td>
		      <td>12.00</td>
		      <td>领导1</td>
		      <td>部分1</td>
		      <td><button type="button" class="btn btn-primary">查看详情</button></td>
		    </tr>
		    <tr>
		      <th scope="row"><input type="checkbox"></th>
		      <th scope="row">1</th>
		      <td>项目1</td>
		      <td>12.00</td>
		      <td>领导1</td>
		      <td>部分1</td>
		      <td><button type="button" class="btn btn-primary">查看详情</button></td>
		    </tr>
		  </tbody>
		</table>
		
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
		    <li class="page-item"><a class="page-link" href="#">1</a></li>
		    <li class="page-item"><a class="page-link" href="#">2</a></li>
		    <li class="page-item"><a class="page-link" href="#">3</a></li>
		    <li class="page-item"><a class="page-link" href="#">Next</a></li>
		  </ul>
		</nav>
	</div>
	
</div>
<script src="/public/js/jquery.min.1.12.4.js"></script>	
<script src="/public/js/bootstrap.min.js"></script>
</body>
</html>