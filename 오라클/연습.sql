select * from tab;

select * from buytbl;
select * from usertbl;

select * from buytbl where price<500;
select * from usertbl where birthyear<1972;

select birthyear,addr from usertbl;
select price,amount from buytbl;
select prodname,amount from buytbl where userid='BBK';

select username,addr from usertbl where mobile1=011;

select * from usertbl where addr='����' or username like '��%';
select * from usertbl where addr='����' and mdate>='10/01/01';
select * from usertbl where addr in('����','���','�泲') or height<=175;
select * from usertbl where birthyear between 1965 and 1972;

select sum(AMOUNT) AS "�� ���Ű���", sum(price*amount) AS "�� ���Ű���"
from buytbl where userid='BBK';

select prodname, price, amount from buytbl where prodname='�ȭ';
select userid, groupname from buytbl where prodname like '_����';
select userid, groupname from buytbl where prodname like '��%';
select mobile1, mobile2 from usertbl where username like '��%' or mdate<='10/02/01';
select mobile1, mobile2 from usertbl where username like '_���' or height<=170;

select * from buytbl where prodname in('��Ʈ��','�����');
select * from buytbl where amount between 3 and 6;
select sum(amount) AS "�� �Ǹŷ�", sum(price*amount) AS "�� ����"
from buytbl where groupname='����';
