/*
	null 에 관련된 값은 조심해야함
    (애시당초 특정 상황이 아닌이상 null 값을 데이터에 넣어놓을 필요가 없음)
    null 이 발생하는 거의 유일한 이유는 join 할때 값이 없거나, 서브쿼리같이 값이 없는(검색실패) 경우임
*/

select * from sakila.staff;

/* 1) is null */
select * from sakila.staff where password is null;

/* 2) is not null */
select * from sakila.staff where password is not null;

/* 3) ifnull - ifnull(컬럼명, '대체 값') */
select staff_id, first_name, last_name, ifnull(password,'대체 문장') as pw 
	from sakila.staff where password is null;
