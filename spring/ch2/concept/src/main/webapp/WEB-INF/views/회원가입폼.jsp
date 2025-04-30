<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<%@ page import="java.net.URLDecoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:set var="loginTxt" value="${ sessionScope.id==null ? '전':'후'}" />	

<c:set var="logInOutTxt" value="${ sessionScope.id==null ? 'login':'logout'}" />
<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout'}" />	
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
   <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
   <link rel="stylesheet" href="<c:url value='/css/h_f.css'/>">
    <style>
        * {
            box-sizing: border-box;
        }
        form {
            width: 400px;
            /* height: 600px; */
            display: flex;
            flex-direction: column;
            align-items: center;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            border: 1px solid rgb(89, 117, 196);
            border-radius: 10px;
        }
        .txt {
            width: 300px;
            height: 40px;
            border: 1px solid rgb(89, 117, 196);
            border-radius: 5px;
            padding: 0 10px;
            margin-bottom: 10px;
        }
        label {
            width: 300px;
            height: 30px;
            margin-top: 4px;
        }
        button {
            background-color: #eee8aa;
            color: #333;
            width: 300px;
            height: 50px;
            font-size: 17px;
            border: none;
            border-radius: 5px;
            margin: 20px 0 30px 0;
        }
        .title {
            font-size: 50px;
            margin: 40px 0 30px 0;
        }
        .msg {
            text-align: center;
            font-size: 16px;
            color: red;
            margin-bottom: 20px;
            height: 25px;
        }
        .sns-chk {
            margin-top: 5px;
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
   
    <form action="<c:url value="/save" /> " method="POST" onsubmit="return frmChk(this)">
        <h1>회원가입 12</h1>
 
        <div id="msg" class="msg" >모델안쓸때: ${ URLDecoder.decode(param.msg, "utf-8") }</div>
        <div id="msg" class="msg" >모델 쓸때: ${ URLDecoder.decode(msg, "utf-8") }</div>

		<input type="text" class="txt" id="id" name="id" placeholder="아이디를 3자 이상 입력하시오">
        <input type="password" class="txt" id="pw" name="pw" placeholder="비밀번호를 3자 이상 입력하시오"> 

        <input type="text" class="txt" id="name" name="name" placeholder="이름 입력하시오">
        <input type="email" class="txt" id="email" name="email" placeholder="이메일 입력하시오">

        <button>회원가입</button>
	</form>

    <script>
        function frmChk(frm) {
            if(frm.id.value.length < 3) {
                // document.getElementById('msg').innerHTML = "메세지";
                setMsg("id의 길이는 3자 이상입니다.", frm.id)
                return false;
            }
            else if(frm.pw.value.length < 3) {
                // document.getElementById('msg').innerHTML = "메세지";
                setMsg("pw의 길이는 3자 이상입니다.", frm.pw)
                return false;
            }

            return true;
        }
        
        function setMsg(msg, el) {
        	document.getElementsByClassName('msg')[0].innerHTML = `<b>${'${msg}'}</b>`;
        	document.getElementsByClassName('msg')[1].innerHTML = `<b>${'${msg}'}</b>`;
        	<%-- 여기서 ${msg} 만 쓰면 자바스크립트의 ${} 로 인식하는게 아니고
        		EL 방식으로 인식해서 서버가 동작할때 msg 변수를 열어본다. 
        		그러나 그때는 아직 msg에 아무것도 담겨있지 않는 상태이기 때문에 빈칸으로만 나온다.
        		그래서 EL 방식으로 한번 감싸고 그 안에 한번더 빽틱 방식으로 msg를 감싸야한다 => ${'${msg}' } 
       		--%>	
        	

            if(el) {
                el.focus();
            }
        }
    </script>
    
</body>
</html>





















