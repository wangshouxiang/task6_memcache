<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>学生信息表</title>
</head>
<body>
 <%-- <json:object>
     <json:property name="studentName" value="${student.studentName}"/>  
     <json:property name="studentProfession" value="${student.studentProfession}"/>  
 </json:object> --%>
 
 	<%-- <form action="${pageContext.request.contextPath}/" method=post> --%>
	<form>
		<table width="100%" border=1>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>入学日期</td>
				<td>学习日期</td>
			</tr>
			<c:set value="${student}" var="student" />
				<tr>
					<td>${student.studentId}</td>
					<td>${student.studentName}</td>
					<td>${student.studentAge}</td>
					<%-- <td><fmt:formatDate value="${student.createAt}" pattern="yyyy-MM-dd HH-mm-ss"/></td> --%>
					<%-- <td><fmt:formatDate value="${student.updateAt}" pattern="yyyy-MM-dd HH-mm-ss"/></td> --%>					
				    <td>${student.createAt} </td>
				    <td>${student.updateAt} </td>
				</tr>
		</table>
	</form>
</body>
</html>