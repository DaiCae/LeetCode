-- 利用LIMIT和OFFSET对排序后的结果取出第二个
SELECT IFNULL(
               (SELECT DISTINCT Salary
                FROM Employee
                ORDER BY Salary DESC
                   LIMIT 1 OFFSET 1),
    NULL) AS SecondHighestSalary