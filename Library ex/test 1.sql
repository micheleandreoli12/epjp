CREATE SEQUENCE author_seq;
CREATE SEQUENCE book_seq;
CREATE SEQUENCE users_seq;


--INSERT INTO authors VALUES (author_seq.nextval, 'Stephen', 'King');
--INSERT INTO authors VALUES (author_seq.nextval, 'Andrea', 'Camilleri');
--INSERT INTO authors VALUES (author_seq.nextval, 'J. K.', 'Rowling');
--INSERT INTO authors VALUES (author_seq.nextval, 'Ernest', 'Hemingway');
--INSERT INTO authors VALUES (author_seq.nextval, 'Oscar', 'Wild');


INSERT INTO BOOKS VALUES (book_seq.nextval, 'La banda Sacco');

INSERT INTO BOOK_AUTHORS VALUES (book_seq.currval, 3);

DELETE
FROM BOOK_AUTHORS;

INSERT INTO USERS VALUES (users_seq.nextval, 'Dario', 'Baldi');

INSERT INTO OUTS VALUES (2, 6, SYSDATE);

DELETE
FROM OUTS
WHERE (USER_ID=2) AND (BOOK_ID=6);

DELETE
FROM HISTORYS;

set serveroutput ON