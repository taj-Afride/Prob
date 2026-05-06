SELECT name
FROM Employee AS e
JOIN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
) m
ON e.id = m.managerId;