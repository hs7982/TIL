<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.net.URLDecoder" %>

<c:set var="loginTxt" value="${ sessionScope.id==null ? '전':'후'}" />	

<c:set var="logInOutTxt" value="${ sessionScope.id==null ? 'login':'logout'}" />
<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout'}" />	

<c:set var="toUrl" value="${ sessionScope.toUrl==null ? '':sessionScope.toUrl }" />	

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
    
	<link rel="stylesheet" href="<c:url value='/css/common.css'/>">
	<link rel="stylesheet" href="<c:url value='/css/h_f.css'/>">
    <style>
       * { box-sizing:border-box; }
       a { text-decoration: none; }
        form {
            width:400px;
            height:500px;
            display : flex;
            flex-direction: column;
            align-items:center;
            position : absolute;
            top:50%;
            left:50%;
            transform: translate(-50%, -50%) ;
            border: 1px solid rgb(89,117,196);
            border-radius: 10px;
        }
        input[type='text'], input[type='password'] {
            width: 300px;
            height: 40px;
            border : 1px solid rgb(89,117,196);
            border-radius:5px;
            padding: 0 10px;
            margin-bottom: 10px;
        }
        button {
            background-color: #eee8aa;
            color : #333;
            width:300px;
            height:50px;
            font-size: 17px;
            font-weight: 900;
            border : none;
            border-radius: 5px;
            margin : 20px 0 30px 0;
        }
        #title {
            font-size : 50px;
            margin: 40px 0 30px 0;
        }
        #msg {
            height: 30px;
            text-align:center;
            font-size:16px;
            color:red;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<div class="header">
      <div class="content_area">
         <div id="logo"><a href="<c:url value='/'/>">BITSTUDY</a></div>

         <ul class="menu">
            <li class="item">
               <a href="<c:url value='/list'/>">Board</a>
            </li> 
   			<li class="item">
               <a href="<c:url value='${ logInOutLink }'/>">${ logInOutTxt }</a>
            </li> 
            
            
            <li class="item">
            	<c:choose>
            		<c:when test="${ loginTxt == '전' }">
		               <a href="<c:url value='/register/join'/>">Sign in</a>
            		</c:when>
            		<c:otherwise>
		               <span style="padding:10px 20px">${ sessionScope.id }님</span>
            		</c:otherwise>
            	</c:choose>            
            </li>
         </ul> 
      </div>
   </div>
   
   
    <form action="<c:url value='/login'/>" method="post" onsubmit="return formCheck(this);">
        <h3 id="title">Login</h3>
        <div id="msg">
		    <c:if test="${not empty param.msg}">
				<i class="fa fa-exclamation-circle"> ${URLDecoder.decode(param.msg)}</i>            
		    </c:if>        
		</div> 
 
        <input type="text" name="id" value="${ cookie.id.value }" placeholder="아이디 입력" autofocus>
        <input type="password" name="pw" placeholder="비밀번호">
        <button>로그인</button>
        
        
        <!-- 쿼리스크링 방식으로 할땐 이거 사용 -->
        <%-- <input type="text" name="toUrl" value="${ param.toUrl }" /> --%>
        
        <!-- 세션으로 할때는 아래꺼 사용 -->
        <input type="text" name="toUrl" value="${ toUrl }" />
        <%-- <input type="text" name="toUrl" value="<%= request.getAttribute("toUrl") %>" /> --%>
        
        <!-- http://localhost:8080/app/login12?toUrl=/board/list -->
        
        <div> 
            <label><input type="checkbox" name="rId" ${empty cookie.id.value?"":"checked" }> 아이디 기억</label> |
              
            <a href="#">비밀번호 찾기</a> |
            <a href="<c:url value='/register/join10'/>">회원가입</a>
        </div>
    </form>
    <script>
        function formCheck(frm) {
             if(frm.id.value.length==0) {
                 setMessage('아이디를 입력해주세요.', frm.id);
                 return false;
             }
             if(frm.pw.value.length==0) {
                 setMessage('비밀번호를 입력해주세요.', frm.pw);
                 return false;
             } 
             return true;
        }
 
        function setMessage(msg, element){
             document.getElementById("msg").innerHTML = `<b>${'${msg}'}</b>`;
 
             if(element) {
                 element.select();
             }
        }
    </script>
</body>
</html>
