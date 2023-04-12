-- 코드를 입력하세요
SELECT b.PRODUCT_ID,	b.PRODUCT_NAME,	b.PRODUCT_CD,	b.CATEGORY,	b.PRICE from (select max(price) price from FOOD_PRODUCT) a, food_product b
where a.price= b.price;