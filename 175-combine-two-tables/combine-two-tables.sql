# Write your MySQL query statement below
SELECT firstName,lastname,city,state
FROM Person AS A
LEFT JOIN Address AS B
ON A.personId=B.PersonId
