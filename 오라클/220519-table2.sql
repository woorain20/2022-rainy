-- p349-354
create table user2tbl(
    userID char(8),
    userName nvarchar2(10),
    birthYear number(4),
    addr nchar(2),
    mobile1 char(3),
    mobile2 char(8),
    height number(3),
    mDate date
);    
create table buy2tbl(
    idNum number(8) primary key,
    userId char(8),
    prodName nchar(6),
    groupName nchar(4),
    price number(8),
    amount number(3)
);
drop sequence idseq;
create sequence idseq;

insert into user2tbl
values('LSG','이승기',1987,'서울','011','11111111',182,'2008-8-8');
insert into user2tbl
values('KBS','김범수',null,'서울','011','22222222',173,'2012-4-4');
insert into user2tbl
values('KKH','김경호',1871,'전남','019','33333333',177,'2007-7-7');
insert into user2tbl
values('JYP','조용필',1950,'경기','011','44444444',166,'2009-4-4');

insert into buy2tbl
values(idseq.nextval,'KBS','운동화',null,30,2);
insert into buy2tbl
values(idseq.nextval,'KBS','노트북','전자',1000,1);
insert into buy2tbl
values(idseq.nextval,'JYP','모니터','전자',200,1);
insert into buy2tbl
values(idseq.nextval,'BBK','모니터','전자',200,5);

select * from user2tbl;
select * from buy2tbl;

-- 회원 primary key 삽입
alter table user2tbl
    add constraint pk_user2tbl_userID
    primary key(userID);
-- 구매 테이블 외래키 설정
alter table buy2tbl
    add constraint fk_user2tbl_buy2tbl
    foreign key(userid)
    references user2tbl(userid);
-- 오류 발생 구매 테이블에 회원 테이블에는 없는 BBK가 있으므로
delete from buy2tbl where userid='BBK';
-- BBK 삭제 후 재실행
-- 제약 조건 임시 중시
alter table buy2tbl
    disable constraint fk_user2tbl_buy2tbl;
insert into buy2tbl
values(idseq.nextval,'BBK','모니터','전자',200,5);
-- 제약 조건 회복
alter table buy2tbl
    enable novalidate constraint fk_user2tbl_buy2tbl;
insert into user2tbl
values('BBK','바비킴',1973,'서울','010','00000000',176,'2013-5-5');
-- 바비킴 회원 탈퇴
delete from user2tbl where userid='BBK';
-- 오류 발생이 일어남 userid가 연결고리가 있으므로
-- 회원탈퇴 버튼->백엔드 자바 구매테이블 삭제, 회원테이블
alter table buy2tbl
    drop constraint fk_user2tbl_buy2tbl;
alter table buy2tbl
    add constraint fk_user2tbl_buy2tbl
    foreign key(userid)
    references user2tbl(userid)
    on delete cascade;
-- on delete cascade 연관된 외래키를 가지고 있는 테이블의 데이터가 동시 삭제
alter table user2tbl
    drop column birthYear;
-- 칼럼이 삭제 되면서 제약 조건도 모두 삭제