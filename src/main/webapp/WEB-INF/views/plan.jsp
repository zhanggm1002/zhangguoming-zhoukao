<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<!-- 查询 -->
		<form class="form-inline" id="queryForm">
		  <div class="form-group mx-sm-3 mb-2">
		    <input type="text" class="form-control" id="name" name="name" value="${plan.name }" placeholder="请输入项目名称">
		  </div>
		  <input type="hidden" id="pageNum" name="pageNum" value="${pageInfo.pageNum }">
		  <button type="button" class="btn btn-primary mb-2" onclick="query();">查询</button>
		</form>
		<!-- 列表 -->
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col"><input type="checkbox" id="chkALL"></th>
		      <th scope="col">#</th>
		      <th scope="col">项目名称</th>
		      <th scope="col">投资金额</th>
		      <th scope="col">分管领导</th>
		      <th scope="col">分管部分</th>
		      <th scope="col">操作</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${pageInfo.list }" var="item">
			  	<tr>
			      <th scope="row"><input value="${item.id }" type="checkbox" name="chk_list"></th>
			      <th scope="row">${item.id }</th>
			      <td>${item.name }</td>
			      <td>${item.amount }</td>
			      <td>${item.manager }</td>
			      <td>${item.dept_name }</td>
			      <td><button type="button" class="btn btn-primary">查看详情</button></td>
			    </tr>
		  	</c:forEach>
		  </tbody>
		</table>
		<!-- 分页 -->
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		  	<c:if test="${pageInfo.hasPreviousPage }">
	    		 <li class="page-item"><a class="page-link" href="javascript:gotoPage(${pageInfo.pageNum-1 });">前一页</a></li>
	    	</c:if>
		    <c:forEach items="${pageInfo.navigatepageNums }" var="item">
		    	<c:if test="${pageInfo.pageNum==item }">
		    		<li class="page-item active"><a class="page-link active" href="javascript:gotoPage(${item});">${item }</a></li>
		    	</c:if>
		    	<c:if test="${pageInfo.pageNum!=item }">
		    		<li class="page-item"><a class="page-link" href="javascript:gotoPage(${item});">${item }</a></li>
		    	</c:if>
		  	</c:forEach>
		  	<c:if test="${pageInfo.hasNextPage }">
	    		 <li class="page-item"><a class="page-link" href="javascript:gotoPage(${pageInfo.pageNum+1 });">后一页</a></li>
	    	</c:if>
		  </ul>
		</nav>
	</div>
	
</div>
<script src="/public/js/jquery.min.1.12.4.js"></script>	
<script src="/public/js/bootstrap.min.js"></script>
<script src="/public/js/checkbox.js"></script>
<script type="text/javascript">
	function query() {
		//console.log($("#queryForm").serialize());
		$("#queryForm").submit();
		//location.href='/plan?'+$("#queryForm").serialize();
		//location.href='/plan?name='+$("#name").val();
	}
	
	function gotoPage(pageNum) {
		console.log(pageNum);
		$("#pageNum").val(pageNum);
		query();
	}
</script>
</body>
</html>