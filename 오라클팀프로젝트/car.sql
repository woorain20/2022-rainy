CREATE USER cardb IDENTIFIED BY 1234
default tablespace users
temporary tablespace temp;

GRANT CONNECT TO cardb;
GRANT RESOURCE TO cardb;
GRANT DBA TO cardb;

-- customer #1
INSERT INTO customer VALUES (
    '�����',
    '01073211713',
    '28',
    '��'
);

-- customer #2
INSERT INTO customer VALUES (
    '�̵���',
    '01022720189',
    '32',
    '��'
);

-- customer #3
INSERT INTO customer VALUES (
    '������',
    '01097792756',
    '24',
    '��'
);

-- customer #4
INSERT INTO customer VALUES (
    '�ֹμ�',
    '01053185577',
    '54',
    '��'
);

-- customer #5
INSERT INTO customer VALUES (
    '��ä��',
    '01023187072',
    '41',
    '��'
);

-- customer #6
INSERT INTO customer VALUES (
    '���¾�',
    '01026264123',
    '33',
    '��'
);

-- customer #7
INSERT INTO customer VALUES (
    '�谡��',
    '01074761733',
    '30',
    '��'
);