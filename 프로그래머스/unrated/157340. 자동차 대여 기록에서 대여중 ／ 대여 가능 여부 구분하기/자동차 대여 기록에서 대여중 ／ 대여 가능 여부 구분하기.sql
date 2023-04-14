-- 코드를 입력하세
/* SELECT CAR_ID, MAX(CASE WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE
                    THEN '대여중'
                    ELSE '대여 가능'
                    END) AVAILABILITY, START_DATE, END_DATE
                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                    GROUP BY CAR_ID
                    ORDER BY CAR_ID DESC; */
 SELECT CAR_ID, MAX(CASE WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE
                    THEN '대여중'
                    ELSE '대여 가능'
                    END)AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC; 
