SELECT l.STREET_ADDRESS, l.POSTAL_CODE, l.CITY, c.COUNTRY_NAME
FROM LOCATIONS l JOIN COUNTRIES c USING (COUNTRY_ID);

SELECT e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME
FROM EMPLOYEES e JOIN DEPARTMENTS d USING (DEPARTMENT_ID);

SELECT e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME
FROM EMPLOYEES e JOIN DEPARTMENTS d USING (DEPARTMENT_ID) JOIN LOCATIONS USING (LOCATION_ID)
WHERE CITY = 'Toronto';

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE (HIRE_DATE-(SELECT HIRE_DATE 
       FROM EMPLOYEES 
       WHERE FIRST_NAME = 'David' AND LAST_NAME = 'Lee')) >0;


      
      
SELECT e.FIRST_NAME,e.LAST_NAME, e.HIRE_DATE
FROM EMPLOYEES e JOIN EMPLOYEES m ON (e.MANAGER_ID=m.EMPLOYEE_ID)
WHERE e.HIRE_DATE-m.HIRE_DATE < 0;

-- seconda versione prova

SELECT FIRST_NAME, LAST_NAME, MANAGER_ID AS x
SELECT HIRE_DATE AS managere_hire
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN (SELECT DISTINCT MANAGER_ID
        FROM EMPLOYEES
        WHERE MANAGER_ID = X)




-- fine vesione



SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID = (SELECT MANAGER_ID 
                     FROM EMPLOYEES 
                     WHERE (FIRST_NAME='Lisa') AND (LAST_NAME='Ozer')) AND (FIRST_NAME!='Lisa' AND LAST_NAME!='Ozer');
                     
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                       FROM EMPLOYEES
                       WHERE REGEXP_LIKE (LAST_NAME, '[u]', 'i'));

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DISTINCT DEPARTMENT_ID
                       FROM DEPARTMENTS
                       WHERE DEPARTMENT_NAME = 'Shipping');
                      
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID IN (SELECT DISTINCT EMPLOYEE_ID
                       FROM EMPLOYEES
                       WHERE (FIRST_NAME = 'Steven') AND (LAST_NAME = 'King'));

