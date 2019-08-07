update regions
set region_name = 'Region ' || region_id
where region_id > 10;

SELECT *
FROM REGIONS;