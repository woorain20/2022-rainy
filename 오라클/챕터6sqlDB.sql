-- ��ü ���̺� Ȯ��
select * from tab;

select * from userTBL;
select * from buyTBL;

--���ڰ� �� �� '' ���.
select * from userTBL where userName='�̽±�';
select * from userTBL where addr='����';

--1970�� ���� ���, ������ 182�̻� ���̵�� �̸� ��ȸ
select userid,username 
from usertbl 
where birthyear>=1970 and height>=182;

--1970�� ���� ����߰ų� ������ 182�̻� ���̵�� �̸� ��ȸ
select userid,username from usertbl 
where birthyear>=1970 or height>=182;

--Ű�� 180~183�� ���
select * from  usertbl where height>=180 and height<=183;
--between
select * from  usertbl where height between 180 and 183;
--in('���ڿ�','���ڿ�')
--����,���,�泲 addr='����' or addr='���' or addr='�泲'
select * from usertbl where addr='����' or addr='���' or addr='�泲';
--in
select * from usertbl where addr in('����','���','�泲');

--like ~�� ����ϴ�
--�达�� ã�´�
-- % -> ������ �͵� �ȴ�
-- _ -> ������ ���µ� �� ���ڸ�
select * from usertbl where username like '��%';
--���� �̸��� ã�´�
select * from usertbl where username like '_����';