--Perform SQL queries for Aggerate function and group by (without having)
------------------------------------------------------Part – A:--------------------------------
--Create table and inset records as per below.
	create table EMP(
		EID int,
		EName varchar(50),
		Department varchar(50),
		Salary int,
		JoiningDate Date,
		City varchar(50)
	);

	insert into EMP values
		(101,'Rahul','Admin',56000,'1-Jan-90','Rajkot'),
		(102,'Hardik','IT',18000,'25-Sep-90','Ahmedabad'),
		(103,'Bhavin','HR',25000,'14-May-91','Baroda'),
		(104,'Bhoomi','Admin',39000,'8-Feb-91','Rajkot'),
		(105,'Rohiy','IT',17000,'23-Jul-90','Jamnagar'),
		(106,'Priya','IT',9000,'18-Oct-90','Ahmedabad'),
		(107,'Bhoomi','HR',34000,'25-Dec-91','Rajkot')

		select * from EMP
--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
	select max(Salary) as maximum, min(Salary) as minimum
	from EMP
--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
	select sum(Salary) as Total_sal , avg(Salary) as Average_Sal
	from EMP
--3. Find total number of employees of EMPLOYEE table.
	select count(EName) as Total_EMP
	from EMP
--4. Find highest salary from Rajkot city.
	select Max(Salary) 
	from EMP
	where city = 'Rajkot'

--5. Give maximum salary from IT department.
	select Max(Salary) 
	from EMP
	where Department = 'it'
--6. Count employee whose joining date is after 8-feb-91.
	select count(EName) 
	from EMP
	where JoiningDate >  '8-feb-91'
--7. Display average salary of Admin department.
	select avg(Salary) 
	from EMP
	where Department = 'admin'
--8. Display total salary of HR department.
	select sum(Salary) 
	from EMP
	where Department = 'HR'
--9. Count total number of cities of employee without duplication.
	select count(distinct City) 
	from EMP
--10. Count unique departments.
	select count(distinct Department) 
	from EMP

--11. Give minimum salary of employee who belongs to Ahmedabad
	select min(Salary) 
	from EMP
	where City = 'Ahmedabad'	
--12. Find city wise highest salary.
	select max(Salary) 
	from EMP
	group by City
--13. Find department wise lowest salary.
	select Department ,min(Salary) 
	from EMP
	group by Department
--14. Display city with the total number of employees belonging to each city.
	select city ,count(Salary) 
	from EMP
	group by City
--15. Give total salary of each department of EMP table.
	select Department ,sum(Salary) 
	from EMP
	group by Department
--16. Give average salary of each department of EMP table without displaying the respective department name.
	select avg(Salary) 
	from EMP
	group by Department

---------------------------------------------------------------------------Part – B------------------------------------:
--1. Count the number of employees living in Rajkot.
	select count(EName) 
	from EMP
	group by City
	having City = 'rajkot'
--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
	select (max(Salary) - min(Salary)) as DIFFERENCE
	from EMP
--3. Display the total number of employees hired before 1st January, 1991.
	select count(EName) as total
	from EMP
	where JoiningDate < '1-Jan-1991'
---------------------------------------------------------------------------------Part – C:---------------------------------------------
--1. Count the number of employees living in Rajkot or Baroda.
	select City ,count(EName)
	from EMP
	where City in ('Rajkot','Baroda')
	group by City
--2. Display the total number of employees hired before 1st January, 1991 in IT department.
	select Department ,count(EID)
	from EMP
	where JoiningDate <	'1-Jan-1991' and Department = 'it'
	group by Department

--3. Find the Joining Date wise Total Salaries.
	select JoiningDate,Sum(Salary)
	from EMP
	group by JoiningDate
--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
	select Department,City,max(Salary)
	from EMP
	where city like 'R%'
	group by Department,City
