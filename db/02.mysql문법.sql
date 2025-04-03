/*
1. DB 관련
	1) DB 생성
		- create database DB이름
    2) DB 삭제
		- drop database DB이름
    3) DB 조회
		- show databases;
    *4) DB 사용
		- use  

*/
create database test2;
drop database test2;
show databases;
use sakila;
use test;

select * from sakila.actor;


/*
2. 테이블 관련
	0) 테이블 리스트 확인
		show tables;
        
	1) 생성
		create table 테이블이름 (
			컬럼명 컬럼타입 옵션,
            컬럼명 컬럼타입 옵션,
            ...
            컬럼명 컬럼타입 옵션,
            
            PRIMARY KEY(컬럼명),
            FOREIGN KEY(현재 테이블 에서의 컬럼명) REFERENCES 부모테이블 (부모테이블 에서의 컬럼명)
        );
        
        CREATE TABLE `test`.`kh_class` (
		  `seqno` INT NOT NULL AUTO_INCREMENT,
		  `className` VARCHAR(45) NOT NULL,
		  `roomNo` VARCHAR(45) NULL,
		  PRIMARY KEY (`seqno`))
		ENGINE = InnoDB
		DEFAULT CHARACTER SET = utf8;
        
		CREATE TABLE kh_class (
			  seqno INT NOT NULL AUTO_INCREMENT,
			  className VARCHAR(45) NOT NULL,
			  roomNo VARCHAR(45) NULL,
			  teacher VARCHAR(45) NOT NULL,
			  
			  PRIMARY KEY (seqno)
		);
    
		INT - 숫자
		VARCHAR(숫자) - byte. 1~4000. (글자수)
		datetime - 시간 날짜 관련
		NOT NULL - 해당 컬럼은 null 금지
		AUTO_INCREMENT = 해당 컬럼의 값이 자동으로 1씩 증가
						 (무조건 해당 컬럼은 INT 여야함)
						 *데이터를 delete 한 경우 다시 시작하면 1번으로 시작하지 않고 최근 사용했던 숫자 다음 수 부터 시작
						 *alter table 테이블명 auto_increment=1; 을 이용해서 초기화 해줘야함
		PRIMARY KEY - 메인 키워드라고 컴퓨터에 알려주는것
					  값이 고유해야함. 
					  null 이면 안됨
                  
	2) 삭제
		- drop table 테이블명;
        
	3) 정보확인
		- desc 테이블명;
        
	4) 테이블 초기화
		- truncate 테이블명;
*/
show tables;

CREATE TABLE kh_class (
  seqno INT NOT NULL AUTO_INCREMENT,
  className VARCHAR(45) NOT NULL,
  roomNo VARCHAR(45) NULL,
  teacher VARCHAR(45) NOT NULL,
  
  PRIMARY KEY (seqno)
);

desc kh_class;



INSERT INTO `test`.`kh_class` (`seqno`, `className`, `roomNo`, `teacher`) VALUES (NULL, 'A30', '352', '안준성');
INSERT INTO `test`.`kh_class` (`seqno`, `className`, `roomNo`, `teacher`) VALUES (NULL, 'b10', '351', '심');
INSERT INTO `test`.`kh_class` (`seqno`, `className`, `roomNo`, `teacher`) VALUES (NULL, 'C20', 'D', '정');
INSERT INTO `test`.`kh_class` (`seqno`, `className`, `roomNo`, `teacher`) VALUES (NULL, 'A10', 'C', '김');
INSERT INTO `test`.`kh_class` (`seqno`, `className`, `roomNo`, `teacher`) VALUES (NULL, 'A12', 'A', '박');
SELECT * FROM test.kh_class;

delete from kh_class;

INSERT INTO `test`.`kh_class` (`seqno`, `className`, `roomNo`, `teacher`) VALUES (NULL, 'A19', 'B', '나');

alter table kh_class auto_increment=1;

truncate kh_class;

