-- group_concat([DISTINCT] 要连接的字段 [Order BY ASC/DESC 排序字段] [Separator '分隔符'])
SELECT
    sell_date,
    count(distinct product) AS num_sold,
    group_concat(distinct product ORDER BY product separator ',') AS products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date;