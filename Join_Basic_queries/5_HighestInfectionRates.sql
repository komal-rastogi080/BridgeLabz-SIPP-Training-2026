-- Use Case 5
SELECT c.country_name,
       confirmed_cases,
       population,
       (confirmed_cases * 100.0 / population) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY infection_rate DESC;
