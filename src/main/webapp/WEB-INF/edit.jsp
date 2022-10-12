<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Edit Art</title>
</head>
<body>

	<form:form action="/nft/update/${art.id}" method="put" modelAttribute="art">
	    <div class="row mb-3">
	        <form:label path="title" class="col-sm-2 col-form-label">Title</form:label>
	        <div>
		        <form:input path="title" class="form-control"/>
	        </div>
	        <form:errors path="title" class="text-danger"/>
	    </div>
	    <div class="row mb-3">
	        <form:label path="description" class="col-sm-2 col-form-label">Description</form:label>
	        <div>
		        <form:input path="description" class="form-control"/>
	        </div>
	        <form:errors path="description" class="text-danger"/>
	    </div>
	    <div class="row mb-3">
	        <form:label path="url" class="col-sm-2 col-form-label">url</form:label>
	        <div>
		        <form:input path="url" class="form-control"/>
	        </div>
	        <form:errors path="url" class="text-danger"/>
	    </div>
	    <button class="btn btn-primary">Update Art</button>
	</form:form>

</body>
</html>