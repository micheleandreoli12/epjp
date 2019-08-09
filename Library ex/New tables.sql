DROP TABLE AUTHORS;
DROP TABLE BOOK_AUTHORS;
DROP TABLE OUTS;
DROP TABLE HISTORYS;
DROP TABLE BOOKS;
DROP TABLE USERS;



  CREATE TABLE BOOKS (
   book_id integer
       CONSTRAINT book_pk PRIMARY KEY,
   titolo varchar2 (20)
       CONSTRAINT book_name_nn NOT NULL
   );
  
  CREATE TABLE AUTHORS (
  author_id integer
       CONSTRAINT author_pk PRIMARY KEY,
  first_name varchar2 (20)
       CONSTRAINT author_name_nn NOT NULL,
  last_name varchar2 (20)
       CONSTRAINT author_surname_nn NOT NULL);
  
  
  CREATE TABLE BOOK_AUTHORS (
  book_id integer
       CONSTRAINT booka_book_id_fk REFERENCES books(book_id) ON DELETE CASCADE,
  author_id INTEGER
       CONSTRAINT booka_author_id_fk REFERENCES authors(author_id) ON DELETE CASCADE,
  CONSTRAINT booka_booka_pk PRIMARY KEY (book_id, author_id));

 
  CREATE TABLE USERS (
  user_id integer
       CONSTRAINT user_id_pk PRIMARY KEY,
  first_name varchar2 (20)
       CONSTRAINT user_name_nn NOT NULL,
  last_name varchar2 (20)
       CONSTRAINT user_surname_nn NOT NULL);
  
   
   CREATE TABLE OUTS (
   user_id integer
       CONSTRAINT out_user_id_fk REFERENCES users(user_id),
   book_id integer
       CONSTRAINT out_book_id_fk REFERENCES books(book_id),
   start_date DATE
       CONSTRAINT out_date_nn NOT NULL);
   
      
   CREATE TABLE HISTORYS (
   user_id integer
       CONSTRAINT history_user_id_fk REFERENCES users(user_id),
   book_id integer
       CONSTRAINT histrory_book_id_fk REFERENCES books(book_id),
   start_date DATE
       CONSTRAINT out_date_history_nn NOT NULL,
   end_date DATE);
       
       
   CREATE OR REPLACE TRIGGER history_update
   BEFORE INSERT ON outs
   FOR EACH ROW
   BEGIN
     insert into historys values(
      :new.user_id, :new.book_id, sysdate, null);
   END history_update;
   /
   
   
   CREATE OR REPLACE TRIGGER history_update_end
   BEFORE DELETE ON outs
   FOR EACH ROW
   DECLARE 
        v_user historys.user_id%type;
        v_book historys.book_id%type;
        v_start historys.start_date%type;
        
   BEGIN
   
   SELECT user_id, book_id, start_date
   INTO v_user,v_book, v_start
   From historys
   where (user_id=:old.user_id) and (book_id=:old.book_id) and (end_date is null);
     dbms_output.put_line('entra ' || v_user || ' ' || v_book || ' ' || v_start);
     UPDATE historys
     SET end_date=sysdate
      where (user_id=:old.user_id) and (book_id=:old.book_id) and (end_date is null);
   END history_update_end;
   /
   
   
   CREATE OR REPLACE TRIGGER book_is_out
   INSTEAD OF INSERT ON outs
   FOR EACH ROW
   DECLARE 
        v_user historys.user_id%type;
        v_book historys.book_id%type;
        v_start historys.start_date%type;
        
   BEGIN
   
   SELECT user_id, book_id, start_date
   INTO v_user,v_book, v_start
   From historys
   where (user_id=:old.user_id) and (book_id=:old.book_id) and (end_date is null);
     dbms_output.put_line('entra ' || v_user || ' ' || v_book || ' ' || v_start);
     UPDATE historys
     SET end_date=sysdate
      where (user_id=:old.user_id) and (book_id=:old.book_id) and (end_date is null);
   END history_update_end;
   /
   