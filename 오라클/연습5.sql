select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;

insert into stdtbl values('��ȫö','�泲');
insert into stdtbl values('�ڸ��','����');
insert into stdtbl values('������','�λ�');
insert into stdtbl values('���缮','����');
insert into stdtbl values('������','����');
insert into stdtbl values('�ϵ���','����');
insert into stdtbl values('������','����');
insert into stdtbl values('�̻�','���');
insert into stdtbl values('�缼��','���');

update stdtbl set stdname='������', addr='����' where stdname='������';
update stdtbl set stdname='�̻�' where stdname='�̻�';

insert into clubtbl values('��ȭ����','201ȣ');
insert into clubtbl values('����', '303ȣ');
insert into clubtbl VALUES('����','206ȣ');
insert into clubtbl values('�߱�', '108ȣ');
insert into clubtbl values('���', '204��');

update clubtbl set clubname='��', roomno='204ȣ' where clubname='���';

insert into stdclubtbl values(7, '���缮', '�߱�');
insert into stdclubtbl values(8, '��ȫö', '��ȭ����');
insert into stdclubtbl values(9, '������', '����');
insert into stdclubtbl values(10, '������', '�߱�');
insert into stdclubtbl values(11, '������', '����');
insert into stdclubtbl values(12, '�ϵ���', '�ٵ�');
insert into stdclubtbl values(13, '������', '�౸');
insert into stdclubtbl values(14, '������', '����');
insert into stdclubtbl values(15, '��ȫö', '�ٵ�');
insert into stdclubtbl values(16, '������', '��');
insert into stdclubtbl values(17, '�̻�', '����');

delete from stdclubtbl where stdname='�ϵ���';
delete from stdclubtbl where idnum=13;
delete from stdclubtbl where stdname='������' and rownum<=2;

select * from stdtbl inner join stdclubtbl
on stdtbl.stdname=stdclubtbl.stdname;

select * from stdtbl s inner join stdclubtbl sc
on s.stdname=sc.stdname where s.stdname='������';

select * from stdtbl s inner join stdclubtbl sc
on s.stdname=sc.stdname
inner join clubtbl c on c.clubname=sc.clubname
order by c.roomno, sc.idnum;

select s.stdname, s.addr, sc.clubname, c.roomno 
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on c.clubname=sc.clubname
order by c.roomno, sc.idnum;

select s.stdname, s.addr, sc.clubname, c.roomno 
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on c.clubname=sc.clubname
where sc.clubname='�ٵ�' order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname = c.clubname
where c.roomno='104ȣ' order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname = c.clubname
where c.roomno like '1%' order by c.roomno, s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname = c.clubname
where sc.idnum between 6 and 12 order by c.roomno, s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname = c.clubname
where c.roomno like '2%' order by c.roomno, s.stdname;

select * from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname = c.clubname
where s.addr!='����' order by s.addr;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
order by c.roomno;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.roomno!='104ȣ' order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.roomno is null order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.clubname!='�౸' and c.clubname!='�߱�'
order by c.roomno, s.addr;

select * from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where s.addr='����' order by s.stdname;

select * from buytbl;
select * from usertbl;

insert into usertbl
values('PMS','�ڸ��',1970,'����','010','98765432',172,'2021-04-30');
insert into usertbl
values ('JHD','������',1978,'�λ�','010','45645678',175,'2020-08-14');

select * from usertbl u 
inner join stdtbl s on s.addr=u.addr
inner join buytbl b on b.userid=u.userid
inner join stdclubtbl sc on sc.stdname=s.stdname
inner join clubtbl c on c.clubname=sc.clubname;

select * from usertbl u left outer join buytbl b on u.userid=b.userid
where b.idnum is null order by u.addr, u.userid;

select u.username, u.mobile1||u.mobile2 from usertbl u 
left outer join buytbl b on u.userid=b.userid
where b.idnum is null order by u.username;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on sc.stdname = s.stdname
inner join clubtbl c on sc.clubname = c.clubname
where s.addr='���' order by s.addr;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on sc.stdname = s.stdname
inner join clubtbl c on sc.clubname = c.clubname
where s.stdname='������' order by c.clubname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.clubname='����' or s.addr='����' or c.roomno like '_03ȣ'
order by s.stdname;

select * from countries;
select * from regions;
select * from locations;

select c.country_id, c.country_name, r.region_id, r.region_name, l.city,
l.location_id, l.postal_code
from countries c inner join regions r on r.region_id = c.region_id
inner join locations l on c.country_id=l.country_id
where l.location_id between 1600 and 2200
order by c.country_name, l.city;

select c.country_id, c.country_name, r.region_id, r.region_name, l.city,
l.location_id, l.postal_code
from countries c inner join regions r on r.region_id = c.region_id
inner join locations l on c.country_id=l.country_id
where c.country_id like 'U%' or l.city like 'S%';