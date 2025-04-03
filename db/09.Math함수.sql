/*
	- Math 함수 
    ceil(숫자): 소수점 올림
    floor(숫자): 내림
    round(숫자,자리수): 반올림
					 소수점 뒤 첫번째 자리는 0
					 소수점 앞 첫번째 부터는 -1
                     3.1415965358979 있다고 치면
					-1 0123456789 번째
    truncate(숫자,자리수): 버림
    abs(숫자): 절대값
    mod(분자,분모) - % 같은거
    
*/ 
SELECT * FROM sakila.payment;

SELECT * FROM sakila.payment where payment_id=1;
SELECT ceil(amount) FROM sakila.payment where payment_id=1; -- 2.99 -> 3
SELECT floor(amount) FROM sakila.payment where payment_id=1; -- 2.99 -> 2
SELECT round(amount, 0) FROM sakila.payment where payment_id=1; -- 2.99 -> 2
--  3.1415965358979
-- -1 0123456789 번째

SELECT * FROM test.teachers;
SELECT abs(t_weight) FROM test.teachers;

SELECT mod(t_weight , 3) FROM test.teachers where t_seqno=1;

select bin(10), oct(10), hex(10);