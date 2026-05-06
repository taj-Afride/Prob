# Write your MySQL query statement below
SELECT name,unique_id
FROM Employees AS A
LEFT JOIN EmployeeUNI AS B
ON A.id=B.id;