/*
3. 레코드 (C-insert, R-select, U-update, D-delete)
	1) 삽입
		- insert into 테이블이름 values ('값1','값2','값3'...);
			해당 테이블의 모든 컬럼에 순서대로 값을 삽입
            
        - insert into 테이블이름 (필드1, 필드3...) values ('값1','값3'...);
			해당 테이블에서 필요한 컬럼에만 값을 삽입
            
    *2) 읽기
		- 전체 컬럼 조회: select * from 테이블명;
        - 일부 컬럼 조회: select 컬럼명, 컬럼명.... from 테이블명; 
        - 특정 조건으로 조회: 기존 조회 방법에 추가로 where 절 설정
			select * from 테이블명 where 컬럼명=값;
            select * from 테이블명 where 컬럼명=값 and 컬럼명=값....;
            select * from 테이블명 where 컬럼명=값 or 컬럼명=값....; 
        - 범위 조회
			1. like - %(임의의 문자를 뜻함)
			2. in(값1, 값2) - () 안에 있는 값이랑 하나라도 매칭되면 해당 row 가져오기
			3. between 값1 and 값2 - 값1 부터 값2 사이에 걸리는 모든 row 가져오기
            
		- 정렬
			order by절 (where절 뒤에)
				asc(오름차순, 기본값), desc(내림차순)
        
        - 개수제한
			limit 절 (order by절 뒤에) : 가저오는 데이터의 개수 제한 또는 범위 제한
				1. limit 숫자하나: 가저오는 데이터의 개수 제한 
                2. limit 숫자1, 숫자2: 숫자1번째 꺼부터 숫자2 개
					ex) select * from kh_class where teacher like '%준성' order by seqno desc limit 2, 5 ;
						결과의 2번째꺼 부터 5개 불러오기
		 
		- 중복제거
			select distinct 컬럼명 from 테이블명;
			*주의: distinct 사용시 다른 컬럼이랑 섞어쓰지 말기(혹시 되더라도 distinct 구문을 맨 앞 컬럼으로 배치해야함)
            
    3) 수정
		update 테이블이름 set 컬럼명='바꿀내용' where 컬럼명=기존값;
        *update시 where절 없이 업데이트 하면 테이블의 모든 정보가 다 바뀜(무조건 where절 사용해야함)
    4) 삭제
		delete from 테이블이름 where 컬럼명=값;
        *delete where절 없이 업데이트 하면 테이블의 모든 정보가 다 삭제(무조건 where절 사용해야함)
*/
	 
INSERT INTO kh_class VALUES (NULL, '새 반', '352', '라');
select * from kh_class;
select * from kh_class where teacher like '%준성' order by seqno desc limit 1, 2 ;

select seqno, roomNo as 강의장, teacher as 강사 from kh_class;

# where 절 이용한 조건으로 조회
select * from kh_class where roomNo > 350 ;
select * from kh_class where teacher = '안준성';
select * from kh_class where roomNo > 350 and teacher = '안준성';

select * from kh_class where roomNo = '352' or roomNo = 'D';
select * from kh_class where roomNo = '352' or roomNo = 'D' and teacher = '안준성';
select * from kh_class where (roomNo = '352' or roomNo = 'D') and teacher = '안준성';

select * 
	from kh_class 
    where className ='A30';

select className from kh_class;
select distinct className from kh_class;

select * from kh_class;
select * from kh_class where teacher like "%준%"; -- '준' 앞뒤에 뭐가 있던 없던 상관 없음
select * from kh_class where teacher like "%준"; -- '준' 자가 맨 마지막 이면서 앞에 몇글자가 있던 상관 없음 
select * from kh_class where className like "A%";

select * from kh_class ;
select * from kh_class where className in ('A30','B10', 'c20'); -- in(): () 안에 있는 데이터랑 매칭되는 row 한줄 통째로 가져온다

select * from kh_class where openTime between '2024-01-01' and '2025-12-31';


update kh_class set teacher='안준성' where seqno=2;

delete from kh_class where teacher != '안준성'; -- 안준성이 아닌것만 다 삭제하기

/*
4. 기존 컬럼 변경
	1) 추가 
		alter table 테이블명 add 컬럼명 컬럼타입 옵션
    2) 컬럼(타입/옵션)수정
		(최초에 add할때 varchar로 하면 modify/change 다 안됨. 최초에 int로 해야 수정 가능)
		alter table 테이블명 modify 컬럼명 컬럼타입 옵션 
    3) 컬럼(이름/타입/옵션)수정
		(최초에 add할때 varchar로 하면 modify/change 다 안됨. 최초에 int로 해야 수정 가능)
		alter table 테이블명 change 기존컬럼명 바꿀컬럼명 컬럼타입 옵션 
	4) 삭제
		alter table 테이블명 drop 컬럼명;
	5) 컬럼 순서 변경
		alter table 테이블명 modify column 옮길컬럼 속성 after 기준컬럼
	6) 테이블 이름 변경
		rename table 기존테이블명 to 새테이블명
*/
alter table kh_class add level int not null;
alter table kh_class add agent varchar(40) null;
select * from kh_class;

desc kh_class;
alter table kh_class modify level varchar(10) not null;
alter table kh_class modify level int null;
	
alter table kh_class add agent int not null;
 
alter table kh_class change level cLevel varchar(10) not null;
 
alter table kh_class drop agent;
select * from kh_class;

alter table kh_class modify column roomNo varchar(40) not null after teacher;
alter table kh_class modify column teacher varchar(40) not null after roomNo;


rename table kh_class to kh_classes;





