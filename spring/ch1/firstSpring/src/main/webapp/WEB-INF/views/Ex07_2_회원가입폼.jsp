<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 
	여기선 스프링 방식으로 해볼거임
	
		
 --%>
     
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
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
	<%-- <c:url> 뷰파일들의 기본 위치 세팅 --%>
    <form action="<c:url value="/register/save" /> " method="POST" onsubmit="return frmChk(this)">
        <h1>회원가입</h1>

        <div id="msg" class="msg" ></div>

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
            document.getElementById('msg').innerHTML = msg;

            if(el) {
                el.focus();
            }
        }
    </script>
    
</body>
</html>

