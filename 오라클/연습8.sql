select * from teamtbl;
select * from playertbl;

create view v_teamtbl as 
select teamid,teamname,foundation,hometown,stadium from teamtbl;
select * from v_teamtbl order by teamid;

create or replace view v_teamplayertbl as
select t.teamid,t.teamname,t.hometown,p.playername,p.birthyear,p.nation,p.mainp
from teamtbl t inner join playertbl p on t.teamname=p.team;
select * from v_teamplayertbl order by teamid, birthyear; 
select * from v_teamplayertbl where teamid='ARS' order by birthyear;

drop view v_teamtbl;

select * from user_views;

update v_teamtbl set teamid='Inter' where teamid='IM';
update v_teamtbl set teamid='RMA' where teamid='RM';
update v_teamtbl set teamid='MUF' where teamid='MU';
UPDATE v_teamtbl set teamid='Bayern' where teamid='BM';


create or replace view v_found1900 as
select * from teamtbl where foundation<1900;
SELECT * FROM v_found1900;

create or replace view v_avgheight as
select team, cast(avg(height) as number(7,2)) as "avg H"
from playertbl group by team;
select * from v_avgheight;

create or replace view v_avgweight as
select team, cast(avg(weight) as number(7,2)) as "avg W"
from playertbl group by team;
select * from v_avgweight;

create or replace view v_win as
select cast(avg(leagueWin) as number(7,2)) as "champion" from teamtbl;
select * from v_win;
create or replace view v_win1 as
select cast(avg(leagueWin) as number(7,2)) as "champion" from teamtbl
where leagueWin>(select * from v_win);
select * from v_win1;

drop view v_win1;

select * from teamtbl where leaguewin>(select * from v_win);
select * from playertbl where team='Arsenal'
and height>(select "avg H" from v_avgheight where team='Arsenal');
select * from playertbl where team='Arsenal'
and weight>(select "avg W" from v_avgweight where team='Arsenal');