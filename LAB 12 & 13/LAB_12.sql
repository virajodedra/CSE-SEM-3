--LAB : 12
--Complex Joins --


CREATE TABLE Dept (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE,
    DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
    Location VARCHAR(50) NOT NULL
);

CREATE TABLE Person (
    PersonID INT PRIMARY KEY,
    PersonName VARCHAR(100) NOT NULL,
    DepartmentID INT NULL,
    Salary DECIMAL(8, 2) NOT NULL,
    JoiningDate DATETIME NOT NULL,
    City VARCHAR(100) NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES Dept(DepartmentID)
);

INSERT INTO Dept (DepartmentID, DepartmentName, DepartmentCode, Location) VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block');

INSERT INTO Person (PersonID, PersonName, DepartmentID, Salary, JoiningDate, City) VALUES
(101, 'Rahul Tripathi', 2, 56000, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000, '2000-05-25', 'Jamnagar');



--From the above given table perform the following queries:
--Part – A:
--1. Find all persons with their department name & code.
	select Person.PersonID, Dept.DepartmentCode, Dept.DepartmentCode
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
--2. Find the person's name whose department is in C-Block.
	select Person.PersonID, Dept.Location
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	where Dept.Location = 'C-Block'
--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
	select Person.PersonID, Person.Salary,Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	where Person.City = 'Jamnagar'
--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
	select Person.PersonName, Person.Salary,Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	where Person.City <> 'Rajkot'
--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
	select Person.PersonName, Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	where Dept.DepartmentName = 'Civil' and Person.JoiningDate > '2001-08-01'
--6. Find details of all persons who belong to the computer department.
	select Person.*, Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	where Dept.DepartmentName = 'computer'
--7. Display all the person's name with the department whose joining date difference with the current date
--is more than 365 days. 
	select Person.*, Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	where DATEDIFF(Day, Person.JoiningDate, getdate()) > 365;
--8. Find department wise person counts.
	select count(Person.PersonID), Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	group by Dept.DepartmentName;
--9. Give department wise maximum & minimum salary with department name.
	select min(Person.Salary) as min_salary, max(Person.Salary) as max_salary, Dept.DepartmentName
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	group by Dept.DepartmentName;
--10. Find city wise total, average, maximum and minimum salary.
	select Person.City, min(Person.Salary) as min_salary, max(Person.Salary) as max_salary,AVG(Person.Salary) as avg_salary
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	group by Person.City;
--11. Find the average salary of a person who belongs to Ahmedabad city.
	select Person.City,AVG(Person.Salary) as avg_salary
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	WHERE Person.City = 'Ahmedabad'
	GROUP by Person.City;
	
--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In
--single column)
	select Person.PersonName +'lives in' + Person.City + 'and works in' + Dept.DepartmentName + 'Department'
		from Person	
		join Dept
	on Person.DepartmentID = Dept.DepartmentID
	

--Part – B:
--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In
--single column)
--2. Find city & department wise total, average & maximum salaries.
--3. Find all persons who do not belong to any department.
--4. Find all departments whose total salary is exceeding 100000.
--Part – C:
--1. List all departments who have no person.
--2. List out department names in which more than two persons are working.
--3. Give a 10% increment in the computer department employee’s salary. (Use Update)



--LAB 13 :
--Advanced level Joins --



CREATE TABLE City (
    CityID INT PRIMARY KEY,
    Name VARCHAR(100) UNIQUE,
    Pincode INT NOT NULL,
    Remarks VARCHAR(255)
);

CREATE TABLE Village (
    VID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES City(CityID)
);

INSERT INTO City (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', 360005, 'Good'),
(2, 'Surat', 335009, 'Very Good'),
(3, 'Baroda', 390001, 'Awesome'),
(4, 'Jamnagar', 361003, 'Smart'),
(5, 'Junagadh', 362229, 'Historic'),
(6, 'Morvi', 363641, 'Ceramic');

INSERT INTO Village (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);


---------------------------Part – A: Create table as per following dat------------------------------a----------------------------------------------------


--1. Display all the villages of Rajkot city.
	select Village.Name
		from City join Village
		on City.CityID = Village.CityID
	where City.Name = 'Rajkot'
--2. Display city along with their villages & pin code.
	select Village.Name, City.Name, City.Pincode
		from City join Village
		on City.CityID = Village.CityID
	
--3. Display the city having more than one village.
		select  City.Name, count(Village.Name)
			from City join Village
			on City.CityID = Village.CityID
		group by City.Name
		having count(Village.Name) > 1
--4. Display the city having no village.
		select  City.Name, count(Village.Name)
			from City join Village
			on City.CityID = Village.CityID
		group by City.Name
		having count(Village.Name) = 0
--5. Count the total number of villages in each city.
		select  City.Name, count(Village.Name)
			from City join Village
			on City.CityID = Village.CityID
		group by City.Name
		
--6. Count the number of cities having more than one village.
	select  count(City.CityID)
			from City 
			where City.CityID in (
				
				select City.CityID 
				from City join Village
				on City.CityID = Village.CityID
				group by City.CityID
				having count(Village.Name) > 1
			)

--Create below table with following constraints
--1. Do not allow SPI more than 10
--2. Do not allow Bklog less than 0.
--3. Enter the default value as ‘General’ in branch to all new records IF no other value is specified.
--4. Try to update SPI of Raju from 8.80 to 12.
--5. Try to update Bklog of Neha from 0 to -1.
--Part – B: Create table as per following schema with proper validation and try to insert data which violate your
--validation.
--1. Emp_details(Eid, Ename, Did, Cid, Salary, Experience)
--Dept_details(Did, Dname)
--City_details(Cid, Cname)
--Part – C: Create table as per following schema with proper validation and try to insert data which violate your
--validation.
--1. Emp_info(Eid, Ename, Did, Cid, Salary, Experience)
--Dept_info(Did, Dname)
--City_info(Cid, Cname, Did))
--District(Did, Dname, Sid)
--State(Sid, Sname, Cid)
--Country(Cid, Cname)
--2. Insert 5 records in each table.
--3. Display employeename, departmentname, Salary, Experience, City, District, State and country of all
--employees.







-------------------------------------------SET OPERATOR------------------------------------------------------------
create Table STU_MASTER(
	Rno INT PRIMARY KEY,
	Name VARCHAR(100),
	Branch VARCHAR(50) default 'general',
	SPI DECIMAL(3, 2) CHECK(SPI <= 10),
	Bklog INT check(Bklog >= 0)
	)

	insert into STU_MASTER(Rno, Name, Branch, SPI, Bklog) values
	(101, 'Raju', 'CE', 8.80, 0),
	(102, 'Amit', 'CE', 2.20, 3),
	(103, 'Sanjay', 'ME', 1.50, 6),
	(104, 'Neha', 'EC', 7.65, 0),
	(105, 'Meera', 'EE', 5.52, 2),
	(106, 'Mahesh','General' , 4.50, 3);

	drop table STU_MASTER



--1. Do not allow SPI more than 10
	
--2. Do not allow Bklog less than 0.
--3. Enter the default value as ‘General’ in branch to all new records IF no other value is specified.
--4. Try to update SPI of Raju from 8.80 to 12.
	update STU_MASTER
	set SPI = 12
	where Name = 'Raju'
--5. Try to update Bklog of Neha from 0 to -1.
	update STU_MASTER
	set Bklog = -1
	where Name = 'Neha'
