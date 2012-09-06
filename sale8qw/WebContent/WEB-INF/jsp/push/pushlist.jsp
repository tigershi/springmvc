<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/admin.css"></c:url>" />
<title>Insert title here</title>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">

<div class="page" id="page">
	<div class="position">
		<span class="title">push列表</span>
		<a href="" class="img button-48">返回</a>
		<a href="">添加push</a>		
	</div>
	<div class="tabbox">
	<form
			action=""
			method="post" name="form1" >		
		<table class="bg pic-list">

			<col class="data-50px"/>
			<col class="data-30px"/>
			<col class="data-100px"/>
	        <col class="data-60px"/>
			<col class="data-80px"/>
			<col class="data-80px"/>
			<col class="data-80px"/>
			<col class="data-80px"/>
			<col class="data-80px"/>
			<col class="data-auto"/>
		
				<tr>
					<th class="text-center">顺序</th>
					<th class="text-center">ID</th>
					<th class="text-center">标题</th>
					<th class="text-center">客户端</th>
					<th class="text-center">类型</th>
					<th class="text-center">push频率</th>
					<th class="text-center">开始时间</th>
					<th class="text-center">启用状态</th>
					<th class="text-center">发送状态</th>
					<th class="text-center">操作</th>
				</tr>
				<c:forEach  items="pushList" var="push">
				<tr>
					<td class="text-center">
					
					</td>
					<td class="text-center">  </td>  
					<td class="text-center"> </td> 
					<td class="text-center">
					
					
					 
					</td>
					<td class="text-center">
					
				
					
					</td>
					<td class="text-center">
					
				
				
					</td>
					<td class="text-center">
					
					</td>
					<td class="text-center">
					
					</td>
					<td class="text-center">
			
					<td class="text-center"></td>
					<td class="text-center action">
					<a href="">编辑</a>
					<a href="">删除</a>
					</td>
						</tr>
				</c:forEach>
				
				
				
		</table>
		</form>
	</div>
</div>
</body>
<script type="text/javascript">

</script>
</html>
</body>
</html>