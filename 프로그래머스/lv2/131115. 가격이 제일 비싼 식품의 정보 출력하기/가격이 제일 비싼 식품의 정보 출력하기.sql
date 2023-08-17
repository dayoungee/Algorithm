-- 코드를 입력하세요
SELECT *
from food_product
where price=(select max(price)
                from FOOD_PRODUCT);
                
                
SELECT *
FROM FOOD_PRODUCT
WHERE PRICE=(SELECT MAX(PRICE)
             FROM FOOD_PRODUCT);