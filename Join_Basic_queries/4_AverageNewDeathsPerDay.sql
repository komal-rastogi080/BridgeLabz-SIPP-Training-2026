-- Use Case 4
SELECT report_date,
       AVG(new_deaths) AS avg_daily_deaths
FROM covid_deaths
GROUP BY report_date
ORDER BY report_date;
