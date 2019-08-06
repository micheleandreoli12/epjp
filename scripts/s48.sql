select department_id, trunc(avg(salary))
from employees
group by department_id
order by 1;

SELECT DISTINCT department_id
FROM EMPLOYEES
ORDER BY 1;

SELECT department_id, MAX(salary)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 1;