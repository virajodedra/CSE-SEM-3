
------------------------------------------------Math functions----------------------------------------------
--P-------------------------------------------art – A:--------------------------------------------------------------------------
--1. Display the result of 5 multiply by 30.

	select 5*30 as RESULT
--2. Find out the absolute value of -25, 25, -50 and 50.

	select abs(-25),abs(25),abs(-50),abs(50) as OUTPUT

--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.

	select ceiling(25.2) , ceiling(25.7) , ceiling(-25.2)

--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.

	select floor(25.2) , floor(25.7) , floor(-25.2)


--5. Find out remainder of 5 divided 2 and 5 divided by 3.
	
	select 5%2 as result
	select 5%3 as result

--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
	select power(3,2) as result
	select power(4,3) as result
--7. Find out the square root of 25, 30 and 50.
	select sqrt(25), sqrt(30),sqrt(50)
--8. Find out the square of 5, 15, and 25.
	select SQUARE(5), SQUARE(15), SQUARE(25)
--9. Find out the value of PI.
	select PI() as VALUE_PIE
--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
	select ROUND(157.732, 2) as OUTPUT
	select ROUND(157.732, 0) as output
	select ROUND(157.32, -2) as output	
--11. Find out exponential value of 2 and 3.
	select exp(2) as output
	select exp(3) as output
--12. Find out logarithm having base e of 10 and 2.
	select log(10, 10) as output
	select log(10, 2) as output
--13. Find out logarithm having base b having value 10 of 5 and 100.
	select log10(5) as output
	select log10(100) as output
--14. Find sine, cosine and tangent of 3.1415.
	select sin(3.1415) as sine
	select cos(3.1415) as cosine
	select TAN(3.1415) as tangent
--15. Find sign of -25, 0 and 25.
	select SIGN(-25) as SIGN
		select SIGN(0) as SIGN
			select SIGN(25) as SIGN
--16. Generate random number using function.
	SELECT RAND();
	SELECT RAND();




--Part – B:
--Create and Insert the following records in the EMP_MASTER table.
--EmpNo EmpName JoiningDate Salary Commission City Dept Code
--101 Keyur 5-1-02 12000.00 4500 Rajkot 3@g
--102 Hardik 15-2-04 14000.00 2500 Ahmedabad 3@
--103 Kajal 14-3-06 15000.00 3000 Baroda 3-GD
--104 Bhoomi 23-6-05 12500.00 1000 Ahmedabad 1A3D
--105 Harmit 15-2-04 14000.00 2000 Rajkot 312A
--1. Display the result of Salary plus Commission.
--2. Find smallest integer value that is greater than or equal to 55.2, 35.7 and -55.2.
--3. Find largest integer value that is smaller than or equal to 55.2, 35.7 and -55.2.
--4. Find out remainder of 55 divided 2 and 55 divided by 3.
--5. Find out value of 23 raised to 2nd power and 14 raised 3rd power.
--Part – C:



--1. Find out the square root of 36, 49 and 81.
--2. Find out the square of 3, 9, and 12.
--3. Find out round value of 280.8952 for 2, 0 and -2 decimal points.
--4. Find sine, cosine and tangent of 4.2014.
--5. Find sign of -55, 0 and 95.



--String functions
--Part – A:
--1. Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
	select LEN(NULL) as output;
	select LEN(' hello ') as output;
	select LEN('') as output;
--2. Display your name in lower & upper case.
	select UPPER('viraj');
	select LOWER('VIRAJ');
--3. Display first three characters of your name.
	select SUBSTRING('VIRAJ',1,3);
--4. Display 3rd to 10th character of your name.
	select SUBSTRING('Odedra Viraj',3,10);
--5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
	select REPLACE('abc123efg','123efg','XYZefg');
	select replace('abcabcabc','cabcabc','5ab5ab5');
--6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
	select ASCII('a') as a
	select ASCII('A') as A
	select ASCII('z') as small_z
	select ASCII('Z') as Z
	select ASCII('0') as value_0
	select ASCII('9') as value_9

--7. Write a query to display character based on number 97, 65,122,90,48,57.
	select char(97),char(65), char(122), char(90), char(48), char(57);	
--8. Write a query to remove spaces from left of a given string ‘hello world ‘.
	select LTRIM('hello world ') as output
--9. Write a query to remove spaces from right of a given string ‘ hello world ‘.
	select RTRIM(' hello world ');
--10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
	select left('SQL Server', 4) as left_output;
	SELECT RIGHT('SQL Server',5) AS RIGHT_OUTPUT;
