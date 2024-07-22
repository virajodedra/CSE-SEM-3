create database CSE_3A_228

create table deposit(
      actno int,
	  cname varchar(50),
	  bname varchar(50),
	  amount decimal(8,2),
	  adate datetime

);

insert into deposit values(101,'ANIL','VRCE',1000,'1995-3-1')
insert into deposit values(102,'SUNIL','AJNI',5000,'1996-1-4')
insert into deposit values(103,'MEHUL','KAROLBAGH',3500,'1995-11-7')
insert into deposit values(104,'MADHURI','CHANDI',1200,'1995-12-17')
insert into deposit values(105,'PRAMOD','M.G.ROAD',3000,'1996-3-27')
insert into deposit values(106,'SANDIP','ANDHERI',2000,'1996-3-31')
insert into deposit values(107,'SHIVANI','VIRAR',1000,'1995-9-5')
insert into deposit values(108,'KRANTI','NEHRU PLACE',5000,'1995-7-2')
insert into deposit values(109,'MINU','POWAI',7000,'1995-8-10')

select * from deposit 


create table BRANCH(
   BNAME VARCHAR(50),
   CITY VARCHAR(50)
);

insert into BRANCH values('POWAI','BOMBAY')

select *  from BRANCH



create  table CUSTOMERS(
	CNAME varchar(50),
	CITY  varchar(50)
);


insert into CUSTOMERS values('ANIL','CULCUTTA')
insert into CUSTOMERS values('SUNIL','DELHI')
insert into CUSTOMERS values('MEHUL','BARODA')
insert into CUSTOMERS values('MANDAR','PATNA')
insert into CUSTOMERS values('MADHURI','NAGPUR')
insert into CUSTOMERS values('PRAMOD','NAGPUR')
insert into CUSTOMERS values('SANDIP','SURAT')
insert into CUSTOMERS values('SHIVANI','BOMBAY')
insert into CUSTOMERS values('KRANTI','BOMBAY')
insert into CUSTOMERS values('NAREN','BOMBAY')

SELECT * FROM CUSTOMERS


create table BORROW(
	LOANNO int,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2)

);

 insert into BORROW values
	(201,'ANIL','VRCE',1000),
	(206,'MEHUL','AJNI',5000),
	(311,'SUNIL','DHARAMPETH',3000),
	(321,'MADHURI','ANDHERI',2000),
	(375,'PRAMOD','VIRAR',8000),
	(481,'KRANTI','NEHRU PLACE',3000)

	UPDATE BORROW 
	SET LOANNO = 375
	WHERE LOANNO = 371;

    SELECT * FROM BORROW

	
