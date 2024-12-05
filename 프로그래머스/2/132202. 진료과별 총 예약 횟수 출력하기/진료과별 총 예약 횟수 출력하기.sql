SELECT
MCDP_CD as '진료과코드',
count(*) as '5월예약건수'
FROM
APPOINTMENT
where APNT_YMD >= '2022-05-01 00:00:00.000000'
AND APNT_YMD < '2022-06-01 00:00:00'
group by 
MCDP_CD
order by 
count(*), MCDP_CD;
