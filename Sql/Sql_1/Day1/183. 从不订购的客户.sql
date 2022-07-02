SELECT name
FROM customers
WHERE customers.id NOT IN
      (SELECT customerid FROM orders);