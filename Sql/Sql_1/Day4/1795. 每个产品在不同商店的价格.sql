SELECT product_id, 'store1' AS 'store', store1 AS 'price' FROM Products WHERE store1 IS NOT NULL
UNION ALL
SELECT product_id, 'store2' AS 'store', store2 AS 'price' FROM Products WHERE store2 IS NOT NULL
UNION ALL
SELECT product_id, 'store3' AS 'store', store3 AS 'price' FROM Products WHERE store3 IS NOT NULL

-- UNION 和 UNION ALL 的区别： UNION会对结果去重，UNION ALL 允许保留相同结果