<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>Home</title>
	<link href="${path}/resources/CSS/home.css" rel="stylesheet"/>     
</head>
<body>
    
    <header class="home__header">
    <h1 class="header__title">PIKANTE</h1>
    <p class="header__text">Futsal Club</p>
    </header>
    
    <form action="/main/mainview" id="login-form">
        <input type="text" placeholder="PhoneNumber">
        <input type="password" placeholder="password">    
        <input class="login__button" type="submit" value="Log In">     
    </form>
    
    <div class="login-a">   
     <a href="#">회원가입</a>
     <a>|</a>
     <a href="#">아이디/비밀번호 찾기</a>    
    </div>
</body>
</html>
