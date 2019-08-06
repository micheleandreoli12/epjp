select first_name, last_name
from employees
where employee_id in(
    select distinct manager_id
    from employees where manager_id is not null)
order by 2;

select first_name, last_name
from employees
where employee_id NOT in(
    select distinct manager_id
    from employees where manager_id is not null)
order by 2;