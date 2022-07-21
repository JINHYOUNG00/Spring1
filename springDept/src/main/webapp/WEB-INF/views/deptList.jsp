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
<h3>부서 리스트</h3>
<table border="1">
   <tbody>
      <c:forEach var="deptlist" items="${list}"  varStatus="status">
      <tr>
         <td>${deptlist.department_id}</td>
         <td>${deptlist.department_name}</td>
         <td>${deptlist.manager_id}</td>
         <td>${deptlist.location_id}</td>
      </tr>
      </c:forEach>
   </tbody>
</table>
</body>
</html>