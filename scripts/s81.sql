set serveroutput on

declare
    cursor v_coder_cursor is
        select last_name, hire_date, salary from coders;
begin
    for v_cur in v_coder_cursor loop
--        dbms_output.put_line('[' || v_cur.last_name || ', ' || v_cur.hire_date || ','||v_cur.salary||']');
        dbms_output.put_line('[' || v_cur.last_name || ', ' || v_cur.hire_date || ',' || v_cur.salary || ']');
    end loop;
end;
/