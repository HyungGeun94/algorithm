-- 코드를 입력하세요
SELECT
ANIMAL_ID,NAME
FROM
ANIMAL_INS
where ANIMAL_TYPE = 'Dog' and NAME like '%el%'
order by name;