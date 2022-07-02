-- 解法一：自连接，会产生笛卡尔积，仅适用于数据量小的情况
DELETE p1 FROM Person p1,
    Person p2
WHERE
    p1.Email = p2.Email AND p1.Id > p2.Id
-- 解法二：嵌套查询，效率高
DELETE
from Person
Where Id not in (Select Id
                 From (Select MIN(Id) as id
                       From Person
                       Group by Email) t)

