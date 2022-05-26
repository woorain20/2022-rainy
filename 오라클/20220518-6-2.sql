-- ������ ���� insert��
-- insert into ���̺�(��1, ��2,....)values(��1, ��2 ....);
select * from usertbl;
-- ���̸� ����
insert into usertbl
values('JSY','���ҿ�',1998,'����','010','12345678',157,'2022-05-18');
-- ���̸� �߰�
insert into usertbl(userid,username,birthyear,addr,height,mdate)
values('SSH','�ۼ���',1997,'�泲',164,'2022-04-02');

-- ������ ����: update��
-- update ���̺� �̸� set ��1=��1, ��2=��2....where ����;
-- where ������ �⺻Ű(��Ű)�� �ϴ°� ����
insert into usertbl
values('NHC','��ȫĥ',1979,'�泲','010','12312312',183,'2022-03-06');
--�̸� Ű ����
update usertbl
set username='��ȫö', height=179
where userid='NHC';
--where�� �� ��� ��� ������ set�� �������� �ٲ�
-- Į��(column) ��ü�� ����
update usertbl
set mobile1='010';

-- commit(F11)�ϱ� ������ rollback(F12)�� �� �� ����
-- commit(F11) ���Ŀ���  rollback(F12)�� �� ����

insert into usertbl
values('NHC1','��ȫĥ',1979,'�泲','010','12312312',183,'2022-03-06');
insert into usertbl
values('NHC2','��ȫĥ',1979,'�泲','010','12312312',183,'2022-03-06');
update usertbl
set username='��ȫö' where username='��ȫĥ';

-- ������ ����: delete
-- delete from ���̺� �̸� where ����;
delete from usertbl where userid='NHC1';
delete from usertbl where username='��ȫö';

insert into usertbl
values('NHC','��ȫö',1979,'�泲','010','12312312',179,'2022-03-06');
insert into usertbl
values('NHC1','��ȫö',1979,'�泲','010','12312312',179,'2022-03-06');
insert into usertbl
values('NHC2','��ȫö',1979,'�泲','010','12312312',179,'2022-03-06');

delete from usertbl where username='��ȫö' and rownum<=2;
update usertbl set userid='NHC' where userid='NHC2';

-- ���� (join)
select * from usertbl;
select * from buytbl;
--select �� ��� from ù��° ���̺� inner join �ι�° ���̺� on ���ε� ����
--where �˻�����

select * from buytbl
inner join usertbl
on buytbl.userid=usertbl.userid;
-- BBK ���� �ֹ� ���
select * from buytbl b inner join usertbl u
on b.userid=u.userid where b.userid='BBK';
-- buytbl b�� buytbl�� b�� ���� �� ���� as "b"�� ������ ��

-- 8��° �ֹ� �ù� �߼� �ֹ���, �ֹ����� ��ȭ��ȣ, �ּ�, ��ǰ, ����, ����
select u.username,u.mobile1||u.mobile2,u.addr,b.prodname,b.amount,b.price
from buytbl b inner join usertbl u
on b.userid=u.userid where b.idnum>'8';

select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;

-- �л� �̸�, ����, ������ ���Ƹ�, ���Ƹ� ȣ��
select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s
inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname=c.clubname
order by s.stdname, c.roomno;

-- outer join
-- ��ü ȸ���� �������� �ֹ� ������ �����;� �ȴ�
-- select �� ��� from ù��°(left) ���̺�(left/right/full)
-- outer join �ι�°(right) ���̺� on ���ε� ����
-- where �˻�����;
select * from usertbl u
left outer join buytbl b
on u.userid=b.userid
order by u.userid;

select * from buytbl b
right outer join usertbl u
on u.userid=b.userid
order by u.userid;

select * from usertbl u
full outer join buytbl b 
on u.userid=b.userid
order by u.userid;

select * from stdtbl s
left outer join stdclubtbl sc
on s.stdname=sc.stdname
left outer join clubtbl c
on sc.clubname=c.clubname
order by s.stdname, c.roomno;
