/*SELECT date_format(sales_date, '%Y-%m-%d') sales_date, product_id, user_id, sales_amount
from online_sale
where date_format(sales_date, '%Y-%m') = '2022-03'
union all
select date_format(sales_date, '%Y-%m-%d')sales_date, product_id, NULL as user_id, sales_amount
from offline_sale 
where date_format(sales_date, '%Y-%m') = '2022-03'

order by sales_date, product_id, user_id*/

SELECT DATE_FORMAT(SALES_DATE, "%Y-%m-%d") SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE
WHERE SALES_DATE LIKE '%-03-%'
UNION ALL
SELECT DATE_FORMAT(SALES_DATE, "%Y-%m-%d") SALES_DATE, PRODUCT_ID, NULL as USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE SALES_DATE LIKE '%-03-%'
ORDER BY sales_date, product_id, user_id ;
