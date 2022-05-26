-- ��(view) ���� �뵵�� �ַ� ���� ���̺� ���� ����
select * from usertbl;

create view v_usertbl as select userid, username, addr from usertbl;

select * from v_usertbl;

-- view ����: ���ȼ��� ����(������ ���� ���븸 �� �� ����)
-- ������ ������ �ܼ�ȭ ��ų �� �ִ�
select u.userid, u.username, b.prodname, u.addr, u.mobile1||u.mobile2
from usertbl u inner join buytbl b on u.userid=b.userid;
-- view�� ���� ���
create or replace view v_userbuytbl as
select u.userid, u.username, b.prodname, u.addr, u.mobile1||u.mobile2 as "����ó",
b.price, b.amount
from usertbl u inner join buytbl b on u.userid=b.userid;

select * from v_userbuytbl;
select * from v_userbuytbl where username='�����';

select username,prodname from v_userbuytbl;

create or replace view v_userbuytbl
as select u.userid as "���̵�", u.username as "�̸�", b.prodname as "��ǰ",
u.addr as "�ּ�", u.mobile1||u.mobile2 as "����ó"
from usertbl u inner join buytbl b on u.userid=b.userid;

select * from v_userbuytbl;

-- view ����
drop view v_usertbl;

select * from user_views;

create or replace view v_usertbl as
select userid, username, addr from usertbl;

-- view ����
update v_usertbl set addr='�λ�' where userid='JKW';
select * from v_usertbl;

insert into v_usertbl(userid,username,addr)
values('KBM','�躴��','���');
-- ���̺��� ������������ ���� ���� �߻�

create or replace view v_usertbl as
select userid, username, addr from usertbl with read only;
-- �б⸸ �ϴ� view

create or replace view v_sum as
select userid, sum(price*amount) as "Total"
from buytbl group by userid;

select * from v_sum order by "Total" desc;
-- ���� �Ұ� view 1. �����Լ� 2. join 3. distnct(�ߺ��Ұ�),group by, having

create or replace view v_height177 as
select * from usertbl where height>=177;
select * from v_height177;

delete from v_height177 where height<177;
insert into v_height177
values('KBM','�躴��',1977,'���','010','55555555',158,'2019-01-01');
--���� ���ǿ� �ɸ��� ������ �����Ͱ� ������ view���� �������ǻ� ������ ���� �� ����

create or replace view v_height177 as
select * from usertbl where height>=177
with check option;
--view�� ������ �ɾ ������ ���� �� üũ ��
select * from v_height177;

-- 224p DML �� ��