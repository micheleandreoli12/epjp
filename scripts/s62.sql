-- -- connected as sysdba
-- -- when required, work on the required container
-- alter session set container=xepdb1;
-- grant select on hr.employees to me;

create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from hr.employees
    where department_id = 60;
   
   
SELECT *
FROM CODERS;