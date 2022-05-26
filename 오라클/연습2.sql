select * from employees;

select first_name, last_name from employees
where salary>=10000 and hire_date>='04/05/05';
select email, phone_number from employees
where first_name like 'D%' and last_name like 'L%';
select * from employees where job_id like 'IT%' and salary>=8000;
select * from employees where job_id like 'FI%' and salary>=9000;
select first_name, last_name from employees
where hire_date between '03/01/01' and '05/12/31';
select first_name, last_name from employees
where job_id like 'ST%' or department_id in(90, 100);

select sum(salary) AS "¿¬ºÀÃÑ¾×", count(employee_id) AS "ÀÎ¿ø",
avg(salary) AS "¿¬ºÀÆò±Õ", max(salary) AS "ÃÖ°í¿¬ºÀ", min(salary) AS "ÃÖÀú¿¬ºÀ"
from employees where department_id=50;

select sum(salary) AS "¿¬ºÀÃÑ¾×", count(employee_id) AS "ÀÎ¿ø",
avg(salary) AS "¿¬ºÀÆò±Õ", max(salary) AS "ÃÖ°í¿¬ºÀ", min(salary) AS "ÃÖÀú¿¬ºÀ"
from employees where job_id like 'SA%';

select * from employees where phone_number like '515.127.%';
select * from employees where job_id like '_A_%';
select * from employees where salary between 3000 and 7500;