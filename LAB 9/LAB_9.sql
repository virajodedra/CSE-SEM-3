
-------------------- LAB 9 --------------------------------------------------------------



--Sub Queries--
CREATE TABLE Stu_Detail (
    Rno INT,
    Name VARCHAR(50),
    City VARCHAR(50),
    DID INT,
);

INSERT INTO Stu_Detail (Rno, Name, City, DID) VALUES
(101, 'Raju', 'Rajkot', 10),
(102, 'Amit', 'Ahmedabad', 20),
(103, 'Sanjay', 'Baroda', 40),
(104, 'Neha', 'Rajkot', 20),
(105, 'Meera', 'Ahmedabad', 30),
(106, 'Mahesh', 'Baroda', 10);

CREATE TABLE Academic (
    Rno INT,
    SPI DECIMAL(3, 1),
    Bklog INT
);

INSERT INTO Academic (Rno, SPI, Bklog) VALUES
(101, 8.8, 0),
(102, 9.2, 2),
(103, 7.6, 1),
(104, 8.2, 4),
(105, 7.0, 2),
(106, 8.9, 3);

CREATE TABLE Department (
    DID INT,
    DName VARCHAR(50)
);

INSERT INTO Department (DID, DName) VALUES
(10, 'Computer'),
(20, 'Electrical'),
(30, 'Mechanical'),
(40, 'Civil');




--------------------------------------------------------Part – A:----------------------------------
--1. Display details of students who are from computer department.-------------------------
	select Stu_Detail.*
	from Stu_Detail
	where DID in (
		select DID 
		from Department
		where Department.DName = 'Computer'
	)
--2. Displays name of students whose SPI is more than 8.
	select Stu_Detail.Name
	from Stu_Detail
	where Rno in (
		select Rno 
		from Academic
		where SPI > 8
	)	
--3. Display details of students of computer department who belongs to Rajkot city.
	select Stu_Detail.*
	from Stu_Detail
	where DID in (
		select DID 
		from Department
		where DName = 'computer' AND City = 'Rajkot'
	)
--4. Find total number of students of electrical department.
	select count(DID) as electrical_Count
	from Stu_Detail
	where DID in (
		select DID 
		from Department
		where DName = 'electrical' 
	)
--5. Display name of student who is having maximum SPI.
	select Name as Topper
	from Stu_Detail
	where Rno = (
		select top 1 Rno 
		from Academic 
		order by SPI desc
	)

	 --or-- 

	 select Name as topper
	 from Stu_Detail
	 where Rno = (
		
		select Rno 
		from Academic

		where SPI = (
			select max(SPI) 
			from Academic
		)
	 )
--6. Display details of students having more than 1 backlog.
	select *
	from Stu_Detail
	where Rno in (
		select Rno from Academic
		where Bklog > 1
	)
--Part – B:
--1. Display name of students who are either from computer department or from mechanical department.
	select Name as Students
	from Stu_Detail
	where DID in (
		select DID 
		from Department
		where DName in('computer' , 'mechanical')
	)
--2. Display name of students who are in same department as 102 studying in.
	select Name as Electrical_Students
	from Stu_Detail
	where DID in (
		select DID 
		from Stu_Detail
		where  Rno = 102 
	)

	--or

	--select Name as Electrical_Students
	--from Stu_Detail
	--where DID in(
	--	select DID 
	--	from 
	--)
--Part – C:
--1. Display name of students whose SPI is more than 9 and who is from electrical department.
	select Name 
	from Stu_Detail
	where DID in (
		select DID 
		from Department
		where DName = 'electrical'
	)
	and 
	Rno in (	
		select Rno 
		from Academic
		where SPI > 9
	)
--2. Display name of student who is having second highest SPI.
	select top 1 Name as Nth_Topper
	from Stu_Detail
	where Rno in (
	
		select  top 2 Rno
		from Academic
		order by SPI desc)

	order by Rno 

--3. Display city names whose students branch wise SPI is 9.2

	select City
	from Stu_Detail
		
		select Rno 
		from Academic
		where Rno 
