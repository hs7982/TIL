/*
	- Date함수
    
    1) 현재 날짜 시간 출력
		now()
		sysdate()
		current_timestamp()
	
    2) 날짜 계산
		- 더하기 : date_add(날짜, 값)
					값: interval 숫자 단위
        - 빼기 : date_sub(날짜, 값)
        
	3) 날짜 포멧
		- date_format(시간, 포멧)
			ex) select date_format(now(), "%H:%i:%s"); 
            %Y - 년도
            %m - 월(숫자)
            %M - 월(영문)
            %d - 일
			
            %H - 시(00~23)
            %h - 시(01~12)
            %i - 분
            %s - 초
            
*/
select now();
select sysdate();
select current_timestamp();

select date_add('2025-04-03', interval 10 day);
select date_sub('2025-04-03', interval 10 day);
select date_add('2025-04-03 09:45:20', interval 10 hour); 
select date_sub('2025-04-03 09:45:20', interval 10 minute); 
select date_sub('2025-04-03 09:45:20', interval 10 second);

select date_format(now(), "%Y-%m-%d"); 
select date_format(now(), "%H:%i:%s"); 
