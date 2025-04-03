# 주석
	-- 또는 # : 한줄 주석 (단축키: ctrl + /)
	/* 블록 주석 */
/* 
실행버튼
	번개표시 : 현재 에디터에 있는 모든 명령어 실행
			(단축키: ctrl + shift + enter)
    번개표시I : 현재 커서가 있는 라인꺼만 실행
			  (단축키: ctrl + enter) 
              
세팅
	1) safe update 모드 끄기 - 켜겨있을때 데이터 삭제할때마다 where 절을 이용해서 일일히 조건을 걸어줘야함.
		메뉴바 Edit > Preferances > Sql Execution > 스크롤 맨 아래 safe update 체크박스 해제하기
        
	2) auto commit 끄기 - 실수로 delete 했을때 커밋 되어 버리면 되살릴수(undo) 없음
		메뉴바 Edit > Preferances > Sql Execution > 'New Connections~' 체크 해제
		
        commit: 작업내용을 DB에 반영
        rollback: 커밋하기 전까지의 작업내용을 되돌리기
                
	3) workbench 창 여러개 켤 수 있게 하기
		메뉴바 Edit > Preferances > other > 'Allow more than~' 체크 하기
	
*/
 
select now();
select * from sakila.actor;