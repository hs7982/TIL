<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<%@ page import="java.net.URLDecoder" %>
<c:set var="loginTxt" value="${ sessionScope.id==null ? '전':'후'}" />	

<c:set var="logInOutTxt" value="${ sessionScope.id==null ? 'login':'logout'}" />
<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout'}" />	

<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>게시판 페이지</title>
   <link rel="stylesheet" href="<c:url value='/css/common.css'/> ">
   <link rel="stylesheet" href="<c:url value='/css/h_f.css'/> ">
   <link rel="stylesheet" href="<c:url value='/css/board.css'/> ">
</head>
<body>
   
	<div class="header">
      <div class="content_area">
         <div id="logo"><a href="<c:url value='/'/>">BITSTUDY</a></div>

         <ul class="menu">
            <li class="item">
               <a href="<c:url value='/board/list'/>">Board</a>
            </li> 
      
   			<li class="item">
               <a href="<c:url value='${ logInOutLink }'/>">${ logInOutTxt }</a>
            </li> 
            
            
            <li class="item">
            	<c:choose>
            		<c:when test="${ loginTxt == '전' }">
		               <a href="<c:url value='/register/join12'/>">Sign in</a>
            		</c:when>
            		<c:otherwise>
		               <span style="padding:10px 20px">${ sessionScope.id }님</span>
            		</c:otherwise>
            	</c:choose>            
            </li>
         </ul> 
      </div>
   </div>
   <div class="main">
      <h1><center>게시판</center></h1>
      
      <div class="content_area">
         <ul class="b_list">
            <li><a href="#">게시글 1</a></li>
            <li><a href="#">게시글 2</a></li>
            <li><a href="#">게시글 3</a></li>
            <li><a href="#">게시글 4</a></li>
            <li><a href="#">게시글 5</a></li>
         </ul>
      </div>
      
   </div>
</body>
</html>