-- 코드를 입력하세요
SELECT I.flavor from first_half F, icecream_info I
where F.flavor = I.flAVOR
and I.INGREDIENT_TYPE ='fruit_based'
AND F.total_order >= 3000;

