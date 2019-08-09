--DROP TABLE BOOKS;
--DROP TABLE AUTHORS;
--DROP TABLE BOOK_AUTHORS;
--DROP TABLE OUTS;
--DROP TABLE USERS;
--DROP TABLE HISTORYS;



  CREATE TABLE BOOKS (
   book_id integer
       CONSTRAINT book_pk PRIMARY KEY,
   titolo varchar2
       CONSTRAINT book_name_nn NOT NULL
   );
  
  CREATE TABLE AUTHORS (
  author_id integer
       CONSTRAINT author_pk PRIMARY KEY,
  first_name varchar2
       CONSTRAINT author_name_nn NOT NULL,
  last_name varchar2
       CONSTRAINT author_surname_nn NOT NULL);
  
  
  CREATE TABLE BOOK_AUTHORS (
  book_id integer
       CONSTRAINT booka_book_id_fk REFERENCES books(book_id) ON DELETE CASCADE,
  authors_id INTEGER
       CONSTRAINT booka_author_id_fk REFERENCES authors(authors_id) ON DELETE CASCADE,
  CONSTRAINT booka_booka-pk PRIMARY KEY (book_id,author_id));

 
  CREATE TABLE USERS (
  user_id integer
       CONSTRAINT user_id_pk PRIMARY KEY,
  first_name varchar2
       CONSTRAINT author_name_nn NOT NULL,
  last_name varchar2
       CONSTRAINT author_surname_nn NOT NULL);
  
   
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
       CONSTRAINT out_date_nn NOT NULL,
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
   BEGIN
     insert into historys (user_id, book_id, end_date) values(
      :old.user_id, :old.book_id, sysdate);
   END history_update_end;
   /
   