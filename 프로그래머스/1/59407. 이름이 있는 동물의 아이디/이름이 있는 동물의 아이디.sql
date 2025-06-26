-- 코드를 입력하세요
-- 이름이 있는 동물 조회 -> IS NOT NULL, 오름차순 정렬 order by 사용
SELECT ANIMAL_ID 
FROM ANIMAL_INS 
WHERE NAME IS NOT NULL 
ORDER BY ANIMAL_ID;