set serveroutput on

-- creazione procedura
create or replace procedure tomorrow is
begin
 dbms_output.put_line( sysdate+1);
end tomorrow;
/

-- uso procedura

begin
tomorrow();
end;
/

-- seconda versione

create or replace procedure tomorrow2 (
p_date out date )is
begin
 select sysdate+1
 into p_date
 from dual;
end tomorrow2;
/

-- secondo uso
declare
 v_date DATE;
 
begin
tomorrow2(v_date);
dbms_output.put_line( v_date);
EXCEPTION
when others then
dbms_output.put_line( 'Exception');
end;
/

-- giorno seguente

create or replace procedure following (
p_date in date,
p_date2 out date )is
begin
 p_date2 := p_date +1;
end following;
/

-- uso

declare
 v_date DATE;
 v_date2 date;
 
begin
following(sysdate+4,v_date2);
dbms_output.put_line( v_date2);
EXCEPTION
when others then
dbms_output.put_line( 'Exception');
end;
/

-- come funzione
-- creazione

create or replace function tomorrow3 
return date is
 v_tomorrow date;
begin
v_tomorrow := sysdate +1;
return v_tomorrow;
end tomorrow3;
/

-- uso

declare
 v_date DATE;
 
begin
v_date := tomorrow3();
dbms_output.put_line( v_date);
EXCEPTION
when others then
dbms_output.put_line( 'Exception');
end;
/