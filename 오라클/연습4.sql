select * from employees;

select employee_id, salary from employees 
where salary>(select salary from employees where employee_id=103);

select employee_id, first_name, last_name from employees
where hire_date>any(select hire_date from employees where email like 'K%');

select first_name, last_name, hire_date, salary from employees
where salary>any(select salary from employees where job_id like 'AD%')
order by salary desc, hire_date;

select employee_id, email from employees
where hire_date>(select hire_date from employees where employee_id=106)
order by hire_date;

select employee_id, email from employees
where hire_date in (select hire_date from employees where job_id like 'FI%')
order by hire_date;

select first_name,last_name from employees
where salary>all(select salary from employees where job_id like 'PU%')
order by salary desc, hire_date;

select * from employees
where salary>any(select salary from employees where department_id=50)
order by salary desc, job_id, hire_date;

select distinct job_id from employees;
select distinct department_id from employees order by department_id;
select distinct hire_date from employees order by hire_date;
select distinct manager_id from employees order by manager_id;

select * from employees order by salary desc;
select * from
(select * from employees order by salary desc)
where rownum<=12;
select * from
(select * from employees order by salary)
where rownum<=12;

select * from
(select * from employees order by hire_date)
where rownum<=15;
select * from
(select * from employees order by first_name)
where rownum<=10;
select * from
(select * from employees order by last_name desc)
where rownum<=12;

select first_name,last_name from employees sample(7);
select * from employees sample(10);

select phone_number, salary, job_id from employees sample(15)
order by salary;

select employee_id, job_id, hire_date from employees sample(17)
order by first_name;

select count(*) from employees;
select job_id as"ºÎ¼­", sum(salary) as"¿¬ºÀ ÃÑÇÕ" from employees
group by job_id;

select job_id as"ÆÀ", count(salary) as"ÆÀ¿ø ¼ö",
sum(salary) as"¿¬ºÀ ÃÑÇÕ", avg(salary) as"Æò±Õ¿¬ºÀ"
from employees group by job_id order by avg(salary)desc;

select job_id as"ÆÀ", count(salary) as"ÆÀ¿ø ¼ö",
sum(salary) as"¿¬ºÀ ÃÑÇÕ", avg(salary) as"Æò±Õ¿¬ºÀ"
from employees group by job_id order by count(salary)desc, sum(salary)desc;

select job_id as"ÆÀ", count(salary) as"ÆÀ¿ø ¼ö",
sum(salary) as"ÆÀ¿¬ºÀ ÃÑÇÕ", avg(salary) as"ÆÀ Æò±Õ¿¬ºÀ",
min(salary) as"ÆÀ ³» ÃÖÀú¿¬ºÀ", max(salary) as"ÆÀ ³» ÃÖ°í¿¬ºÀ"
from employees group by job_id order by sum(salary)desc, job_id;

select job_id as"ÆÀ", count(salary) as"ÆÀ¿ø ¼ö",
sum(salary) as"ÆÀ¿¬ºÀ ÃÑÇÕ", avg(salary) as"ÆÀ Æò±Õ¿¬ºÀ",
min(salary) as"ÆÀ ³» ÃÖÀú¿¬ºÀ", max(salary) as"ÆÀ ³» ÃÖ°í¿¬ºÀ"
from employees group by job_id order by avg(salary)desc;

select sum(salary) as"¿¬ºÀÃÑ¾×", count(salary) as"Á÷¿ø ¼ö",
cast(avg(salary) as number(9,2)) as"Æò±Õ¿¬ºÀ" from employees;

select first_name,last_name,salary from employees
where salary=(select max(salary) from employees)
or salary=(select min(salary) from employees);

select first_name,last_name,hire_date from employees
where hire_date=(select max(hire_date) from employees)
or hire_date=(select min(hire_date) from employees)
order by hire_date, first_name;

select first_name,last_name,phone_number from employees
where phone_number=(select max(phone_number) from employees)
or phone_number=(select min(phone_number) from employees);

select phone_number from
(select phone_number from employees order by phone_number)
where rownum<=55;

select first_name,last_name,department_id from employees
where department_id=(select max(department_id) from employees)
or department_id=(select min(department_id) from employees)
order by department_id, first_name;

select job_id as"ÆÀ", sum(salary) as"¿¬ºÀ" from employees
group by job_id having sum(salary)>20000 order by job_id;

select job_id as"ÆÀ", sum(salary) as"¿¬ºÀÃÑ¾×", avg(salary) as"Æò±Õ¿¬ºÀ"
from employees group by job_id having avg(salary)<=9000
order by avg(salary), job_id;

select department_id as"ÆÀ¹øÈ£", count(department_id) as"ÆÀ¿ø ¼ö"
from employees group by department_id having count(department_id)<=10
order by count(department_id);

select employee_id, salary, sum(salary) as"¿¬ºÀÃÑ¾×" from employees
group by rollup(employee_id, salary);

select job_id, salary, sum(salary) as"¿¬ºÀÃÑ¾×" from employees
group by rollup(job_id, salary);

select * from jobs;

select job_title, min_salary, max_salary from jobs
where min_salary=(select max(min_salary) from jobs)
or min_salary=(select min(min_salary) from jobs);

select sum(min_salary) as "ÃÖÀú¿¬ºÀ ÃÑ¾×", sum(max_salary) as"ÃÖ°í¿¬ºÀ ÃÑ¾×",
cast(avg(min_salary) as number(8,2)) as"ÃÖÀú¿¬ºÀ Æò±Õ",
cast(avg(max_salary) as number(8,2)) as"ÃÖ°í¿¬ºÀ Æò±Õ"
from jobs;

select * from jobs where min_salary
>(select cast(avg(min_salary) as number(7,2)) from jobs)
order by min_salary;

select * from jobs where max_salary
>(select cast(avg(max_salary) as number(7,2)) from jobs)
order by max_salary desc;

select * from jobs where min_salary between 5000 and 9000;
select * from jobs where max_salary between 15000 and 19000;

select * from countries;

select distinct region_id from countries;

select * from job_history;

select * from job_history
where start_date=(select max(start_date) from job_history)
or start_date=(select min(start_date) from job_history)
order by start_date;

select * from job_history
where end_date=(select max(end_date) from job_history)
or end_date=(select min(end_date) from job_history)
order by end_date;