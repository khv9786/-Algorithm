-- 코드를 입력하세요
-- 나이가 null인 사람이 몇명인지, 컬럼명은 As USERS로.
SELECT COUNT(*) as 'USERS'
FROM USER_INFO
WHERE AGE IS NULL;