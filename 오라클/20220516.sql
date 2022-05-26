-- SQL - 데이터 베이스 명령문
-- select문 - 데이터 조회
-- 전체 데이터 조회
-- * = all
select * from employees;
-- select 열 이름 from 테이블 이름 where 조건
select * from HR.employees;
select email from employees;
select email,phone_number from employees;
select phone_NUMBER from employees;
select phone_NUMBER from employees where salary <10000;

--select 열이름(row name) from 테이블 이름(table name) where condition
