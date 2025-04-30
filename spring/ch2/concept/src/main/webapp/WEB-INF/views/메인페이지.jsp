<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- 컨트롤러에서 만든 세션정보 중에 키가 id 인 값을 가져와서 
	- null 이면 아직 로그인 기록이 없다는 뜻 
	- 뭐라도 있으면 로그인 했었다는 뜻	--%>
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
   <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
   <link rel="stylesheet" href="<c:url value='/css/h_f.css'/>">
   <link rel="stylesheet" href="<c:url value='/css/index.css'/>"> 
</head>
<body> 
   <div class="header">
      <div class="content_area">
         <div id="logo"><a href="<c:url value='/'/>">BITSTUDY</a></div>

         <ul class="menu">
            <li class="item">
               <a href="<c:url value='/list'/>">Board</a>
            </li> 
    		<%-- <c:choose>
    			<c:when test="${loginTxt == '후'}">
	    			<li class="item">
		               <a href="<c:url value='/'/>">logout</a>
		            </li>
    			</c:when>
    			<c:otherwise>
	    			<li class="item">
		               <a href="<c:url value='/login12'/>">login</a>
		            </li>  
    			</c:otherwise>
    		</c:choose> --%>
      
   			<li class="item">
               <a href="<c:url value='${ logInOutLink }'/>">${ logInOutTxt }</a>
            </li> 
            
            
            <li class="item">
            	<c:choose>
            		<c:when test="${ loginTxt == '전' }">
		               <a href="<c:url value='/join'/>">Sign in</a>
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
      <div class="content_area">
         <h1>메인 페이지 </h1>
      </div>
   </div>
</body>
</html>