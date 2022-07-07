# SUM 和 GROUP BY 同时使用达到分组求和最总结果的目的
SELECT event_day AS day, emp_id AS emp_id, sum(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id;

