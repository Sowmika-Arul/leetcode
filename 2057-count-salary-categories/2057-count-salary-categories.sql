WITH SalaryCategories AS (
    SELECT
        CASE
            WHEN income < 20000 THEN 'Low Salary'
            WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'
            WHEN income > 50000 THEN 'High Salary'
        END AS category
    FROM Accounts
),
Counts AS (
    SELECT category, COUNT(*) AS accounts_count
    FROM SalaryCategories
    GROUP BY category
)
SELECT c.category, COALESCE(counts.accounts_count, 0) AS accounts_count
FROM (
    SELECT 'Low Salary' AS category
    UNION ALL
    SELECT 'Average Salary'
    UNION ALL
    SELECT 'High Salary'
) c
LEFT JOIN Counts ON c.category = Counts.category;
