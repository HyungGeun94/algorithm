-- 코드를 입력하세요
SELECT 
a.NAME,a.DATETIME
FROM
    ANIMAL_INS as a
LEFT JOIN
    ANIMAL_OUTS as o
ON
    a.ANIMAL_ID = o.ANIMAL_ID
WHERE o.ANIMAL_TYPE is null
order by a.DATETIME
limit 3;