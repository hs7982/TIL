drop table if exists star_menu, star_emp, star_cust, star_branch, star_orders;

create table star_menu (
    m_seqno	int not null auto_increment,
    m_title	varchar(50) not null,
    m_cate	varchar(50) not null,
    m_price	varchar(50) not null,

    primary key(m_seqno)
); 
insert into star_menu values (null, '아메리카노', '커피','3000');
insert into star_menu values (null, '에스프레소', '커피','3000');
insert into star_menu values (null, '돌체라테', '라테','9900');
insert into star_menu values (null, '카페라테', '라테','1900');
insert into star_menu values (null, '바닐라라테', '라테','3900');
insert into star_menu values (null, '목화라테', '라테','4900');
insert into star_menu values (null, '아퍼가또', '커피','5700');
insert into star_menu values (null, '아빠는 한국인', '아이스크림','1900');
insert into star_menu values (null, '맘모스빵', '베이커리','5500');
insert into star_menu values (null, '피지오', '소다','7000');
insert into star_menu values (null, '딸기생크림케이크', '베이커리','30000');
insert into star_menu values (null, '콜라', '소다','7000');
insert into star_menu values (null, '얼큰바나나케이크', '베이커리','30000');
insert into star_menu values (null, '사토 까르보나라 라테', '라테','1900');
insert into star_menu values (null, '발가락샤워라테', '라테','3900');
insert into star_menu values (null, '라테?라떼?라테', '라테','4900');
insert into star_menu values (null, '진짜진한커피', '커피','5700');
insert into star_menu values (null, '커피맛 나는 우유빵', '베이커리','5700');
insert into star_menu values (null, '중국산커피', '커피','5700');
insert into star_menu values (null, '루왁커피', '커피','9700');
insert into star_menu values (null, '루왁처럼 생긴 중국산 푸바오 커피', '커피','9700');

insert into star_menu values (null, '제주하르망 컵', '텀블러', '100000');
insert into star_menu values (null, '봄 but꽃 에디션  ', '텀블러', '8000');
insert into star_menu values (null, '옆집 비니남자 냄새 컵', '텀블러', '10');
insert into star_menu values (null, '중국산 원두', '원두', '100');
insert into star_menu values (null, '새르미 컵', '텀블러', '90000');
insert into star_menu values (null, '새르미 lost 컵', '텀블러', '99000');
insert into star_menu values (null, '새르미 분홍컵 따라산 파랑컵', '텀블러', '99000');

create table star_emp (
    e_seqno int not null auto_increment ,
    e_no varchar(50) not null ,
    e_name varchar(50) not null ,
    e_birth varchar(50) not null ,
    e_gender varchar(50) not null ,
    e_cell varchar(50) not null ,
    e_nick varchar(50) not null ,
    e_level varchar(50) not null,
    e_type varchar(50) not null,
    e_salary varchar(50) not null ,
    e_joinDate varchar(50) not null ,

    primary key(e_seqno)
);
insert into star_emp values (null, 'e001', '박보검', '1980-01-01', '남','010-1234-5678','MR.박','일반','파트타임', '9990000', '2024-01-01');
insert into star_emp values (null, 'e002', '황희찬', '1996-01-01', '남','010-1234-5678','노랑황소','일반','정규직', '30000', '2024-01-01');
insert into star_emp values (null, 'e003', '미켈렌모르네', '1980-01-01', '남','010-1234-5678','몰라','일반','정규직', '40000', '2024-01-01');
insert into star_emp values (null, 'e004', '차두리', '1980-01-01', '남','010-1234-5678','간때문','일반','파트타임', '90000', '2024-01-01');
insert into star_emp values (null, 'e005', '안준', '1980-01-01', '남','010-1234-5678','M','사장','정규직', '999999999', '2020-01-01');
insert into star_emp values (null, 'e006', '장인혁', '1940-01-01', '남','010-1234-5678','M','노예','파트타임', '1', '2021-01-01'); 
 
create table star_cust (
    c_seqno int not null auto_increment,
    c_name varchar(50) not null,
    c_nick varchar(50) not null,
    c_id varchar(50) not null,
    c_pw varchar(50) not null,
    c_gender varchar(50) not null,
    c_level int not null,
    c_star int not null,
    c_birth varchar(50) not null,
    c_joinDate varchar(50) not null,

    primary key(c_seqno)
);

