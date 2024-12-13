-- 코드를 입력하세요
SELECT
b.book_id as BOOK_ID
,a.author_name as AUTHOR_NAME
,DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM 
BOOK as b join AUTHOR as a
ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE b.category like '%경제%'
order by b.PUBLISHED_DATE;