<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>NFT Arts</title>
</head>
<body>
	<h1>Welcome to NFT Arts</h1>
	<c:out value="${name}"></c:out>
	<br>
	<a href="/nft/new">Add Art</a>
	<br>
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Description</th>
				<th>URL</th>
			</tr>
			<c:forEach items="${arts}" var="art">
				<tr>
					<td><c:out value="${art.id}"></c:out></td>
					<td><c:out value="${art.title}"></c:out></td>
					<td><c:out value="${art.description}"></c:out></td>
					<td><c:out value="${art.url}"></c:out></td>
				</tr>
			</c:forEach>
		</thead>
	</table>
	<br>
	<img alt="" src="/images/rocky-mountain-np1.jpg">
</body>
</html>