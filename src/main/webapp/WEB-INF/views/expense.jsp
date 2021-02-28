<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}">
</c:set>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Expense</h1>

	<%-- 	<form:form action="{contextRoot}/expense" method="post"
		modelAttribute="expense">
 --%>

	<form:form action="${contestRoot}/expense" method="post"
		modelAttribute="expense">

		<form:hidden path="id" />
		<form:input path="expenseName" placeholder="Enter Expense Name" />
		<form:input path="amount" placeholder="Enter Expense Amount" />
		<form:input path="note" placeholder="Enter note (optional)" />

		<button type="submit">Add Expense</button>
	</form:form>

	<a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
</body>
</html>