-- 코드를 작성해주세요
SELECT
    id,email,FIRST_NAME,LAST_NAME
FROM
    DEVELOPER_INFOS
    
WHERE SKILL_1 like 'Python' or SKILL_2 like 'Python' or SKILL_3 like 'Python'

order by 
    id asc;
