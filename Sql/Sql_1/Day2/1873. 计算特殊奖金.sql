SELECT employee_id,
       if(employee_id % 2=1 AND LEFT(name,1)!='M', salary, 0) AS bonus
FROM Employees
ORDER BY employee_id;

SELECT employee_id,
       CASE (employee_id % 2=1 AND LEFT(name,1)!='M') THEN salary ELSE 0 AS bonus
FROM Employees
ORDER BY employee_id;

-- if(布尔表达式，true时返回，false时返回)
-- 等同于 CASE THEN ELSE
-- LEFT(字符串，截取长度)