SELECT
    BOOK_ID,
    DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM
BOOK
WHERE CATEGORY Like '%인문%' 
    AND PUBLISHED_DATE BETWEEN '2021-01-01' AND '2021-12-31'
order by PUBLISHED_DATE;
