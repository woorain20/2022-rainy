-- 전체 테이블 확인
select * from tab;

select * from userTBL;
select * from buyTBL;

--문자가 들어갈 때 '' 사용.
select * from userTBL where userName='이승기';
select * from userTBL where addr='서울';

--1970년 이후 출생, 신장이 182이상 아이디와 이름 조회
select userid,username 
from usertbl 
where birthyear>=1970 and height>=182;

--1970년 이후 출생했거나 신장이 182이상 아이디와 이름 조회
select userid,username from usertbl 
where birthyear>=1970 or height>=182;

--키가 180~183인 사람
select * from  usertbl where height>=180 and height<=183;
--between
select * from  usertbl where height between 180 and 183;
--in('문자열','문자열')
--전남,경북,경남 addr='전남' or addr='경북' or addr='경남'
select * from usertbl where addr='전남' or addr='경북' or addr='경남';
--in
select * from usertbl where addr in('전남','경북','경남');

--like ~와 비슷하다
--김씨를 찾는다
-- % -> 뭐든지 와도 된다
-- _ -> 뭐든지 오는데 한 글자만
select * from usertbl where username like '김%';
--종신 이름을 찾는다
select * from usertbl where username like '_종신';