<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Enrollments</title>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>

</head>


<body>
	<h2>List of Films</h2>
	<table>
		<tr>
			<td>id</td>
			<td>title</td>
			<td>poster</td>
			<td>description</td>
			<td>linkTrailer</td>
			<td>edit</td>
			<td>delete</td>
		</tr>
		<c:forEach items="${films}" var="film">
			<tr>
				<td>${film.id}</td>
				<td>${film.title}</td>
				<td><img  src= "data:image/jpeg;bytes,${film.poster}"/></td>
				<td>${film.description}</td>
				<td><a href="<c:url value='${film.linkTrailer}' />">link</a></td>
				<td><a href="<c:url value='/films/edit-${film.id}-film' />">edit</a></td>
				<td><a href="<c:url value='/films/delete-${film.id}-film' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="<c:url value='/films/addFilm' />">Add New Film</a> <br/>
	<a href="<c:url value="/logout" />">Logout</a>

</body>
</html>