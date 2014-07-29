<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Employee administration</title>
</head>
<body>
<h1>
	This page is for managing employees.  
</h1>

<form:form method="POST" action="/springapp/addEmployee">
    <table>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
        <td></td>
    </tr>
    <tr>
        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id" /></td>
        <td>
            <input type="submit" value="Add new Employye"/>
        </td>
    </tr>
</table>  
</form:form>

<form:form method="GET" action="/springapp/showEmployee">
<table>
    <tr>
    <td>
    	<input type="submit" value="Show Employees"/>
    </td>
    </tr>
</table>  
</form:form>
</body>
</html>
