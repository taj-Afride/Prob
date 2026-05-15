# Write your MySQL query statement below
SELECT customer_id,COUNT(customer_id) AS count_no_trans
FROM Visits AS A
LEFT JOIN Transactions AS B
ON A.visit_id=B.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id;