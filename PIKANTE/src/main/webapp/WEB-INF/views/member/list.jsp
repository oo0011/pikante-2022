<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>포지션</th>
				<th>생년월일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td id="c-text">${list.number}</td>
					<td id="c-text">${list.name}</td>
					<td id="c-text">${list.position}</td>
					<td id="c-text">${list.birthday}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
