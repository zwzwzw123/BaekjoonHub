-- 코드를 입력하세요
SELECT
    b.TITLE,
    B.BOARD_ID,
    R.REPLY_ID,
    R.WRITER_ID,
    R.CONTENTS,
    to_char(R.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE 
from USED_GOODS_BOARD b, USED_GOODS_REPLY r
WHERE r.board_id = b.board_id
and to_Char(b.created_date,'YYYY-MM') = '2022-10'
order by R.CREATED_DATE asc, B.title asc;