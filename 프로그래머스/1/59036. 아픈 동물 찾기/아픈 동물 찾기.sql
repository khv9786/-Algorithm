-- 아픈 동물의 아이디와 이름을 조회 해야하고, 아이디 순으로 정렬해야 함.
-- 아이디 -> ANIMAL_ID, 이름 -> NAME
-- 아픈 상태 조회 -> INTAKE_CONDITION : Sick
-- 
SELECT
ANIMAL_ID, NAME
FROM
ANIMAL_INS

WHERE
INTAKE_CONDITION = "Sick"
ORDER BY ANIMAL_ID ASC;