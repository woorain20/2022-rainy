create user sportsDB identified by 1111
default tablespace users
temporary tablespace temp;

grant connect, resource, dba to sportsDB;

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

drop table teamtbl;
drop table playertbl;    
    