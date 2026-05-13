# Write your MySQL query statement below
SELECT DISTINCT project_id, ROUND(AVG(experience_years),2) AS average_years
FROM Project AS A
LEFT JOIN Employee AS B
ON A.employee_id=B.employee_id
GROUP BY project_id