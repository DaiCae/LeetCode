# if和coalesce函数
# coalesce(表达式1,表达式2,...)
# 按照顺序首先执行表达式1，如果不为null则返回表达式1的结果
# 如果为null，则往下执行表达式2。以此类推。
# 可以用于当返回值为null时的默认返回。

SELECT u.name,coalesce(sum(distance),0) AS travelled_distance
FROM users u LEFT JOIN rides r ON u.id = r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC,u.name


SELECT u.name,if(sum(distance) is null,0,sum(distance)) AS travelled_distance
FROM users u LEFT JOIN rides r ON u.id = r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC,u.name

