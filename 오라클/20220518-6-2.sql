-- 데이터 삽입 insert문
-- insert into 테이블(열1, 열2,....)values(값1, 값2 ....);
select * from usertbl;
-- 열이름 생략
insert into usertbl
values('JSY','전소연',1998,'서울','010','12345678',157,'2022-05-18');
-- 열이름 추가
insert into usertbl(userid,username,birthyear,addr,height,mdate)
values('SSH','송소희',1997,'충남',164,'2022-04-02');

-- 데이터 수정: update문
-- update 테이블 이름 set 열1=값1, 열2=값2....where 조건;
-- where 조건은 기본키(주키)로 하는게 좋음
insert into usertbl
values('NHC','노홍칠',1979,'충남','010','12312312',183,'2022-03-06');
--이름 키 수정
update usertbl
set username='노홍철', height=179
where userid='NHC';
--where를 뺄 경우 모든 내용이 set의 내용으로 바뀜
-- 칼럼(column) 전체적 수정
update usertbl
set mobile1='010';

-- commit(F11)하기 전에는 rollback(F12)을 할 수 있음
-- commit(F11) 이후에는  rollback(F12)할 수 없음

insert into usertbl
values('NHC1','노홍칠',1979,'충남','010','12312312',183,'2022-03-06');
insert into usertbl
values('NHC2','노홍칠',1979,'충남','010','12312312',183,'2022-03-06');
update usertbl
set username='노홍철' where username='노홍칠';

-- 데이터 삭제: delete
-- delete from 테이블 이름 where 조건;
delete from usertbl where userid='NHC1';
delete from usertbl where username='노홍철';

insert into usertbl
values('NHC','노홍철',1979,'충남','010','12312312',179,'2022-03-06');
insert into usertbl
values('NHC1','노홍철',1979,'충남','010','12312312',179,'2022-03-06');
insert into usertbl
values('NHC2','노홍철',1979,'충남','010','12312312',179,'2022-03-06');

delete from usertbl where username='노홍철' and rownum<=2;
update usertbl set userid='NHC' where userid='NHC2';

-- 조인 (join)
select * from usertbl;
select * from buytbl;
--select 열 목록 from 첫번째 테이블 inner join 두번째 테이블 on 조인될 조건
--where 검색조건

select * from buytbl
inner join usertbl
on buytbl.userid=usertbl.userid;
-- BBK 이전 주문 목록
select * from buytbl b inner join usertbl u
on b.userid=u.userid where b.userid='BBK';
-- buytbl b는 buytbl을 b로 줄일 수 있음 as "b"가 생략된 것

-- 8번째 주문 택배 발송 주문자, 주문자의 전화번호, 주소, 상품, 수량, 가격
select u.username,u.mobile1||u.mobile2,u.addr,b.prodname,b.amount,b.price
from buytbl b inner join usertbl u
on b.userid=u.userid where b.idnum>'8';

select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;

-- 학생 이름, 지역, 가입한 동아리, 동아리 호수
select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s
inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname=c.clubname
order by s.stdname, c.roomno;

-- outer join
-- 전체 회원도 가져오고 주문 내역도 가져와야 된다
-- select 열 목록 from 첫번째(left) 테이블(left/right/full)
-- outer join 두번째(right) 테이블 on 조인될 조건
-- where 검색조건;
select * from usertbl u
left outer join buytbl b
on u.userid=b.userid
order by u.userid;

select * from buytbl b
right outer join usertbl u
on u.userid=b.userid
order by u.userid;

select * from usertbl u
full outer join buytbl b 
on u.userid=b.userid
order by u.userid;

select * from stdtbl s
left outer join stdclubtbl sc
on s.stdname=sc.stdname
left outer join clubtbl c
on sc.clubname=c.clubname
order by s.stdname, c.roomno;
