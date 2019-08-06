select first_name, last_name
from employees
where employee_id = (
	select manager_id from employees where last_name = 'Chen');

select department_id, trunc(avg(salary))
from employees
group by department_id having avg(salary) < (
    select max(avg(salary)) 
    from employees 
    group by department_id);

select employee_id
from (
	select employee_id
	from employees
	where employee_id between 112 and 115);
	
--select department_id, trunc(avg(salary))
--from employees
--group by department_id having avg(salary) < avg(
--    select max(avg(salary)), min(avg(salary)) 
--    from employees 
--    group by department_id);