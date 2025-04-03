/*
-조인
	-사용법-
		select * from 테이블1 as 별칭1
			[inner/left/right] join 테이블2 as 별칭2
				on 별칭1.매칭시킬컬럼명 = 별칭2.매칭시킬컬럼명;
			

	1) inner join (교집합)
		ON절과 함께 사용되면 ON절의 조건을 만족하는 데이터만 가져온다.
        한쪽에 값이 아예 없으면 양쪽을 다 안가져옴
        
    **2) left join(합집합)
		첫번째 테이블을 기준으로 두번째 테이블을 합침
        첫번째 테이블에 정보가 있으면 두번째 테이블에 ON절에서 만족하는 정보가 없어도 
        첫번째 테이블의 정보는 가져온다.
        (두번째 테이블의 자리에는 null 로 표시됨)
    
    3) right join(합집합. left join의 반대)	
		두번째 테이블을 기준으로 첫번째 테이블을 합침
        두번째 테이블에 정보가 있으면 첫번째 테이블에 ON절에서 만족하는 정보가 없어도 
        두번째 테이블의 정보는 가져온다.
        (첫번째 테이블의 자리에는 null 로 표시됨)
*/

use sakila;
select film_id, title, language_id from film ;

select F.film_id, F.title, L.name from film F
	 join language L
		ON F.language_id = L.language_id;

-- -----------------------------------------------------
/* 1) world 스키마에 있는 city 와 country 테이블을 합쳐서 표시하기 
	city: 다 출력
    country: code, name, region 만 출력 
 */
use world;
select * from city;
select * from country where name like '%korea%';

select * 
from city as C
	left join country as CO
		on C.CountryCode = CO.Code
        where CO.Code = 'KOR'
        order by C.name asc;

# sakila 스키마 에서 film_category 랑 Category를 Category_id로 조인하기
select FC.film_id, FC.category_id, C.name 
from film_category as FC
	left join category as C
		on FC.category_id = C.category_id
        order by FC.film_id asc;


select * from film;

select F.film_id, F.title as 제목, FCC.name as 장르
	from film as F
		left join (select FC.film_id, FC.category_id, C.name 
					from film_category as FC
						left join category as C
							on FC.category_id = C.category_id
							order by FC.film_id asc) as FCC
		on F.film_id = FCC.film_id;

select * from film_category;

-- 카테고리 까지 연결하기
select F.film_id, F.title, FC.category_id 
	from film as F
	left join film_category as FC
		on F.film_id = FC.film_id;
        
select FCC.film_id, FCC.title, C.name from (select F.film_id, F.title, FC.category_id 
							from film as F
							left join film_category as FC
								on F.film_id = FC.film_id) as FCC
	left join category as C
		on FCC.category_id = C.category_id;
                    
        