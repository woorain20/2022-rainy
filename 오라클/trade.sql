-- 거래번호 입고번호 고객이름 모델 가격 보험(null) 거래일자 딜러이름 지점명

-- 시퀀스 생성
create sequence tseq;

-- 칼럼 삭제
alter table tradetbl drop column model;
alter table tradetbl drop column price;
alter table tradetbl drop column stocked_cartbl_s_number;
alter table tradetbl drop column carinfotbl_model;
alter table tradetbl drop column branchtbl_b_name;
alter table tradetbl drop column customertbl_c_name;
alter table tradetbl drop column dealertbl_d_name;

-- 거래 정보
insert into tradetbl
values(tseq.nextval,9,'김민준','가입','2020-05-25','김남우','평리점');
insert into tradetbl
values(tseq.nextval,15,'이도윤','미가입','2022-04-21','최반파','원주혁신도시점');
insert into tradetbl
values(tseq.nextval,3,'박지유','가입','2021-08-31','손아타','가산디지털점');
insert into tradetbl
values(tseq.nextval,22,'최민석','가입','2021-10-11','홍보레','구미점');
insert into tradetbl
values(tseq.nextval,26,'고채아','가입','2022-02-05','김포드','죽전점');
insert into tradetbl
values(tseq.nextval,14,'김가영','미가입','2020-09-13','곽연식','장안평점');
insert into tradetbl
values(tseq.nextval,8,'신태양','가입','2019-12-27','박현대','강릉점');
