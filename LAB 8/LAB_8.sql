use CSE_3A_240

DROP TABLE Sales

CREATE TABLE SALES (
  REGION VARCHAR(50),
  PRODUCT VARCHAR(50),
  SALES_AMOUNT DECIMAL(10, 2),
  YEAR INT
);

INSERT INTO SALES (REGION, PRODUCT, SALES_AMOUNT, YEAR)
VALUES
  ('North America', 'Watch', 1500.00, 2023),
  ('Europe', 'Mobile', 1200.00, 2023),
  ('Asia', 'Watch', 1800.00, 2023),
  ('North America', 'TV', 900.00, 2024),
  ('Europe', 'Watch', 2000.00, 2024),
  ('Asia', 'Mobile', 1000.00, 2024),
  ('North America', 'Mobile', 1600.00, 2023),
  ('Europe', 'TV', 1500.00, 2023),
  ('Asia', 'TV', 1100.00, 2024),
  ('North America', 'Watch', 1700.00, 2024);

--Part – A:
--1. Display Total Sales Amount by Region.

SELECT
	REGION, SUM(SALES_AMOUNT) AS TOTAL_SALES_AMOUNT
FROM
	Sales
GROUP BY
	REGION

--2. Display Average Sales Amount by Product

SELECT
	PRODUCT, AVG(SALES_AMOUNT)
FROM
	SALES
GROUP BY 
	PRODUCT

--3. Display Maximum Sales Amount by Year

SELECT
	YEAR, MAX(SALES_AMOUNT)
FROM
	SALES
GROUP BY
	YEAR

--4. Display Minimum Sales Amount by Region and Year

SELECT
	REGION, YEAR, MIN(SALES_AMOUNT)
FROM
	SALES
GROUP BY
	REGION, YEAR

--5. Count of Products Sold by Region

SELECT
	REGION, COUNT(PRODUCT)
FROM
	SALES
GROUP BY
	REGION

--6. Display Sales Amount by Year and Product

SELECT
	YEAR, PRODUCT, SUM(SALES_AMOUNT)
FROM
	SALES
GROUP BY
	YEAR, PRODUCT

--7. Display Regions with Total Sales Greater Than 5000

SELECT
	REGION, SUM(SALES_AMOUNT) AS SALES
FROM
	SALES
GROUP BY
	REGION
HAVING
	SUM(SALES_AMOUNT) > 5000

--8. Display Products with Average Sales Less Than 10000

SELECT
	PRODUCT, AVG(SALES_AMOUNT)
FROM
	SALES
GROUP BY
	PRODUCT
HAVING
	AVG(SALES_AMOUNT) < 10000

--9. Display Years with Maximum Sales Exceeding 500

SELECT
	YEAR, MAX(SALES_AMOUNT)
FROM
	SALES
GROUP BY
	YEAR
HAVING
	MAX(SALES_AMOUNT) > 500

--10. Display Regions with at Least 3 Distinct Products Sold.

SELECT
	REGION, COUNT(PRODUCT) 
FROM
	SALES
GROUP BY
	REGION
HAVING
	COUNT(PRODUCT) >= 3

--11. Display Years with Minimum Sales Less Than 1000

SELECT
	YEAR, MIN(SALES_AMOUNT) AS MIN_SALES
FROM
	SALES
GROUP BY
	YEAR
HAVING
	MIN(SALES_AMOUNT) < 1000

--12. Display Total Sales Amount by Region for Year 2023, Sorted by Total Amount

SELECT
	REGION AS REGION_FOR_2023, SUM(SALES_AMOUNT) AS TOTAL_SALES
FROM
	SALES
GROUP BY
	REGION, YEAR
HAVING
	YEAR = 2023
