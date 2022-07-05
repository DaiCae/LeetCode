SELECT w1.id AS 'Id'
FROM weather w1
         JOIN
     weather w2 ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
         AND w1.Temperature > w2.Temperature
-- MySQL 使用 DATEDIFF 来比较两个日期类型的值。
-- 将 weather 与自身相结合，并使用 DATEDIFF() 函数