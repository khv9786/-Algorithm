-- 코드를 입력하세요
-- ID 순으로, 생물 종, 이름, 성별, 중성화 여부 조회 해야함. 이름은 NULL 'NO name' 해야함

SELECT ANIMAL_TYPE, IFNULL(NAME, "No name"), SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;