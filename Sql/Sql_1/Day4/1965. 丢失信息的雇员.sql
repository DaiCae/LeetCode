-- 解法一 分别取差集再取并集
SELECT employee_id
FROM employees
WHERE employee_id NOT IN (SELECT employee_id FROM salaries)
UNION
SELECT employee_id
FROM salaries
WHERE employee_id NOT IN (SELECT employee_id FROM employees)
ORDER BY employee_id

-- 解法二 对两张表求并集再使用HAVING字句筛选
SELECT employee_id
FROM (SELECT employee_id
      FROM employees
      UNION ALL
      SELECT employee_id
      FROM salaries) AS t
GROUP BY employee_id
HAVING count(employee_id) = 1
ORDER BY employee_id;
