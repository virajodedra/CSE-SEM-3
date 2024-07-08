--------------------------------------------Alter Operation-----------------------------------------------
---------------------Part – A: -------------------------------------------------------------
--Use Deposit table of lab-1.
--DEPOSIT
--Column_Name DataType
--ACTNO INT
--CNAME VARCHAR(50)
--BNAME VARCHAR(50)
--AMOUNT DECIMAL(8,2)
--ADATE DATETIME

select * from deposit

--From the above given tables perform the following queries (ALTER Operation):
--1. Add two more columns City VARCHAR (20) and Pincode INT.
	alter table DEPOSIT 
	add CITY varchar(50), PINCODE int
--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
	alter table DEPOSIT 
	alter column CNAME varchar(35)
--3. Change the data type DECIMAL to INT in amount Column.
	alter table deposit 
	alter column amount int 
--4. Rename Column ActNo to ANO.
	EXEC sp_rename 'deposit.actNo', ANO
--5. Delete Column City from the DEPOSIT table.
	alter table deposit 
	drop column city
--6. Change name of table DEPOSIT to DEPOSIT_DETAIL.
	sp_rename 'deposit' , 'deposit_details'
	
	select * from deposit_details

------------------------------Part – B:-----------------------------------------
--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
	sp_rename 'deposit_details.adate' , AOPENDATE
--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
	 alter table deposit_details 
	 drop column AOPENDATE
--3. Rename Column CNAME to CustomerName.
	sp_rename 'deposit_details.cname' , CustomerName


------------------------------------------------------------------Part – C:--------------------------------------------------------------
--Create following table using query according to the definition.
create table STUDENT_DETAIL(
	
	Enrollment_No  VARCHAR(20),
	Name VARCHAR(25),
	CPI DECIMAL(5,2),
	Birthdate DATETIME
);
 insert into STUDENT_DETAIL values(23010101256, 'HARSHIL', 10.110, 2005-10-27);
  insert into STUDENT_DETAIL values(23010101178, 'VIRAJ', 10, 2006-10-27);
   insert into STUDENT_DETAIL values(23010101256, 'PRUTHVIRAJ', 10.110, 2005-10-27);
   insert into STUDENT_DETAIL values(23010101256, 'JASMIN', 10.110, 2005-10-27);

--From the above given tables perform the following queries (ALTER Operation):
--1. Add two more columns City VARCHAR (20) (Not null) and Backlog INT (Null).
	alter table STUDENT_DETAIL  add city varchar(20) not null default  'PORBANDAR', backlog int 
	select * from  STUDENT_DETAIL
--2. Change the size of NAME column of student_detail from VARCHAR (25) to VARCHAR (35).
	
--3. Change the data type DECIMAL to INT in CPI Column.
--4. Rename Column Enrollment_No to ENO.
--5. Delete Column City from the student_detail table.
--6. Change name of table student_detail to STUDENT_MASTER.


-----------------------------------DELETE, Truncate, Drop Operation------------------------------
-------------------------------------------------Part – A:--------------------------------
-----------------------------------Use Deposit_Detail table (Altered table of DEPO-IT)---------------------------
--DEPOSIT_DETAIL
--Column_Name DataType
--ANO INT
--CustomerName VARCHAR(35)
--BNAME VARCHAR(50)
--AMOUNT INT
--PINCODE INT

--1. Delete all the records of DEPOSIT_DETAIL table having amount greater than and equals to 4000.
delete from DEPOSIT_DETAILS
where amount >= 4000
select * from DEPOSIT_DETAILS
--2. Delete all the accounts CHANDI BRANCH.
delete from DEPOSIT_DETAILS
where bname = 'CHANDI'
--3. Delete all the accounts having account number (ANO) is greater than 105.
delete from DEPOSIT_DETAILS 
where ANO > 105
--4. Delete all the records of Deposit_Detail table. (Use Truncate)
	Truncate table DEPOSIT_DETAILS
	
--5. Remove Deposit_Detail table. (Use Drop)
	drop table Deposit_DetailS


-----------------------------------------------------Part – B:-----------------------------------------------
---------------------------------Create following table using query according to the definition.------------------------
create table EMPLOYEE_MASTER(

EmpNo INT,
EmpName VARCHAR(25),
JoiningDate DATETIME,
Salary DECIMAL (8,2),
City VARCHAR(20)
);

--------------------Insert the following records in the EMPLOYEE_MASTER table. ------------
	
	insert into EMPLOYEE_MASTER values
(101 ,'Keyur','2002-01-05' ,12000.00,'Rajkot'),
(102 ,'Hardik','2004-02-15' ,14000.00,'Ahmedabad'),
(103 ,'Kajal','2006-3-14' ,15000.00,'Baroda'),
(104 ,'Bhoomi','2005-6-23',12500.00,'Ahmedabad'),
(105 ,'Harmit','2004-2-15' ,14000.00,'Rajkot'),
(106 ,'Mitesh','2001-09-25' ,5000.00,'Jamnagar'),
(107 ,'Meera', Null ,7000.00,'Morbi'),
(108 ,'Kishan', '2003-02-6' ,10000.00,NULL)

select * from EMPLOYEE_MASTER

-----------------From the above given tables perform the following queries (DELETE Operation):-----------------------------
--1. Delete all the records of Employee_MASTER table having salary greater than and equals to 14000.
	delete from EMPLOYEE_MASTER
	where Salary >= 14000

	select * from EMPLOYEE_MASTER

--2. Delete all the Employees who belongs to ‘RAJKOT’ city.
	delete from EMPLOYEE_MASTER
	where City = 'Rajkot';

	select * from EMPLOYEE_MASTER
--3. Delete all the Employees who joined after 1-1-2007.
	delete from EMPLOYEE_MASTER
	where JoiningDate = '2007-1-1';

	select * from EMPLOYEE_MASTER
--4. Delete the records of Employees whose joining date is null and Name is not null.
	delete from EMPLOYEE_MASTER
	where JoiningDate is null and EmpName is not null;

	select * from EMPLOYEE_MASTER
--5. Delete the records of Employees whose salary is 50% of 20000.
	delete from EMPLOYEE_MASTER
	where Salary = (50*200);

	select * from EMPLOYEE_MASTER
--6. Delete the records of Employees whose City Name is not empty.
	delete from EMPLOYEE_MASTER
	where City  != null;

	select * from EMPLOYEE_MASTER
--7. Delete all the records of Employee_MASTER table. (Use Truncate)
	truncate table EMPLOYEE_MASTER
	select * from EMPLOYEE_MASTER
--8. Remove Employee_MASTER table. (Use Drop)
	drop table EMPLOYEE_MASTER
	select * from EMPLOYEE_MASTER
