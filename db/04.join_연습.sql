/* 
	- test 스키마에 movie 테이블 생성
		고유번호(seqno, PK), 제목(title), 설명(info), 평점(rate), 장르(genre)
	- genre 테이블 생성
		고유번호(seqno, PK), 장르(genre)
    안에 정보 여러개 두기
*/ 
use test;
#drop table movie;
create table movie (
	m_seqno int not null auto_increment,
    m_title varchar(255) not null,
    m_desc text null,
    m_rate decimal(4,2) default 0.0, -- 총4자리, 소수점2자리
    m_genre int not null,
    
    primary key(m_seqno)
);
insert into movie values (null, '제목1', '설명1', 4.22, 1);
insert into movie values (null, '제목2', '설명2', 1.22, 2);
insert into movie values (null, '제목3', '설명3', 2.00, 1);
insert into movie values (null, '제목3', '설명3', 3.25, 4);
insert into movie values (null, '제목4', '설명4', 0.05, 3);
insert into movie values (null, '제목5', '설명5', 0.05, 7);


#drop table genre;
create table genre (
	g_seqno int not null auto_increment,
    g_genre varchar(50) not null,
    
    primary key(g_seqno)
);
insert into genre values (null, '코미디');
insert into genre values (null, '호러');
insert into genre values (null, '핑크');
insert into genre values (null, '핫핑크');
insert into genre values (null, '로코');
insert into genre values (null, '판타지');

select * from movie;
select * from genre;

select * from movie as M
	left join genre as G
		on M.m_genre = G.g_seqno;
 
select * from movie as M
	inner join genre as G
		on M.m_genre = G.g_seqno;

