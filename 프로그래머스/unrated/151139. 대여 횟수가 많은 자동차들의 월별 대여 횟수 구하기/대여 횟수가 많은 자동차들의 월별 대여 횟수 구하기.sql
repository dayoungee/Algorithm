-- 코드를 입력하세요
SELECT MONTH(START_DATE) as MONTH, CAR_ID, COUNT(*) as RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID IN(
            select CAR_ID
            from CAR_RENTAL_COMPANY_RENTAL_HISTORY
            where START_DATE >= '2022-08-01' and '2022-11-01' > START_DATE
            Group by CAR_ID
            having count(*)>=5) AND START_DATE >= '2022-08-01' AND START_DATE < '2022-11-01'
Group by CAR_ID, MONTH(START_DATE)
order by MONTH, CAR_ID desc;