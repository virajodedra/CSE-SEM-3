--Perform SQL queries for Group by with having and Order by
--Table: SALES_DATA
	create table sale_data(
	Region varchar(50),
	Product varchar(50),
	Sales_Amount int,
	year int
	);
	--drop table SALES_DATA
	insert into sale_data values
	('North America','Watch',1500,2023),
	('Europe','Mobile',1200,2023),
	('Asia','Watch',1800,2023),
	('North America','TV',900,2024),
	('Europe' ,'Watch',2000,2024),
	('Asia','Mobile', 1000,2024),
	('North America','Mobile',1600,2023),
	('Europe','TV',1500,2023),
	('Asia','TV' ,1100,2024),
	('North America','Watch',1700,2024)

	select * from SALES_DATA
	drop table sale_data

--Part – A:
--1. Display Total Sales Amount by Region.
	select 
		Region, sum(Sales_Amount)
	from sale_data
	group by Region

--2. Display Average Sales Amount by Product
	select 
		product, avg(Sales_Amount)
	from sale_data
	group by product
--3. Display Maximum Sales Amount by Year
	select 
		Year, max(Sales_Amount)
	from sale_data
	group by Year
--4. Display Minimum Sales Amount by Region and Year
	select
		region,year,min(Sales_Amount)
	from sale_data
	group by Region,Year
--5. Count of Products Sold by Region
	select 
		region,count(product)
	from sale_data
	group by Region
--6. Display Sales Amount by Year and Product
	select 
		Year, product, sum(Sales_Amount)
	from sale_data
	group by Year, product

--7. Display Regions with Total Sales Greater Than 5000
	select 
		Region,sum(Sales_Amount)
	from sale_data
	group by Region
	having sum(Sales_Amount) > 5000

--8. Display Products with Average Sales Less Than 10000
	select 
		Product,avg(Sales_Amount)
	from sale_data
	group by Product
	having avg(Sales_Amount) < 10000

--9. Display Years with Maximum Sales Exceeding 500
	select 
		Year,max(Sales_Amount)
	from sale_data
	group by Year
	having max(Sales_Amount) > 500

--10. Display Regions with at Least 3 Distinct Products Sold.
	select 
		distinct Region, count(product)
	from sale_data
	group by Region
	having count(product) > 2

--11. Display Years with Minimum Sales Less Than 1000
	select
		Year,min(Sales_Amount) 
	from sale_data
	group by Year
	having min(Sales_Amount) < 1000
--12. Display Total Sales Amount by Region for Year 2023, Sorted by Total Amount
	select
		Region,sum(Sales_Amount) as total_sales
	from sale_data
	where Year = 2023
	group by Region
	order by sum(Sales_Amount)
-------------------------------------------------------------------------------------------Part -------------– B:---------------------------------------------------------------------------------
--1. Display Count of Orders by Year and Region, Sorted by Year and Region
	select
		Year,Region,count(Sales_Amount)
	from sale_data
	group by Year, Region
	order by Year , Region
--2. Display Regions with Maximum Sales Amount Exceeding 1000 in Any Year, Sorted by Region
	select
		Year,Region,max(Sales_Amount)
	from sale_data
	group by Year, Region
	having max(Sales_Amount) > 1000
	order by Region
--3. Display Years with Total Sales Amount Less Than 1000, Sorted by Year Descending
	select
		Year,sum(Sales_Amount)
	from sale_data
	group by Year
	having sum(Sales_Amount) < 1000
	order by Year desc
--4. Display Top 3 Regions by Total Sales Amount in Year 2024
	select
		top 3 Region,Year,sum(Sales_Amount)
	from sale_data
	where Year = 2024
	group by Region,Year
	

-------------------------------------------------------------------------------------------------Part – C--------------------------------------:--------------------------------------------
--1. Display Products with Average Sales Amount Between 1000 and 2000, Ordered by Product Name
	select
		Product,avg(Sales_Amount)
	from sale_data
	group by Product
	having avg(Sales_Amount) between 1000 and 2000
	order by Product
--2. Display Years with More Than 5 Orders from Each Region
	select
		Year,count(Product)
	from sale_data
	group by Region,Year
	having count(product) > 5

--3. Display Regions with Average Sales Amount Above 1500 in Year 2023 sort by amount in descending.
	select
		Year,Region,avg(Sales_Amount)
	from sale_data
	where Year = 2023
	group by Region,Year
	having avg(Sales_Amount) > 1500 
	order by avg(Sales_Amount) desc
--4. Find out region wise duplicate product.
	select
		Region,product,count(product)
	from sale_data
	group by product,Region
	having count( product) > 1

--5. Find out region wise highest sales amount.
	select
		Region,max(Sales_Amount)
	from sale_data
	group by Region










    -------------------------------------------------------------------------------end------------------------------------------------------------------------------------
