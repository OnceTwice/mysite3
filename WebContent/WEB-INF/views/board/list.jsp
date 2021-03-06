<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>mysite3</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link href="${pageContext.request.contextPath }/assets/css/board.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
	
		<c:import url="/WEB-INF/views/includes/header.jsp" />
		
		<div id="content">
			<div id="board">
			
				<form id="search_form" action="${pageContext.request.contextPath }/board?a=search" method="get">
					<input type="text" id="kwd" name="kwd" value="">
					<input type="submit" value="찾기">
				</form>
				
				<table class="tbl-ex">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>조회수</th>
						<th>작성일</th>
						<th>&nbsp;</th>
					</tr>
					
					<c:forEach items="${list }" var="vo">
						<tr>
							<td>${vo.no }</td>			<!-- 번호 -->
							<td class="left"> <a href="${pageContext.request.contextPath }/board?a=view&no=${vo.no }">${vo.title }</a> </td>	<!-- 제목 -->
							<td>${vo.users_name }</td>	<!-- 글쓴이 -->
							<td>${vo.hit }</td>			<!-- 조회수 -->
							<td>${vo.reg_date }</td>	<!-- 작성일 -->
							<td><a href="${pageContext.request.contextPath }/board" class="del">삭제</a></td>
						</tr>
					</c:forEach>
					
				</table>
				
					<div class="pager">
						<ul>
							<li><a href="">◀</a></li>
							<li><a href="">1</a></li>
							<li><a href="">2</a></li>
							<li class="selected">3</li>
							<li><a>4</a></li>
							<li><a>5</a></li>
							<li><a href="">▶</a></li>
						</ul>
					</div>				
					<div class="bottom">
						<a href="${pageContext.request.contextPath }/board?a=writeform" id="new-book">글쓰기</a>
					</div>
				
			</div>
		</div>
		
		<c:import url="/WEB-INF/views/includes/navigation.jsp">
			<c:param name="menu" value="board"/>
		</c:import>
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
		
	</div>
</body>
</html>