-- SQL - ������ ���̽� ��ɹ�
-- select�� - ������ ��ȸ
-- ��ü ������ ��ȸ
-- * = all
select * from employees;
-- select �� �̸� from ���̺� �̸� where ����
select * from HR.employees;
select email from employees;
select email,phone_number from employees;
select phone_NUMBER from employees;
select phone_NUMBER from employees where salary <10000;

--select ���̸�(row name) from ���̺� �̸�(table name) where condition
