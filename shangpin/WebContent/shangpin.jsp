<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%-- <%
	Cookie[] cookies = request.getCookies();
	String val = "";
	if(cookies != null){
	for(Cookie cookie : cookies ){
		if(cookie.getName().equals("name")){
			val = cookie.getValue();
		}
	}
	}
%> --%>
	<form action="${pageContext.request.contextPath}/qServlet" method="post">
		<table>
			<tr>
				<td>姓名</td>
				<td><input type ="text" name ="name" ></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type ="password" name ="password"></td>
			</tr>
			<!-- <tr>
				<td>数量</td>
				<td><input type ="text" name ="num"></td>
			</tr> -->
			<tr><td><input type = "submit" value= "确认"></td></tr>
		</table>
	</form>
</body>
</html>