-- �������� (��������)  select ���� ���� ��� ����
select * from usertbl;

--���ȣ���� Ű�� ū ����� �̸��� Ű
select username, height from usertbl where height>177;
--����������
select username, height from usertbl 
where height>(select height from usertbl where username='���ȣ');
select height from usertbl where username='���ȣ';

--�泲������� Ű�� ū ���
select * from usertbl where addr='�泲';
--���� �߻�(�泲���� �з��� ����� 2���̹Ƿ�, ���������� 2����)
select username, height from usertbl
where height>(select height from usertbl where addr='�泲');
--any�� ����Ͽ� �ذ�(������ or�� ���� all�� and�� ����)
select username, height from usertbl
where height>any(select height from usertbl where addr='�泲');
select username, height from usertbl
where height>all(select height from usertbl where addr='�泲');
-- =any = in
select username, height from usertbl
where height=any(select height from usertbl where addr='�泲');
select username, height from usertbl
where height in (select height from usertbl where addr='�泲');

--�����Ͽ� ���
-- order by - ��������(asc �����Ǿ� ����)
select * from usertbl;
--������ ������� �̸� ���Գ�¥ ����
select username,mdate from usertbl order by mdate;
select username,birthyear from usertbl order by birthyear;
-- ��������(desc�� ���ָ� ��)
select username,mdate from usertbl order by mdate desc;
select username,birthyear from usertbl order by birthyear desc;
--Ű ū ������ �������� ����, �̸��� ��������
select username,height from usertbl order by height desc, username asc;
select username,birthyear,addr from usertbl order by birthyear desc, addr asc;
select username,addr,mobile1 from usertbl order by mobile1 asc, addr desc;

--�ߺ��� ���� �����ϰ� ��ȸ distinct
--ȸ������ ��� ������ ��ȸ
select addr from usertbl;
select distinct addr from usertbl; 
select distinct addr from usertbl order by addr;

--local hr
select * from employees;
select * from employees order by salary desc;
--���� ���� �ٹ��� ���� 5��
select * from 
(select employee_id, hire_date from employees order by hire_date)
where rownum <=5;
select * from 
(select first_name,last_name, salary from employees order by salary desc)
where rownum <=10;

--���õ����� �������� ��ȸ
--sample(�ۼ�Ʈ)
--���÷� ������ ���̵�, ��� ��¥�� 5%
select employee_id, hire_date from employees sample(5);

--sqlDB
select * from buytbl;
select * from usertbl;

--ȸ����(ȸ�� ���̵�, �ֹ���)�� �ֹ��� �� �� ��ȸ
select userid,prodname,amount from buytbl order by userid;
--ȸ������ �� �ֹ����� ��ȸ
--group by �� �����Լ��� ���� ����� ��
select userid,sum(amount) from buytbl group by userid;
--�����Լ�
--avg()-���, min()-�ּҰ�, max()-�ִ밪, count()-���� ����, sum()-��
select count(*) from usertbl;
-- as ~�� ����, �̸� Ű���� ����
select userid as"������",sum(amount) AS"�� ���ŷ�" from buytbl group by userid;
select userid as"������",sum(amount) AS"�� ���ŷ�",sum(price*amount) as"�ѱ��Ű�"
from buytbl group by userid;

--��ǰ �� ��� ����
select avg(amount) from buytbl;
select avg(amount) as"��� ���ż���" from buytbl;
--cast ����ȯ as number(�� �ڸ���,�Ҽ��� �ڸ�) �Ҽ��� ����
select cast(avg(amount) as number(7,3)) as"��� ���ż���" from buytbl;

--���� ū Ű�� ȸ��, ���� Ű�� ȸ��
select username,max(height),min(height) from usertbl group by username;
select username,height from usertbl
where height=(select max(height) from usertbl) 
or height=(select min(height) from usertbl);

select count(*) from usertbl;
select * from usertbl;
select count(mobile2) as "�޴��� �Է� �����" from usertbl;

--1000 �̻� ���� �� ����ǰ ���� ���
select userid AS "������", sum(price*amount) AS"�� ���ž�" from buytbl
group by userid;
--group by -> having, �����Լ��� �Բ� ��� ����� ���´�
select userid AS "������", sum(price*amount) AS"�� ���ž�" from buytbl
group by userid having sum(price*amount)>1000;
select userid AS "������", sum(price*amount) AS"�� ���ž�" from buytbl
group by userid having sum(price*amount)>1000 order by sum(price*amount);

--���հ� �߰� �հ� rollup()
--�з� ���� �հ� �� ���� ���ϰ� �ʹ�
select idnum, groupname,sum(price*amount) as"�Ǹž�" from buytbl
group by rollup(groupname, idnum);