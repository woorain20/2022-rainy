select * from tab;

select * from buytbl;
select * from usertbl;

select * from buytbl where price<500;
select * from usertbl where birthyear<1972;

select birthyear,addr from usertbl;
select price,amount from buytbl;
select prodname,amount from buytbl where userid='BBK';

select username,addr from usertbl where mobile1=011;

select * from usertbl where addr='서울' or username like '김%';
select * from usertbl where addr='서울' and mdate>='10/01/01';
select * from usertbl where addr in('전남','경북','경남') or height<=175;
select * from usertbl where birthyear between 1965 and 1972;

select sum(AMOUNT) AS "총 구매개수", sum(price*amount) AS "총 구매가격"
from buytbl where userid='BBK';

select prodname, price, amount from buytbl where prodname='운동화';
select userid, groupname from buytbl where prodname like '_니터';
select userid, groupname from buytbl where prodname like '모%';
select mobile1, mobile2 from usertbl where username like '김%' or mdate<='10/02/01';
select mobile1, mobile2 from usertbl where username like '_재범' or height<=170;

select * from buytbl where prodname in('노트북','모니터');
select * from buytbl where amount between 3 and 6;
select sum(amount) AS "총 판매량", sum(price*amount) AS "총 수익"
from buytbl where groupname='전자';
