/*
	UNION - 여러개의 테이블에 존재하는 같은 성격을 가진 값을 하나의 쿼리로 추출하는것
    *그.렇.지.만!!! union 이나 union All은 좋은 SQL 문은 아님. 
    UNION 보다는 UNION ALL을 사용하자.
    UNION 을 반드시 써야 하는 경우, 최소 필요한 컬럼만 select 하기
    
    1) UNION - 쿼리의 결과를 합친다. 
			   중복되는 ROW 를 제거
	2) UNION ALL - 쿼리의 결과를 합친다. 
			   중복되는 ROW 를 제거하지 않는다.
*/

-- 전세계 국가
create table t1(
	seqno int not null Auto_increment,
    country varchar(45) not null,
    primary key(seqno)
);
insert into t1 values (null, '한국');
insert into t1 values (null, '호주');
insert into t1 values (null, '미국');
insert into t1 values (null, '캐나다');
insert into t1 values (null, '태국');
insert into t1 values (null, '도미니카공화국');

-- 아시아
create table t2(
	seqno int not null Auto_increment,
    country varchar(45) not null,
    primary key(seqno)
);
insert into t2 values (null, '한국');
insert into t2 values (null, '호주');
 
select * from t1;
select * from t2;


select * from t1
union
select * from t2;


select * from t1
union ALL
select * from t2;






