-- 뷰(view) 보는 용도로 주로 쓰는 테이블 같은 형태
select * from usertbl;

create view v_usertbl as select userid, username, addr from usertbl;

select * from v_usertbl;

-- view 장점: 보안성이 좋다(권한이 허용된 내용만 볼 수 있음)
-- 복잡한 쿼리를 단순화 시킬 수 있다
select u.userid, u.username, b.prodname, u.addr, u.mobile1||u.mobile2
from usertbl u inner join buytbl b on u.userid=b.userid;
-- view로 만들 경우
create or replace view v_userbuytbl as
select u.userid, u.username, b.prodname, u.addr, u.mobile1||u.mobile2 as "연락처",
b.price, b.amount
from usertbl u inner join buytbl b on u.userid=b.userid;

select * from v_userbuytbl;
select * from v_userbuytbl where username='김범수';

select username,prodname from v_userbuytbl;

create or replace view v_userbuytbl
as select u.userid as "아이디", u.username as "이름", b.prodname as "제품",
u.addr as "주소", u.mobile1||u.mobile2 as "연락처"
from usertbl u inner join buytbl b on u.userid=b.userid;

select * from v_userbuytbl;

-- view 삭제
drop view v_usertbl;

select * from user_views;

create or replace view v_usertbl as
select userid, username, addr from usertbl;

-- view 수정
update v_usertbl set addr='부산' where userid='JKW';
select * from v_usertbl;

insert into v_usertbl(userid,username,addr)
values('KBM','김병만','충북');
-- 테이블의 제약조건으로 인해 오류 발생

create or replace view v_usertbl as
select userid, username, addr from usertbl with read only;
-- 읽기만 하는 view

create or replace view v_sum as
select userid, sum(price*amount) as "Total"
from buytbl group by userid;

select * from v_sum order by "Total" desc;
-- 변경 불가 view 1. 집계함수 2. join 3. distnct(중복불가),group by, having

create or replace view v_height177 as
select * from usertbl where height>=177;
select * from v_height177;

delete from v_height177 where height<177;
insert into v_height177
values('KBM','김병만',1977,'경기','010','55555555',158,'2019-01-01');
--제약 조건에 걸리지 않으면 데이터가 들어가지만 view에는 제약조건상 나오지 않을 수 있음

create or replace view v_height177 as
select * from usertbl where height>=177
with check option;
--view에 제약을 걸어서 데이터 넣을 때 체크 함
select * from v_height177;

-- 224p DML 볼 것