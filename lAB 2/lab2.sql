--LAB - 2  PART- A:
	--From the above given tables perform the following queries:
--1. Retrieve all data from table DEPOSIT.

 USE CSE_3A_228

 select * from deposit

--2. Retrieve all data from table BORROW.
  select * from BORROW

--3. Retrieve all data from table CUSTOMERS.
	select * from CUSTOMERS

--4. Display Account No, Customer Name & Amount from DEPOSIT.
	select actno, cname,amount from deposit

--5. Display Loan No, Amount from BORROW.
	select LOANNO,AMOUNT  from BORROW

--6. Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table.
		select * from BORROW
		where CNAME = 'ANDHERI'

--7. Give account no and amount of depositor, whose account no is equals to 106 from deposit table.
	select actno,amount from deposit
	where actno = 106

--8. Give name of borrowers having amount greater than 5000 from borrow table.
		select CNAME from BORROW
		where AMOUNT > 5000

--9. Give name of customers who opened account after date '1-12-96' from deposit table.
	select CNAME from deposit 
	where adate > '1996-12-1';

--10. Display name of customers whose account no is less than 105 from deposit table.
	selece cname  from  deposit 
	where actno < 105
--11. Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN)
		select cname from CUSTOMERS
		where CITY = 'NAGPUR' or CITY = 'DELHI'

		select cname from CUSTOMERS
		where CITY IN ('NAGPUR','DELHI')

--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than
--105 from deposit table.
	SELECT cname,bname from deposit
	where amount>4000 and actno <105

--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow
--table. (AND & BETWEEN)
	select * from BORROW
	where AMOUNT >= 3000 and AMOUNT<= 8000

		select * from BORROW
	where AMOUNT between 3000 and 8000

--14. Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table.
	select * from deposit 
	where branch != 'ANDHERI'

--15. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’
--Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.

  select actno,cname,amount from deposit
  where bname in ('AJNI','KAROLBAGH','M.G.ROAD') AND actno<104

  --PART-B : 

--  1. Display all the details of first five customers from deposit table.
	SELECT TOP 5 * FROM deposit

--2. Display all the details of first three depositors whose amount is greater than 1000.
		select top 3* from deposit
		where amount > 1000

--3. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to
--‘ANDHERI’ from borrow table.
		select top 5 LOANNO , CNAME from BORROW

--4. Retrieve all unique cities using DISTINCT. (Use Customers Table)
		select	DISTINCT CITY from CUSTOMERS

--5. Retrieve all unique branches using DISTINCT. (Use Branch Table)
	select DISTINCT BNAME from BRANCH

--Part – C:

--1. Retrieve top 50% record from table BORROW.
	select top 50 percent * from BORROW

--2. Display top 10% amount from table DEPOSIT.
	select top 10 percent amount  from deposit

--3. Display top 25% customer who deposited more than 5000.
	select top 25 percent * from deposit
	where  amount > 5000
--4. Retrieve first 10% Loan Amounts.
	select top 10 percent * from BORROW
--5. Retrieve all unique customer names with city.
		select DISTINCT CNAME , CITY from CUSTOMERS
--6. Retrieve all Loan records with one more column in Loan Amount as 10% extra amount.

--7. Retrieve all odd/even value loan number from Borrow table.

