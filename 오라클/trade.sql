-- �ŷ���ȣ �԰��ȣ ���̸� �� ���� ����(null) �ŷ����� �����̸� ������

-- ������ ����
create sequence tseq;

-- Į�� ����
alter table tradetbl drop column model;
alter table tradetbl drop column price;
alter table tradetbl drop column stocked_cartbl_s_number;
alter table tradetbl drop column carinfotbl_model;
alter table tradetbl drop column branchtbl_b_name;
alter table tradetbl drop column customertbl_c_name;
alter table tradetbl drop column dealertbl_d_name;

-- �ŷ� ����
insert into tradetbl
values(tseq.nextval,9,'�����','����','2020-05-25','�賲��','����');
insert into tradetbl
values(tseq.nextval,15,'�̵���','�̰���','2022-04-21','�ֹ���','�������ŵ�����');
insert into tradetbl
values(tseq.nextval,3,'������','����','2021-08-31','�վ�Ÿ','�����������');
insert into tradetbl
values(tseq.nextval,22,'�ֹμ�','����','2021-10-11','ȫ����','������');
insert into tradetbl
values(tseq.nextval,26,'��ä��','����','2022-02-05','������','������');
insert into tradetbl
values(tseq.nextval,14,'�谡��','�̰���','2020-09-13','������','�������');
insert into tradetbl
values(tseq.nextval,8,'���¾�','����','2019-12-27','������','������');