insert into star_cust values (null, '송유진', '송나라인', 'abcd', '1234','여',0, 1, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '라유진', '호주인', 'abcd', '1234','여',  3, 2, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '윤새르미', '알라뽕따', 'abcd', '1234','여',2, 0, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '이다현', '아왜요', 'abcd', '1234','여',1, 9, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '장인혁', 'null', 'abcd', '1234','남',2, 10, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '임보현', '요베이비', 'abcd', '1234','여',3, 3, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '김설', '아웃', 'abcd', '1234','남', 0, 1, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '권이지', '내일도 올거에요', 'abcd', '1234', '여', 1,3, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '최준우', '흣의남자', 'abcd', '1234','남',  3, 2, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '홍형석', '쾌남의 세컨인데 지는 모름', 'abcd', '1234','남',  3, 2, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '윤성현', '인디언 인형처럼', 'abcd', '1234','남',  3, 1, '2000-01-01', '2024-01-01');
insert into star_cust values (null, '김대화', '남자좋아하는 부자', 'abcd', '1234','남',  3, 1, '2000-01-01', '2024-01-01');


create table star_branch (
    b_seqno int not null auto_increment,
    b_branch varchar(50) not null,
    
    primary key(b_seqno)
);
insert into star_branch values (null, '강남');
insert into star_branch values (null, '일산');
insert into star_branch values (null, '종로');
insert into star_branch values (null, '광명');
insert into star_branch values (null, '청담');

create table star_orders(
    o_seqno int not null auto_increment,
    o_rNo varchar(50) not null,
    o_orderTime varchar(50) not null,
    o_FK_b_seqno int not null,
    o_FK_c_seqno int not null,
    o_FK_m_seqno int not null,
    o_type varchar(50) not null,
    o_size varchar(50) not null,
    o_takeout varchar(50) not null,
    o_qty varchar(50) not null, 
    o_payType varchar(50) not null,
    o_FK_e_seqno int not null,
 
    primary key(o_seqno)
);
insert into star_orders values (null, 're001', '2025-04-03 11:12:19', 1, 1, 1, 'hot', 'XS', '포장', 1, '카드', 1);
insert into star_orders values (null, 're001', '2025-04-03 11:12:19', 1, 1, 2, 'iced', 'S', '포장', 1, '카드', 1);
insert into star_orders values (null, 're001', '2025-04-03 11:12:19', 1, 1, 3, 'hot', 'M', '포장', 1, '카드', 1);
insert into star_orders values (null, 're002', '2025-04-03 14:12:19', 2, 2, 4, 'hot', 'L', '배달', 3, '카드', 2);
insert into star_orders values (null, 're003', '2025-04-03 14:12:19', 3, 3, 5, 'hot', 'XS', '매장', 1, '카드', 2);
insert into star_orders values (null, 're003', '2025-04-03 14:20:19', 3, 3, 1, 'iced', 'M', '매장', 2, '카드', 1);
insert into star_orders values (null, 're004', '2025-04-03 16:12:19', 1, 1, 2, 'iced', 'XS', '매장', 1, '카드', 4);
insert into star_orders values (null, 're004', '2025-04-03 16:12:19', 1, 1, 2, 'iced', 'XS', '매장', 1, '카드', 4);
insert into star_orders values (null, 're004', '2025-04-03 16:12:19', 1, 1, 3, 'iced', 'M', '매장', 1, '카드', 4);
insert into star_orders values (null, 're005', '2025-04-03 16:12:19', 1, 5, 4, 'hot', 'XS', '매장', 2, '카드', 5);
-- ---------------------------------------------------------------------------------- 
 
# 전체 메뉴 출력

# 전체 고객 출력

# 고객 레벨별 출력(0~3)

# 고객 성별 '여' 출력

# 고객 성별 '남' 출력

# 고객 중에 레벨 높은 사람들만 출력

# 고객 중에 레벨 높은 사람들 중에 별점 TOP3 출력

# 고객 중에 이름에 '현', '유' 들어간 사람만 출력

# 직원중 정규직만 연봉순 출력

# 직원중 직급 일반

# 직원중 연봉 TOP3

# 일반 직원중 연봉 TOP3

# 누가 언제 어떤 메뉴들을 출력했는지 출력











