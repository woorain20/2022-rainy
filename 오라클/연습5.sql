select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;

insert into stdtbl values('노홍철','충남');
insert into stdtbl values('박명수','전북');
insert into stdtbl values('정형돈','부산');
insert into stdtbl values('유재석','서울');
insert into stdtbl values('정준하','서울');
insert into stdtbl values('하동훈','서울');
insert into stdtbl values('김종문','서올');
insert into stdtbl values('이상열','경기');
insert into stdtbl values('양세찬','경기');

update stdtbl set stdname='김종민', addr='서울' where stdname='김종문';
update stdtbl set stdname='이상엽' where stdname='이상열';

insert into clubtbl values('영화감상','201호');
insert into clubtbl values('독서', '303호');
insert into clubtbl VALUES('연극','206호');
insert into clubtbl values('야구', '108호');
insert into clubtbl values('댄수', '204오');

update clubtbl set clubname='댄스', roomno='204호' where clubname='댄수';

insert into stdclubtbl values(7, '유재석', '야구');
insert into stdclubtbl values(8, '노홍철', '영화감상');
insert into stdclubtbl values(9, '정형돈', '연극');
insert into stdclubtbl values(10, '정준하', '야구');
insert into stdclubtbl values(11, '정준하', '독서');
insert into stdclubtbl values(12, '하동훈', '바둑');
insert into stdclubtbl values(13, '정준하', '축구');
insert into stdclubtbl values(14, '정준하', '연극');
insert into stdclubtbl values(15, '노홍철', '바둑');
insert into stdclubtbl values(16, '김종민', '댄스');
insert into stdclubtbl values(17, '이상엽', '연극');

delete from stdclubtbl where stdname='하동훈';
delete from stdclubtbl where idnum=13;
delete from stdclubtbl where stdname='정준하' and rownum<=2;

select * from stdtbl inner join stdclubtbl
on stdtbl.stdname=stdclubtbl.stdname;

select * from stdtbl s inner join stdclubtbl sc
on s.stdname=sc.stdname where s.stdname='정준하';

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
where sc.clubname='바둑' order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on s.stdname=sc.stdname
inner join clubtbl c on sc.clubname = c.clubname
where c.roomno='104호' order by s.stdname;

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
where s.addr!='서울' order by s.addr;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
order by c.roomno;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.roomno!='104호' order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.roomno is null order by s.stdname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.clubname!='축구' and c.clubname!='야구'
order by c.roomno, s.addr;

select * from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where s.addr='서울' order by s.stdname;

select * from buytbl;
select * from usertbl;

insert into usertbl
values('PMS','박명수',1970,'전북','010','98765432',172,'2021-04-30');
insert into usertbl
values ('JHD','정형돈',1978,'부산','010','45645678',175,'2020-08-14');

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
where s.addr='경기' order by s.addr;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s inner join stdclubtbl sc on sc.stdname = s.stdname
inner join clubtbl c on sc.clubname = c.clubname
where s.stdname='정준하' order by c.clubname;

select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s left outer join stdclubtbl sc on sc.stdname = s.stdname
left outer join clubtbl c on sc.clubname = c.clubname
where c.clubname='연극' or s.addr='전북' or c.roomno like '_03호'
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