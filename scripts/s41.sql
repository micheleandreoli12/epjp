select lpad('tom', 30, '.') tom,
	rpad('tim', 30, '_- -_') tim
from dual;

select ltrim(' Hi!'),
	rtrim('Hi!abab', 'ab'),
	trim('0' from '00Hi!000')
from dual;

select employee_id, nvl(commission_pct, 0)
from employees;

select employee_id, nvl2(commission_pct, 'value', 'no value')
from employees;

select replace('Begin here', 'Begin', 'End'),
	substr('ABCDEFG',3,4)
from dual;

select replace('Begin here', 'Begin', 'End'),
	substr(123456789,3,4)-- transforma in stringa
from dual;

select replace('Begin here', 'Begin', 'End'),-- vedi sopra
	substr(SYSDATE,3,4)
from dual;