<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="${pageContext.request.contextPath}/resources/jquery/jquery-3.1.0.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/jquery/uploadImage.js"></script>
<style>
.thumb {
	height: 75px;
	width: 75px;
	border: 1px solid #000;
	margin: 10px 5px 0 0;
}
</style>
</head>
<body>
	<form:form method="post" action="uploadPhoto" modelAttribute="fileUploadForm"
		enctype="multipart/form-data">
		<input type="file" id="files" name="files" multiple />
		<input type="submit" value="Upload" />
	</form:form>
</body>
</html>