# Write your MySQL query statement
SELECT product_name,year,price
FROM Sales AS A
LEFT JOIN Product AS B
ON A.product_id=B.product_id;