<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>学生职业表</title>
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
				<td>职业ID</td>
				<td>职业名称</td>
			</tr>
			<c:set value="${profession}" var="profession" />
				<tr>
					<td>${profession.professionId}</td>
					<td>${profession.professionName}</td>
					
					
				</tr>
		</table>
	</form>
</body>
</html>