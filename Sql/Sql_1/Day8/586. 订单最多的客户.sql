SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1

# 通过分组再分别计数排序,取出的第一个数据就为 订单最多的客户