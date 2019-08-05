select last_name
from employees
where last_name like '_ul%';

select *
from regions
where region_id not in (2, 3);

-- !! NOT IN(..., NULL) -> FALSE !!
select *
from regions
where region_id not in (2, 3, null);--intervalli chiusi ai due lati es. 2 e 3 compresi

select *
from regions
where region_id between 2 and 3;

select *
from employees
where manager_id is null;

SELECT FIRST_NAME
FROM EMPLOYEES
WHERE SALARY BETWEEN 10000 AND 20000
