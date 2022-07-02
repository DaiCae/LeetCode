UPDATE salary
SET sex = (CASE sex WHEN 'm' THEN 'f' ELSE 'm' END);

UPDATE salary
SET sex = if(sex = 'm', 'f', 'm');