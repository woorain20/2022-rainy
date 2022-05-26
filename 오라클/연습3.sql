select * from countries;
select * from jobs;
select * from locations;
select * from departments;

select * from countries where region_id=2;
select * from countries where country_id like '_R';
select * from countries where country_name like 'B%';
select * from countries where region_id in(1,3);
select * from countries where country_id like '_H' or country_name like 'I%';

select * from jobs where min_salary between 3500 and 6400;
select * from jobs where max_salary between 12000 and 17000;
select * from jobs where job_title like 'A%' and min_salary>=5000;
select * from jobs where job_id like '_T_%' and max_salary>=8000;
select * from jobs where max_salary in(10000, 20000);
select * from jobs where min_salary in(2500, 6000);

select * from locations where country_id like 'U%';
select * from locations where postal_code like '3%' or postal_code like '_92';
select * from locations where city in('London', 'Bern', 'Roma');
select * from locations where country_id like '_A' or country_id like '_U';

select * from departments where department_id between 100 and 200;
select * from departments where location_id=1700;
select * from departments where department_name like 'C%';
