--Implement SQL Joins 
CREATE TABLE Stu_Info (
    Rno INT ,
    Name VARCHAR(50),
    Branch VARCHAR(50)
);

INSERT INTO Stu_Info (Rno, Name, Branch)
VALUES 
    (101, 'Raju', 'CE'),
    (102, 'Amit', 'CE'),
    (103, 'Sanjay', 'ME'),
    (104, 'Neha', 'EC'),
    (105, 'Meera', 'EE'),
    (106, 'Mahesh', 'ME');

CREATE TABLE Result (
	RNO INT,
    SPI DECIMAL(4, 2),
	);

INSERT INTO Result (Rno, SPI)
VALUES 
(101, 8.8),
    (102, 9.2),
    (103, 7.6),
    (104, 8.2),
    (105, 7.0),
    (107, 8.9);  

CREATE TABLE EMPLOYEE_MASTER (
    EmployeeNo VARCHAR(50) ,
    Name VARCHAR(50),
    ManagerNo VARCHAR(50)
);

INSERT INTO EMPLOYEE_MASTER(EmployeeNo, Name, ManagerNo)
VALUES 
    ('E01', 'Tarun', NULL),
    ('E02', 'Rohan', 'E02'),
    ('E03', 'Priya', 'E01'),
    ('E04', 'Milan', 'E03'),
    ('E05', 'Jay', 'E01'),
    ('E06', 'Anjana', 'E04');




--Part – A:
--1. Combine information from student and result table using cross join or Cartesian product.
	select	*
	from Stu_Info cross join Result
--2. Perform inner join on Student and Result tables.
	select	*
	from Stu_Info  join Result
	on Stu_Info.Rno = Result.Rno
--3. Perform the left outer join on Student and Result tables.
	select	*
	from Stu_Info  left outer join Result
	on Stu_Info.Rno = Result.Rno
--4. Perform the right outer join on Student and Result tables.
		select	*
	from Stu_Info  right outer join Result
	on Stu_Info.Rno = Result.Rno
--5. Perform the full outer join on Student and Result tables.
	select	*
	from Stu_Info  full outer join Result
	on Stu_Info.Rno = Result.Rno
--6. Display Rno, Name, Branch and SPI of all students.
	select	Stu_Info.Rno, Stu_Info.Name, Stu_Info.Branch, Result.SPI
	from Stu_Info  full  join Result
	on Stu_Info.Rno = Result.Rno
--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
	select	Stu_Info.Rno, Stu_Info.Name, Stu_Info.Branch, Result.SPI
	from Stu_Info  full  join Result
	on Stu_Info.Rno = Result.Rno
	where Stu_Info.Branch = 'CE'
--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
		select	Stu_Info.Rno, Stu_Info.Name, Stu_Info.Branch, Result.SPI
	from Stu_Info  inner  join Result
	on Stu_Info.Rno = Result.Rno
	where Stu_Info.Branch != 'EC'
--9. Display average result of each branch.
	select avg(Result.SPI), Stu_Info.Branch
	from Stu_Info  inner  join Result
	on Stu_Info.Rno = Result.Rno
	group by Stu_Info.Branch
	
--10. Display average result of CE and ME branch.
select avg(Result.SPI), Stu_Info.Branch
	from Stu_Info  inner  join Result
	on Stu_Info.Rno = Result.Rno
	group by Stu_Info.Branch
	having  Stu_Info.Branch in ('CE', 'ME')


--Part – B:

--1. Display average result of each branch and sort them in ascending order by SPI.
	select avg(Result.SPI), Stu_Info.Branch
	from Stu_Info join Result
	on Stu_Info.Rno = Result.Rno
	group by Stu_Info.Branch
	order by avg(Result.SPI)
	
--2. Display highest SPI from each branch and sort them in descending order.
		select max(Result.SPI), Stu_Info.Branch
	from Stu_Info join Result
	on Stu_Info.Rno = Result.Rno
	group by Stu_Info.Branch
	order by max(Result.SPI) DESC

--Part – C:

--1. Retrieve the names of employee along with their manager’s name from the Employee table.
	select e.Name as Employee_Name, m.Name as Manager_name
	from EMPLOYEE_MASTER e  inner join EMPLOYEE_MASTER m
	on e.ManagerNo = m.EmployeeNo
