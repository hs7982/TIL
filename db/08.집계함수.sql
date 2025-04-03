/*
	- 집계 함수(다른 컬럼들과 함께 출력하지 말것)
    count(컬럼명) - NULL값이 아닌 row(레코드)수 구하기
    sum(컬럼명) - 컬럼의 합계
    avg(컬럼명) - 컬럼의 평균
    max(컬럼명) - 컬럼중에서 최대값 한개
    min(컬럼명) - 컬럼중에서 최소값 한개
*/
SELECT * FROM test.students;
SELECT count(*) FROM test.students;

SELECT avg(amount) FROM sakila.payment;

select max(s_birth) from students;
select min(s_birth) from students;


select * from students where s_birth = (select min(s_birth) from students);
