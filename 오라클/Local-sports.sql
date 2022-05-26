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
values('ARS','Arsenal',1886,'����','����',13,14,'','���̷���Ʈ ��Ÿ���','60704','EPL','���� �Ƹ���Ÿ');
insert into teamtbl
values('BAR','Barcelona',1899,'������','�ٸ����γ�',26,31,5,'į ���','99354','La liga','���� ����������');
insert into teamtbl
values('RM','Real Madrid',1902,'������','���帮��',35,19,13,'��Ƽ�ư� ����������','81044','La liga','ī���� ��ÿ��Ƽ');
insert into teamtbl
values('ACM','AC Milan',1899,'��Ż����','�ж��',18,5,7,'�ּ��� �޾���','80018','Serie A','���ڱ�');
insert into teamtbl
values('IM','Internazionale',1908,'��Ż����','�ж��',19,8,3,'�ּ��� �޾���','80018','Serie A','�����ĳ� �ǿø�');
insert into teamtbl
values('PSG','Paris Saint Germain',1970,'������','�ĸ�',10,14,'','�ĸ�ũ �� ������','47929','league 1','���츮�ÿ� ��üƼ��');
insert into teamtbl
values('BM','Bayern Munchen',1900,'����','����',31,20,6,'�˸����� �Ʒ���','75000','Bundesliga','������ ���ֽ���');
insert into teamtbl
values('LIV','Liverpool',1892,'����','����Ǯ',19,8,6,'���ʵ�','54074','EPL','������ Ŭ��');
insert into teamtbl
values('BVB','Borussia Dortmund',1909,'����','����Ʈ��Ʈ',5,5,1,'���׳� �̵γ� ��ũ','81359','Bundesliga','������ ����');
insert into teamtbl
values('MU','Manchester United',1878,'����','��ü����',20,12,3,'�õ� Ʈ����Ʈ','74879','EPL','���� ������');
insert into teamtbl
values('CHE','Chelsea',1905,'����','����',6,8,2,'�������� �긴��','40834','EPL','�丶�� ����');
insert into teamtbl 
values('Ajax','AFC Ajax',1900,'�״�����','�Ͻ��׸���',36,20,4,'���� ũ������ �Ʒ���','55500','Eredivisie','������Ʈ ���ڴ���');
insert into teamtbl
values('SLB','SL Benfica',1904,'��������','������',37,29,2,'�̽�Ÿ��� �� �罺','64642','Primeira Liga','�ڼ� �����ù�');

select * from teamtbl;

insert into playertbl
values('Arsenal','Emile Smith Rowe',2000,'����','MF',182,72,10);
insert into playertbl
values('Arsenal','Bukayo Saka',2001,'����','FW',181,73,7);
insert into playertbl
values('Arsenal','Martin ��degaard',1998,'�븣����','MF',178,68,8);
insert into playertbl
values('Arsenal','Ben White',1997,'����','DF',186,78,4);
insert into playertbl
values('Arsenal','Thomas Partey',1993,'����','MF',185,76,5);
insert into playertbl
values('Arsenal','Gabriel Martinelli',2001,'�����','FW',182,75,35);
insert into playertbl
values('Arsenal','Charlie Patino',2003,'����','MF',183,67,87);
insert into playertbl
values('Arsenal','Kieran Tierney',1997,'����','DF',178,70,3);
insert into playertbl
values('Arsenal','Aaron Ramsdale',1998,'����','GK',191,77,32);
insert into playertbl
values('Arsenal','Mohamed Elneny',1992,'����Ʈ','MF',180,70,25);
insert into playertbl
values('Arsenal','Gabriel Magalh?es',1997,'�����','DF',190,87,6);

update teamtbl set coach='�ø�� ���ڱ�' where coach='���ڱ�';

select * from playertbl;

insert into playertbl
values('Liverpool','Virgil van Dijk',1991,'�״�����','DF',193,92,4);
insert into playertbl
values('Liverpool','Alisson Becker',1992,'�����','GK',191,91,1);
insert into playertbl
values('Liverpool','Trent Alexander-Arnold',1998,'����','DF',180,72,66);
insert into playertbl
values('Liverpool','Mohamed Salah',1992,'����Ʈ','FW',175,71,11);
insert into playertbl
values('Liverpool','Thiago Alc?ntara',1991,'������','MF',174,70,6);
insert into playertbl
values('Barcelona','Pedri',2002,'������','MF',174,60,16);
insert into playertbl
values('Barcelona','Frenkie De Jong',1997,'�״�����','MF',180,74,21);
insert into playertbl
values('Barcelona','Ousmane Demb?l?',1997,'������','FW',178,67,7);
insert into playertbl
values('Barcelona','Ferran Torres',2000,'������','FW',184,77,19);
insert into playertbl
values('Barcelona','Marc-Andr? Ter Stegen',1992,'����','GK',187,85,1);
insert into playertbl
values('Real Madrid','Karim Benzema',1987,'������','FW',185,81,9);
insert into playertbl
values('Real Madrid','Dani Ceballos',1996,'������','MF',179,71,19);
insert into playertbl
values('Real Madrid','V?nicius J?nioR',2000,'�����','FW',176,73,20);
insert into playertbl
values('Real Madrid','Marcelo',1988,'�����','DF',174,80,12);
insert into playertbl
values('Real Madrid','Luca Modri?',1985,'ũ�ξ�Ƽ��','MF',172,66,10);
insert into playertbl
values('Bayern Munchen','Robert Lewandowski',1988,'������','FW',185,78,9);
insert into playertbl
values('Bayern Munchen','Serge Gnabry',1995,'����','FW',175,75,7);
insert into playertbl
values('Bayern Munchen','Dayot Upamecano',1998,'������','DF',186,90,2);
insert into playertbl
values('Bayern Munchen','Manuel Neuer',1986,'����','GK',193,93,1);
insert into playertbl
values('Bayern Munchen','Joshua Kimmich',1995,'����','DF',176,70,6);
insert into playertbl
values('AC Milan','Alessio Romagnoli',1995,'��Ż����','DF',188,75,13);
insert into playertbl
values('AC Milan','Sandro Tonali',2000,'��Ż����','MF',181,80,8);
insert into playertbl
values('AC Milan','Zlatan Ibrahimovi?',1981,'������','FW',195,98,11);
insert into playertbl
values('Borussia Dortmund','Erling Haaland',2000,'�븣����','FW',194,88,9);
insert into playertbl
values('Borussia Dortmund','Jude Bellingham',2003,'����','MF',186,75,22);
insert into playertbl
values('Borussia Dortmund','Julian Brandt',1996,'����','MF',185,83,19);

select t.teamid, t.teamname, p.playername, p.mainp, p.birthyear, p.backnum
from teamtbl t inner join playertbl p on t.teamname=p.team
where t.teamname='Arsenal' order by p.backnum;
