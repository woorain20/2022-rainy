-- ������ Oracle SQL Developer Data Modeler 21.4.2.059.0838
--   ��ġ:        2022-05-23 10:36:47 KST
--   ����Ʈ:      Oracle Database 11g
--   ����:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE membertbl (
    memberid      CHAR(8) NOT NULL,
    membername    NCHAR(5) NOT NULL,
    memberaddress NVARCHAR2(20)
);

ALTER TABLE membertbl ADD CONSTRAINT membertbl_pk PRIMARY KEY ( memberid );

CREATE TABLE oredertbl (
    order_id               INTEGER NOT NULL,
    member_id              CHAR(8),
    product_name           NCHAR(8),
    amount                 INTEGER,
    membertbl_memberid     CHAR(8) NOT NULL,
    producttbl_productname NCHAR(8) NOT NULL
);

ALTER TABLE oredertbl ADD CONSTRAINT oredertbl_pk PRIMARY KEY ( order_id );

CREATE TABLE producttbl (
    productname NCHAR(8) NOT NULL,
    cost        INTEGER NOT NULL,
    makedate    DATE,
    company     NCHAR(10),
    amount      INTEGER NOT NULL
);

ALTER TABLE producttbl ADD CONSTRAINT producttbl_pk PRIMARY KEY ( productname );

ALTER TABLE oredertbl
    ADD CONSTRAINT oredertbl_membertbl_fk FOREIGN KEY ( membertbl_memberid )
        REFERENCES membertbl ( memberid );

ALTER TABLE oredertbl
    ADD CONSTRAINT oredertbl_producttbl_fk FOREIGN KEY ( producttbl_productname )
        REFERENCES producttbl ( productname );



-- Oracle SQL Developer Data Modeler ��� ����: 
-- 
-- CREATE TABLE                             3
-- CREATE INDEX                             0
-- ALTER TABLE                              5
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
