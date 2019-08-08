create sequence my_seq start with 201 increment BY 1;

INSERT INTO CODERS 
       VALUES (my_seq.nextval, 'Maria', 'Rossi', SYSDATE, 5000);
      

INSERT INTO CODERS (CODER_ID, FIRST_NAME,LAST_NAME,HIRE_DATE, SALARY)
       VALUES (my_seq.nextval,'Franco', 'Bianchi',SYSDATE, 4500);
      
UPDATE CODERS
       SET FIRST_NAME = 'Mariangela'
       WHERE CODER_ID = 201;

UPDATE CODERS
       SET SALARY= SALARY+500
       WHERE SALARY< 6000;
      
      SELECT my_seq.nextval
      FROM DUAL;

DROP SEQUENCE my_seq; 