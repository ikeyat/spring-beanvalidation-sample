<!DOCTYPE html>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todo List</title>
<style type="text/css">
.strike {
    text-decoration: line-through;
}
.error-input {
    border-color: #b94a48;
    margin-left: 5px;
}
</style>
</head>
<body>
    <h1>Todo List</h1>
    <div id="todoForm">
        <form:form
           action="${pageContext.request.contextPath}/todo/create"
            method="post" modelAttribute="todoForm">
            <form:input path="todoTitle" cssErrorClass="error-input" />
            <form:errors path="todoTitle" />
            <br />
            <form:input path="confirmTodoTitle" cssErrorClass="error-input" />
            <form:errors path="confirmTodoTitle" />
            <br />
            <form:button>Create Todo</form:button>
        </form:form>
    </div>
</body>
</html>