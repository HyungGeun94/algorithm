-- 코드를 입력하세요
SELECT
count(distinct name) as count
FROM ANIMAL_INS
WHERE NAME is not null;