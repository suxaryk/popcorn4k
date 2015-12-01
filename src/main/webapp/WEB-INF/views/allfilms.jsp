<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Admin panel</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<h2 align="center">Admin panel</h2>
	<a href="<c:url value="/logout" />" class="btn btn-danger btn-sm pull-right"  role="button" >Sign out</a>
	<br/>
	<table class="table table-striped">
		<thead>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>poster</th>
			<th>description</th>
			<th>linkTrailer</th>
			<th>edit</th>
			<th>delete</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${films}" var="film">
			<tr>
				<td>${film.id}</td>
				<td>${film.title}</td>
				<td><img  src= "data:image/gif;charset=utf-8;base64,${film.poster}"/></td>
				<td>${film.description}</td>
				<td><a href="<c:url value='${film.linkTrailer}' />">link</a></td>
				<td><a href="<c:url value='/films/edit-${film.id}-film' />" class="btn btn-success btn-sm ">edit</a></td>
				<td><a href="<c:url value='/films/delete-${film.id}-film' />"  class="btn btn-danger btn-sm " >delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/films/addFilm' />" class="btn btn-primary btn-sm" >Add New Film</a> <br/>

</div>

</body>
</html>
