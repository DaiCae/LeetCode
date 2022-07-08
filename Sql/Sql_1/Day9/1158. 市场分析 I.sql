# ifnull(x1, x2) ：如果 x1 为 NULL， 返回 x2，否则返回 x1。
SELECT Users.user_id AS buyer_id, join_date, IFNULL(UserBuy.cnt, 0) AS orders_in_2019
FROM Users
         LEFT JOIN (SELECT buyer_id, COUNT(order_id) cnt
                    FROM Orders
                    WHERE order_date BETWEEN '2019-01-01' AND '2019-12-31'
                    GROUP BY buyer_id) UserBuy
                   ON Users.user_id = UserBuy.buyer_id
