/*  create table employee(
		empid int PRIMARY KEY,
		empname varchar(50),
		empdept varchar(100) NOT NULL,
	); */

/*	create table department(
		deptid int PRIMARY KEY IDENTITY(1,1),
		deptname varchar(50) UNIQUE,
		deptcount int,
	);

	insert into  department(deptname,deptcount) values('Testing',1);
	insert into  department(deptname,deptcount) values('Analyst',2);
	insert into  department(deptname,deptcount) values('Development',2); */
	
--	update employee set empname = 'Arun Warrier' where empid = 1
--	select distinct empdept from employee

--	select * from employee where empdept = 'Testing' OR empdept = 'Analyst'

--	select * from department;

--	select employee.empname,department.deptname,department.deptcount from employee join department on employee.empdept = department.deptname

--	alter table employee add salary decimal(7,2)

--	update employee set salary = 30000 where empid = 1

	SELECT empdept, COUNT(*) AS NumberOfEmployees, SUM(salary) AS TotalSalary
	FROM Employee
	GROUP BY empdept;


	