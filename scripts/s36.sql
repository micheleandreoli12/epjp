select e.last_name, d.department_name
from employees e FULL outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120;