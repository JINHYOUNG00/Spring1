<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사원 리스트</h3>
<table border="1">
	<thead>
		<tr>
			<th>employee_id</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>salary</th>
		</tr>
	</thead>
   <tbody>
      <c:forEach var="emplist" items="${list}"  varStatus="status">
      <tr>
         <td>${emplist.employee_id}</td>
         <td>${emplist.first_name}</td>
         <td>${emplist.last_name}</td>
         <td>${emplist.salary}</td>
      </tr>
      </c:forEach>
   </tbody>
</table>
</body>
</html>