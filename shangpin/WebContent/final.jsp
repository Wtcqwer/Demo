<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>商品</td>
				<td>${s.name}</td>
			</tr>
			<tr>
				<td>单价</td>
				<td>${s.price}</td>
			</tr>
			<tr>
				<td>数量</td>
				<td>${s.num}</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>${a.name}</td>
			</tr>
			<tr>
				<td>手机号</td>
				<td>${a.phone}</td>
			</tr>
			<tr>
				<td>地址</td>
				<td>${a.adr}</td>
			</tr>
			<tr>
				<td>
					总金额
				</td>
				<td>
					${s.price*s.num}
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>