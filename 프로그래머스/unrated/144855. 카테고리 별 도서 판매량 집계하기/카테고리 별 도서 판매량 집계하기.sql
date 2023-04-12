-- 코드를 입력하세요
SELECT C.category ,sum(C.sales) total_sale from
(SELECT B.BOOK_ID, CATEGORY,SALES_DATE, SALES 
 FROM book a, BOOK_SALES b 
 where a.book_id = b.book_id 
 and b.saleS_date 
 between to_Date('20220101','YYYY-MM-DD') AND TO_dATE('20220131','YYYY-MM-DD')) C
group by C.category
order by C.category;