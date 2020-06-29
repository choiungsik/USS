select * from members
select * from meetings
 
desc members

drop table members cascade constraints;
drop table meetings cascade constraints;
drop table posts cascade constraints;
drop table books cascade constraints;
drop table reviews cascade constraints;
drop table join_meet cascade constraints;
drop sequence meet_id_seq;
drop sequence post_no_seq;
drop sequence review_no_seq;
drop sequence join_no_seq;
drop sequence book_no_seq;

create table members
(mem_id varchar(20),
mem_pw varchar(20) constraint mem_pw_nn not null,
mem_name varchar(20) constraint mem_name_nn not null,
mem_age number(5) constraint mem_age_nn not null,
mem_sex varchar(10) constraint mem_sex_nn not null,
mem_inter varchar(20),
mem_grade varchar(20) constraint mem_grade_varchar_nn  not null,
constraint members_mem_id_pk primary key (mem_id));

create table meetings
(meet_id number(10),
mem_id varchar(20) constraint meet_id_nn not null,
meet_name varchar(40) constraint meet_name_nn not null,
personnel number(5) constraint meet_personnel_nn not null,
meet_inter varchar(20),
constraint meetings_meet_id_pk primary key (meet_id),
constraint meetings_mem_id_fk foreign key (mem_id)
references members(mem_id));

create table posts
(post_no varchar(20),
mem_id varchar(20) constraint p_mem_id_nn not null,
meet_id number(10),
post_name varchar(100) constraint post_name_nn not null,
post_cont varchar(400) constraint post_cont_nn not null,
post_file varchar(400),
post_date date default sysdate constraint post_date_nn not null,
constraint posts_post_no_pk primary key(post_no),
constraint posts_mem_id_fk foreign key (mem_id)
references members(mem_id),
constraint posts_meet_id_fk foreign key (meet_id)
references meetings(meet_id));

create table books
(book_no number(20),
mem_id varchar(20) constraint b_mem_id_nn not null,
book_name varchar(20) constraint book_name_nn not null,
book_price varchar(20) constraint book_price_nn not null,
book_cont varchar(400),
book_date date constraint book_date_nn not null,
buy number(5),
buy_id varchar(20),
constraint books_book_no_pk primary key (book_no),
constraint books_mem_id_fk foreign key (mem_id)
references members(mem_id));

create table reviews
(review_no number(10),
mem_id varchar(20) constraint r_mem_id_nn not null,
meet_id number(10) constraint r_meet_id_nn not null,
review_star number(5)  constraint review_star_nn not null,
review_title varchar(40) constraint review_title_nn not null,
review_cont varchar(400),
review_date date default sysdate constraint reivew_date_nn not null,
constraint reviews_review_no_pk primary key (review_no),
constraint reviews_mem_id_fk foreign key (mem_id)
references members(mem_id));

create table join_meet
(join_no number(5),
meet_id number(5) constraint join_meet_id_nn not null,
mem_id varchar(20) constraint join_mem_id_nn not null,
constraint join_meet_join_no_pk primary key (join_no),
constraint join_meet_id_fk foreign key (meet_id)
references meetings(meet_id),
constraint join_mem_id_fk foreign key (mem_id)
references members(mem_id));

create sequence meet_id_seq
increment by 1
start with 1
maxvalue 9999;

create sequence post_no_seq
increment by 1
start with 1
maxvalue 9999;

create sequence review_no_seq
increment by 1
start with 1
maxvalue 9999;

create sequence join_no_seq
increment by 1
start with 1
maxvalue 9999;

create sequence book_no_seq
increment by 1
start with 1
maxvalue 9999;



INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('kpg123', '456' ,'김평강','20','male', 'sport, study', 'nomal');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('pmj123', '456' ,'박민지','20','female', 'music, artin', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('ksa123', '456' ,'김설아','20','female', 'music, dance', 'great');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('uss123', '456' ,'최웅식','20','male', 'sport, study', 'nomal');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('cdh123', '456' ,'최도현','20','male', 'study', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('rjy123', '456' ,'류재영','30','male', 'sport, study', 'great');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('pgy123', '456' ,'박근영','30','male', 'sport, study', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('jsh123', '456' ,'정세희','30','female', 'music, artin', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('nar123', '456' ,'나아름','30','female', 'music, artin', 'normal');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('kjs123', '456' ,'김준수','20','male', 'sport, study', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('MASTER', '123' ,'관리자','40','male', 'sport, study', 'super');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'kpg123', '축구소식나눔', 20 , 'sport');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'pmj123', '미술학부', 8 , 'artin');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'pmj123', '해피싱어', 20 , 'music');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'ksa123', '영어회화', 12 , 'study');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'ksa123', '질러질러', 4 , 'music');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'ksa123', '히든싱어', 4 , 'music');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'uss123', '건축학개론', 12 , 'artin');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'uss123', '골프의모든것', 4 , 'sport');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'uss123', '야구소식지', 12 , 'sport');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'uss123', '헬스도우미', 12 , 'sport');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'cdh123', '중국어와 함께', 4 , 'study');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'cdh123', '자습시간~', 4 , 'study');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'cdh123', '일본어 강좌', 4 , 'study');

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'kpg123', 4 , 5 , '토익Lv7달성', '30일만에 가능해요', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'pmj123', 4 , 2 , '비추..', '너무 어려워요', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'ksa123', 4 , 4 , '토익쉬워요', '모두 할 수 있어요', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'uss123', 4 , 3 , '적절한 수준', '괜찮네요', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'uss123', 1 , 3 , '초보자환영', '모두 즐겁게 하자', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'ksa123', 1 , 5 , '내가 슛돌이', '패스패스패스', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'kpg123', 1 , 4 , '협동끝판왕', '즐거움, 협동력 최고', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'pmj123', 1 , 1 , '이건 좀....', '이시국에....', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'ksa123', 3 , 4 , 'jyp1차오디션 합격', '취미로 합격까지', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'uss123', 4 , 5 , '나의 활력', '이건 꼭 봐야해', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'cdh123', 5 , 5 , '가자, 중국여행', '중국여행', default);

INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'cdh123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'pmj123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'jsh123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'nar123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'kjs123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'uss123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'ksa123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'cdh123', '3');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'kpg123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'pmj123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'ksa123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'uss123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '2');

INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '2');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '3');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '5');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '6');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '7');

INSERT INTO BOOKS(book_no, mem_id, book_name, book_price, book_cont, book_date, buy, buy_id)
VALUES (book_no_seq.nextval, 'cdh123', 'JAVA', '20000', 'java완전정복' , default, 0, null);

update members set mem_inter = null where mem_id = 'MASTER';

delete from join_meet where mem_id = 'MASTER' and meet_id = '1';

select meet_name from meetings where meet_inter like substr((select mem_inter from members where mem_id = 'play123'),6, 5)

select * from reviews
select * from meetings
select meet_name from meetings where meet_inter like substr((select mem_inter from members where mem_id = 'play123'),8,5)

select * from join_meet

select * from join_meet where meet_id = 1 and mem_id = 'cdh123'

select * from reviews

select * from members m, meetings t where m.mem_id = t.mem_id and m.mem_sex like 'male' and t.meet_id = (select count(*) from meetings where meet_id = 1)
select * from members m, join_meet j where m.mem_id = j.mem_id and m.mem_age > 19 and m.mem_age < 30

select * from members m, join_meet j, meetings t where m.mem_id = t.mem_id and t.meet_id = j.meet_id and m.mem_sex like 'male'
select * from members m, meetings t, join_meet j where m.mem_id = t.mem_id and t.meet_id = j.meet_id and m.mem_sex like 'male' and t.meet_id = 1
select * from members m, meetings t, join_meet j where m.mem_id = j.mem_id and t.meet_id = j.meet_id and t.meet_id = 1