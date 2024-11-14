<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empowering Your Business with Cutting-Edge Digital
	Marketing</title>
<link rel="stylesheet"
	href="<%=application.getContextPath()%>/css/styles.css">
</head>
<body>

	<h1>Empowering Your Business with Cutting-Edge Digital Marketing</h1>
	<h4>At Pulse Digital, we help brands thrive in a digital-first
		world. From SEO to social media, our strategies drive results that
		matter.</h4>

	<div>
		<h3>Login Form</h3>
		<form action="<%=application.getContextPath()%>/third" method="post">
			<input type="text" placeholder="Enter yout username" name="username" />
			<button type="submit">Submit</button>
		</form>
		<br />
	</div>

	<script type="text/javascript"
		src="<%=application.getContextPath()%>/javascript/script.js"></script>

</body>
</html>