--11. Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
	SELECT CAST('123.45' AS decimal(10,2));
--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).
	SELECT CAST(10.58 AS INT);
--13. Put 10 space before your name using function.
	SELECT SPACE(10) + 'VIRAJ';
--14. Combine two strings using + sign as well as CONCAT ().
	select CONCAT('Viraj',' ', 'Odedra');
	select 'Viraj' +' '+'Odedra';
--15. Find reverse of “Darshan”.
	select REVERSE('DARSHAN');
	
--16. Repeat your name 3 times.
	select REPLICATE('Viraj',4);


--Part – B: Perform following queries on Student table of practical no 5.
--1. Find the length of FirstName and LastName columns.
--2. Display FirstName and LastName columns in lower & upper case.
--3. Display first three characters of FirstName column.
--4. Display 3rd to 10th character of Website column.
--5. Write a query to display first 4 & Last 5 characters of Website column.
--Part – C: Perform following queries on Student table of practical no 5.
--1. Put 10 space before FirstName using function.
--2. Combine FirstName and LastName columns using + sign as well as CONCAT ().
--3. Combine all columns using + sign as well as CONCAT ().
--4. Find reverse of FirstName column.
--5. Repeat FirstName column 3 times
--6. Give the Names which contains 5 characters.
--7. Combine the result as <FirstName> Lives in <City>.
--8. Combine the result as Student_ID of < FirstName > is <StuID> .



--Date Functions
--Part – A:
--1. Write a query to display the current date & time. Label the column Today_Date.
	select GETDATE();
--2. Write a query to find new date after 365 day with reference to today.
	SELECT DATEADD(year, 1, GETDATE()) AS DateAdd;	
--3. Display the current date in a format that appears as may 5 1994 12:00AM.
	select convert(varchar,getdate(), 100);

	select format(getdate(),'MMM d yyyy hh:mm tt') as format_date
--4. Display the current date in a format that appears as 03 Jan 1995.
	select convert(varchar,getdate(),13);
	select format(getdate(),'MMM d yyyy ') as format_date
--5. Display the current date in a format that appears as Jan 04, 96.
	select format(getdate(),'  MMM d, yyyy ') as format_date	
--6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
	select  DATEDIFF(month,'31-Dec-08','31-Mar-09');
--7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
	select DATEDIFF(year,'25-Jan-12','14-Sep-10');
--8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
	select DATEDIFF(HH,'25-Jan-12 7:00','26-Jan-12 10:30');
--9. Write a query to extract Day, Month, Year from given date 12-May-16.
	select DATEPART(dd,'12-May-16');
		select DATEPART(mm,'12-May-16');
			select DATEPART(YYYY,'12-May-16');
--10. Write a query that adds 5 years to current date.
	select DATEADD(yy,5,getdate());
--11. Write a query to subtract 2 months from current date.
	select DATEADD(mm,-2,getdate());
--12. Extract month from current date using datename () and datepart () function.
	select datename(dd,getdate()) ,datename(mm,getdate());
	select datepart(dd,getdate()),datepart(mm,getdate());
--13. Write a query to find out last date of current month.
	select EOMONTH(getdate());
--14. Calculate your age in years and months.
	select datediff(year,'2006-08-18',getdate());
--Part – B:
--Create a table EMP_DETAIL and insert the following records in the table.
--EmpNo EmpName JoiningDate Salary City
--101 Keyur 15-1-02 12000.00 Rajkot
--102 Hardik 15-2-04 14000.00 Ahmedabad
--103 Kajal 14-3-06 15000.00 Baroda
--104 Bhoomi 23-6-05 12500.00 Ahmedabad
--105 Harmit 15-2-04 14000.00 Rajkot
--106 Jay 12-3-07 12000.00 Surat
--1. Write a query to find new date after 365 day with reference to JoiningDate.
--2. Display the JoiningDate in a format that appears as may 5 1994 12:00AM.
--3. Display the JoiningDate in a format that appears as 03 Jan 1995.
--4. Display the JoiningDate in a format that appears as Jan 04, 96.
--5. Write a query to find out total number of months between JoiningDate and 31-Mar-09

--6. Write a query to find out total number of years between JoiningDate and 14-Sep-10.
--Part – C:
--1. Write a query to extract Day, Month, Year from JoiningDate.
--2. Write a query that adds 5 years to JoiningDate.
--3. Write a query to subtract 2 months from JoiningDate.
--4. Extract month from JoiningDate using datename () and datepart () function.
--5. Calculate your age in years and months
