CREATE TABLE branchtbl (
    area        NCHAR(3) NOT NULL,
    detail_area NCHAR(5) NOT NULL,
    b_name      NCHAR(10) NOT NULL
);

ALTER TABLE branchtbl ADD CONSTRAINT branch_pk PRIMARY KEY ( b_name );

CREATE TABLE carinfotbl (
    brand    NCHAR(12) NOT NULL,
    category NCHAR(8) NOT NULL,
    model    NVARCHAR2(12) NOT NULL,
    cc       INTEGER NOT NULL,
    boarding INTEGER NOT NULL
);

ALTER TABLE carinfotbl ADD CONSTRAINT carinfotbl_pk PRIMARY KEY ( model );

CREATE TABLE customertbl (
    c_name   NCHAR(5) NOT NULL,
    c_phone  INTEGER NOT NULL,
    c_age    INTEGER,
    c_gender NCHAR(2)
);

ALTER TABLE customertbl ADD CONSTRAINT customer_pk PRIMARY KEY ( c_name );

CREATE TABLE dealertbl (
    d_name    NCHAR(5) NOT NULL,
    position  NCHAR(4),
    d_phone   INTEGER NOT NULL,
    workplace NCHAR(6) NOT NULL
);

ALTER TABLE dealertbl ADD CONSTRAINT dealer_pk PRIMARY KEY ( d_name );

CREATE TABLE stocked_cartbl (
    s_number         INTEGER NOT NULL,
    model            NVARCHAR2(12) NOT NULL,
    p_year           INTEGER NOT NULL,
    km               INTEGER NOT NULL,
    price            INTEGER NOT NULL,
    trouble          NCHAR(6),
    carinfotbl_model NVARCHAR2(12) NOT NULL
);

ALTER TABLE stocked_cartbl ADD CONSTRAINT stocked_car_pk PRIMARY KEY ( s_number );

CREATE TABLE tradetbl (
    t_number                INTEGER NOT NULL,
    s_number                INTEGER NOT NULL,
    c_name                  NCHAR(5) NOT NULL,
    model                   NVARCHAR2(12) NOT NULL,
    price                   INTEGER NOT NULL,
    insureance              NCHAR(2),
    trade_date              DATE NOT NULL,
    d_name                  NCHAR(5) NOT NULL,
    b_name                  NCHAR(10) NOT NULL,
    stocked_cartbl_s_number INTEGER NOT NULL,
    carinfotbl_model        NVARCHAR2(12) NOT NULL,
    customertbl_c_name      NCHAR(5) NOT NULL,
    dealertbl_d_name        NCHAR(5) NOT NULL,
    branchtbl_b_name        NCHAR(10) NOT NULL
);

ALTER TABLE tradetbl ADD CONSTRAINT tradetbl_pk PRIMARY KEY ( t_number );

ALTER TABLE stocked_cartbl
    ADD CONSTRAINT stocked_cartbl_carinfotbl_fk FOREIGN KEY ( carinfotbl_model )
        REFERENCES carinfotbl ( model );

ALTER TABLE tradetbl
    ADD CONSTRAINT tradetbl_branchtbl_fk FOREIGN KEY ( branchtbl_b_name )
        REFERENCES branchtbl ( b_name );

ALTER TABLE tradetbl
    ADD CONSTRAINT tradetbl_carinfotbl_fk FOREIGN KEY ( carinfotbl_model )
        REFERENCES carinfotbl ( model );

ALTER TABLE tradetbl
    ADD CONSTRAINT tradetbl_customertbl_fk FOREIGN KEY ( customertbl_c_name )
        REFERENCES customertbl ( c_name );

ALTER TABLE tradetbl
    ADD CONSTRAINT tradetbl_dealertbl_fk FOREIGN KEY ( dealertbl_d_name )
        REFERENCES dealertbl ( d_name );

ALTER TABLE tradetbl
    ADD CONSTRAINT tradetbl_stocked_cartbl_fk FOREIGN KEY ( stocked_cartbl_s_number )
        REFERENCES stocked_cartbl ( s_number );