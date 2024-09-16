# Write your MySQL query statement below
SELECT id, movie, description, rating from Cinema
WHERE NOT description = 'boring' AND NOT (id%2) = 0
ORDER BY rating DESC;