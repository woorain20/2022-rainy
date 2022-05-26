create table teamtbl(
    teamID char(8) not null primary key,
    teamName nvarchar2(16) not null,
    foundation number(4) not null,
    nation nchar(8) not null,
    hometown nchar(8) not null,
    leagueWin number(3),
    cupWin number(3),
    continentWin number(3),
    stadium nvarchar2(16) not null,
    admitted number(6) not null
);

create table playertbl(
    team nvarchar2(8) not null primary key,
    playerName nvarchar2(16) not null,
    birthYear number(4) not null,
    nation nchar(8) not null,
    mainp nchar(4) not null,
    subp nchar(4),
    height number(3),
    weight number(3),
    foot nchar(3)
);

alter table teamtbl
    add(league nchar(8) not null,
    coach varchar2(16) not null);
alter table teamtbl
    modify(teamName nvarchar2(20));
alter table teamtbl
    modify(coach nvarchar2(30));
alter table teamtbl
    modify(league nchar(16));
alter table playertbl
    drop column foot;
alter table playertbl
    modify(playerName nvarchar2(30));
alter table playertbl
    drop column subp;
alter table playertbl
    add(backNum number(2));
alter table playertbl
    drop primary key;
alter table playertbl
    modify(team nvarchar2(20));

insert into teamtbl
values('ARS','Arsenal',1886,'영국','런던',13,14,'','에미레이트 스타디움','60704','EPL','미켈 아르테타');
insert into teamtbl
values('BAR','Barcelona',1899,'스페인','바르셀로나',26,31,5,'캄 노우','99354','La liga','차비 에르난데스');
insert into teamtbl
values('RM','Real Madrid',1902,'스페인','마드리드',35,19,13,'산티아고 베르나베우','81044','La liga','카를로 안첼로티');
insert into teamtbl
values('ACM','AC Milan',1899,'이탈리아','밀라노',18,5,7,'주세페 메아자','80018','Serie A','인자기');
insert into teamtbl
values('IM','Internazionale',1908,'이탈리아','밀라노',19,8,3,'주세페 메아자','80018','Serie A','스테파노 피올리');
insert into teamtbl
values('PSG','Paris Saint Germain',1970,'프랑스','파리',10,14,'','파르크 데 프랑스','47929','league 1','마우리시오 포체티노');
insert into teamtbl
values('BM','Bayern Munchen',1900,'독일','뮌헨',31,20,6,'알리안츠 아레나','75000','Bundesliga','율리안 나겔스만');
insert into teamtbl
values('LIV','Liverpool',1892,'영국','리버풀',19,8,6,'안필드','54074','EPL','위르겐 클롭');
insert into teamtbl
values('BVB','Borussia Dortmund',1909,'독일','도르트문트',5,5,1,'지그날 이두나 파크','81359','Bundesliga','마르코 로제');
insert into teamtbl
values('MU','Manchester United',1878,'영국','맨체스터',20,12,3,'올드 트래포트','74879','EPL','에릭 텐하흐');
insert into teamtbl
values('CHE','Chelsea',1905,'영국','런던',6,8,2,'스탬포드 브릿지','40834','EPL','토마스 투헬');
insert into teamtbl 
values('Ajax','AFC Ajax',1900,'네덜란드','암스테르담',36,20,4,'요한 크루이프 아레나','55500','Eredivisie','알프러트 스뢰더르');
insert into teamtbl
values('SLB','SL Benfica',1904,'포르투갈','리스본',37,29,2,'이스타디우 다 루스','64642','Primeira Liga','넬송 베리시무');

select * from teamtbl;

