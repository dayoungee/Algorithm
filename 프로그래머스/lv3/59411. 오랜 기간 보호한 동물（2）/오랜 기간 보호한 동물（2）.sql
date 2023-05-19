-- 코드를 입력하세요
SELECT 
    AI.animal_id, AI.name
From ANIMAL_INS as AI,
    ANIMAL_OUTS as AO
where 
    AI.animal_id = AO.animal_id
order by ABS(DATEDIFF(AI.datetime, AO.datetime)) desc
limit 2;