-- 서브쿼리 (하위쿼리)  select 문을 겹쳐 사용 가능
select * from usertbl;

--김경호보다 키가 큰 사람의 이름과 키
select username, height from usertbl where height>177;
--서브쿼리로
select username, height from usertbl 
where height>(select height from usertbl where username='김경호');
select height from usertbl where username='김경호';

--경남사람보다 키가 큰 사람
select * from usertbl where addr='경남';
--에러 발생(경남으로 분류된 사람이 2명이므로, 서브쿼리가 2개라서)
select username, height from usertbl
where height>(select height from usertbl where addr='경남');
--any를 사용하여 해결(연산자 or와 유사 all은 and와 유사)
select username, height from usertbl
where height>any(select height from usertbl where addr='경남');
select username, height from usertbl
where height>all(select height from usertbl where addr='경남');
-- =any = in
select username, height from usertbl
where height=any(select height from usertbl where addr='경남');
select username, height from usertbl
where height in (select height from usertbl where addr='경남');

--정렬하여 출력
-- order by - 오름차순(asc 생략되어 있음)
select * from usertbl;
--가입한 순서대로 이름 가입날짜 정렬
select username,mdate from usertbl order by mdate;
select username,birthyear from usertbl order by birthyear;
-- 내림차순(desc를 써주면 됨)
select username,mdate from usertbl order by mdate desc;
select username,birthyear from usertbl order by birthyear desc;
--키 큰 순으로 내림차순 정렬, 이름은 오름차순
select username,height from usertbl order by height desc, username asc;
select username,birthyear,addr from usertbl order by birthyear desc, addr asc;
select username,addr,mobile1 from usertbl order by mobile1 asc, addr desc;

--중복된 것을 제외하고 조회 distinct
--회원들의 사는 지역을 조회
select addr from usertbl;
select distinct addr from usertbl; 
select distinct addr from usertbl order by addr;

--local hr
select * from employees;
select * from employees order by salary desc;
--가장 오래 근무한 상위 5명
select * from 
(select employee_id, hire_date from employees order by hire_date)
where rownum <=5;
select * from 
(select first_name,last_name, salary from employees order by salary desc)
where rownum <=10;

--샘플데이터 랜덤으로 조회
--sample(퍼센트)
--샘플로 직원의 아이디, 고용 날짜를 5%
select employee_id, hire_date from employees sample(5);

--sqlDB
select * from buytbl;
select * from usertbl;

--회원들(회원 아이디, 주문량)이 주문한 건 수 조회
select userid,prodname,amount from buytbl order by userid;
--회원들의 총 주문수를 조회
--group by 와 집계함수를 같이 써줘야 함
select userid,sum(amount) from buytbl group by userid;
--집계함수
--avg()-평균, min()-최소값, max()-최대값, count()-행의 개수, sum()-합
select count(*) from usertbl;
-- as ~와 같이, 이름 키워드 변경
select userid as"구매자",sum(amount) AS"총 구매량" from buytbl group by userid;
select userid as"구매자",sum(amount) AS"총 구매량",sum(price*amount) as"총구매가"
from buytbl group by userid;

--상품 판 평균 갯수
select avg(amount) from buytbl;
select avg(amount) as"평균 구매수량" from buytbl;
--cast 형변환 as number(총 자리수,소수점 자리) 소수점 제한
select cast(avg(amount) as number(7,3)) as"평균 구매수량" from buytbl;

--가장 큰 키의 회원, 작은 키의 회원
select username,max(height),min(height) from usertbl group by username;
select username,height from usertbl
where height=(select max(height) from usertbl) 
or height=(select min(height) from usertbl);

select count(*) from usertbl;
select * from usertbl;
select count(mobile2) as "휴대폰 입력 사용자" from usertbl;

--1000 이상 구매 고객 사은품 증정 행사
select userid AS "구매자", sum(price*amount) AS"총 구매액" from buytbl
group by userid;
--group by -> having, 집계함수와 함께 써야 결과값 나온다
select userid AS "구매자", sum(price*amount) AS"총 구매액" from buytbl
group by userid having sum(price*amount)>1000;
select userid AS "구매자", sum(price*amount) AS"총 구매액" from buytbl
group by userid having sum(price*amount)>1000 order by sum(price*amount);

--총합계 중간 합계 rollup()
--분류 별로 합계 그 총합 구하고 싶다
select idnum, groupname,sum(price*amount) as"판매액" from buytbl
group by rollup(groupname, idnum);