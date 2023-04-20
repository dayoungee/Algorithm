-- 코드를 입력하세요
SELECT BOOK_ID, AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
FROM AUTHOR as a
JOIN BOOK as b ON a.AUTHOR_ID=b.AUTHOR_ID
WHERE b.CATEGORY='경제'
ORDER BY b.PUBLISHED_DATE;