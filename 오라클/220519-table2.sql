-- p349-354
create table user2tbl(
    userID char(8),
    userName nvarchar2(10),
    birthYear number(4),
    addr nchar(2),
    mobile1 char(3),
    mobile2 char(8),
    height number(3),
    mDate date
);    
create table buy2tbl(
    idNum number(8) primary key,
    userId char(8),
    prodName nchar(6),
    groupName nchar(4),
    price number(8),
    amount number(3)
);
drop sequence idseq;
create sequence idseq;

insert into user2tbl
values('LSG','�̽±�',1987,'����','011','11111111',182,'2008-8-8');
insert into user2tbl
values('KBS','�����',null,'����','011','22222222',173,'2012-4-4');
insert into user2tbl
values('KKH','���ȣ',1871,'����','019','33333333',177,'2007-7-7');
insert into user2tbl
values('JYP','������',1950,'���','011','44444444',166,'2009-4-4');

insert into buy2tbl
values(idseq.nextval,'KBS','�ȭ',null,30,2);
insert into buy2tbl
values(idseq.nextval,'KBS','��Ʈ��','����',1000,1);
insert into buy2tbl
values(idseq.nextval,'JYP','�����','����',200,1);
insert into buy2tbl
values(idseq.nextval,'BBK','�����','����',200,5);

select * from user2tbl;
select * from buy2tbl;

-- ȸ�� primary key ����
alter table user2tbl
    add constraint pk_user2tbl_userID
    primary key(userID);
-- ���� ���̺� �ܷ�Ű ����
alter table buy2tbl
    add constraint fk_user2tbl_buy2tbl
    foreign key(userid)
    references user2tbl(userid);
-- ���� �߻� ���� ���̺� ȸ�� ���̺��� ���� BBK�� �����Ƿ�
delete from buy2tbl where userid='BBK';
-- BBK ���� �� �����
-- ���� ���� �ӽ� �߽�
alter table buy2tbl
    disable constraint fk_user2tbl_buy2tbl;
insert into buy2tbl
values(idseq.nextval,'BBK','�����','����',200,5);
-- ���� ���� ȸ��
alter table buy2tbl
    enable novalidate constraint fk_user2tbl_buy2tbl;
insert into user2tbl
values('BBK','�ٺ�Ŵ',1973,'����','010','00000000',176,'2013-5-5');
-- �ٺ�Ŵ ȸ�� Ż��
delete from user2tbl where userid='BBK';
-- ���� �߻��� �Ͼ userid�� ������� �����Ƿ�
-- ȸ��Ż�� ��ư->�鿣�� �ڹ� �������̺� ����, ȸ�����̺�
alter table buy2tbl
    drop constraint fk_user2tbl_buy2tbl;
alter table buy2tbl
    add constraint fk_user2tbl_buy2tbl
    foreign key(userid)
    references user2tbl(userid)
    on delete cascade;
-- on delete cascade ������ �ܷ�Ű�� ������ �ִ� ���̺��� �����Ͱ� ���� ����
alter table user2tbl
    drop column birthYear;
-- Į���� ���� �Ǹ鼭 ���� ���ǵ� ��� ����