insert into playertbl
values('Arsenal','Emile Smith Rowe',2000,'영국','MF',182,72,10);
insert into playertbl
values('Arsenal','Bukayo Saka',2001,'영국','FW',181,73,7);
insert into playertbl
values('Arsenal','Martin Ødegaard',1998,'노르웨이','MF',178,68,8);
insert into playertbl
values('Arsenal','Ben White',1997,'영국','DF',186,78,4);
insert into playertbl
values('Arsenal','Thomas Partey',1993,'가나','MF',185,76,5);
insert into playertbl
values('Arsenal','Gabriel Martinelli',2001,'브라질','FW',182,75,35);
insert into playertbl
values('Arsenal','Charlie Patino',2003,'영국','MF',183,67,87);
insert into playertbl
values('Arsenal','Kieran Tierney',1997,'영국','DF',178,70,3);
insert into playertbl
values('Arsenal','Aaron Ramsdale',1998,'영국','GK',191,77,32);
insert into playertbl
values('Arsenal','Mohamed Elneny',1992,'이집트','MF',180,70,25);
insert into playertbl
values('Arsenal','Gabriel Magalh?es',1997,'브라질','DF',190,87,6);

update teamtbl set coach='시모네 인자기' where coach='인자기';

select * from playertbl;

insert into playertbl
values('Liverpool','Virgil van Dijk',1991,'네덜란드','DF',193,92,4);
insert into playertbl
values('Liverpool','Alisson Becker',1992,'브라질','GK',191,91,1);
insert into playertbl
values('Liverpool','Trent Alexander-Arnold',1998,'영국','DF',180,72,66);
insert into playertbl
values('Liverpool','Mohamed Salah',1992,'이집트','FW',175,71,11);
insert into playertbl
values('Liverpool','Thiago Alc?ntara',1991,'스페인','MF',174,70,6);
insert into playertbl
values('Barcelona','Pedri',2002,'스페인','MF',174,60,16);
insert into playertbl
values('Barcelona','Frenkie De Jong',1997,'네덜란드','MF',180,74,21);
insert into playertbl
values('Barcelona','Ousmane Demb?l?',1997,'프랑스','FW',178,67,7);
insert into playertbl
values('Barcelona','Ferran Torres',2000,'스페인','FW',184,77,19);
insert into playertbl
values('Barcelona','Marc-Andr? Ter Stegen',1992,'독일','GK',187,85,1);
insert into playertbl
values('Real Madrid','Karim Benzema',1987,'프랑스','FW',185,81,9);
insert into playertbl
values('Real Madrid','Dani Ceballos',1996,'스페인','MF',179,71,19);
insert into playertbl
values('Real Madrid','V?nicius J?nioR',2000,'브라질','FW',176,73,20);
insert into playertbl
values('Real Madrid','Marcelo',1988,'브라질','DF',174,80,12);
insert into playertbl
values('Real Madrid','Luca Modri?',1985,'크로아티아','MF',172,66,10);
insert into playertbl
values('Bayern Munchen','Robert Lewandowski',1988,'폴란드','FW',185,78,9);
insert into playertbl
values('Bayern Munchen','Serge Gnabry',1995,'독일','FW',175,75,7);
insert into playertbl
values('Bayern Munchen','Dayot Upamecano',1998,'프랑스','DF',186,90,2);
insert into playertbl
values('Bayern Munchen','Manuel Neuer',1986,'독일','GK',193,93,1);
insert into playertbl
values('Bayern Munchen','Joshua Kimmich',1995,'독일','DF',176,70,6);
insert into playertbl
values('AC Milan','Alessio Romagnoli',1995,'이탈리아','DF',188,75,13);
insert into playertbl
values('AC Milan','Sandro Tonali',2000,'이탈리아','MF',181,80,8);
insert into playertbl
values('AC Milan','Zlatan Ibrahimovi?',1981,'스웨덴','FW',195,98,11);
insert into playertbl
values('Borussia Dortmund','Erling Haaland',2000,'노르웨이','FW',194,88,9);
insert into playertbl
values('Borussia Dortmund','Jude Bellingham',2003,'영국','MF',186,75,22);
insert into playertbl
values('Borussia Dortmund','Julian Brandt',1996,'독일','MF',185,83,19);

select t.teamid, t.teamname, p.playername, p.mainp, p.birthyear, p.backnum
from teamtbl t inner join playertbl p on t.teamname=p.team
where t.teamname='Arsenal' order by p.backnum;
