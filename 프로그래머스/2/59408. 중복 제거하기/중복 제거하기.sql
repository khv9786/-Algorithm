-- DISTINCT, GROUP BY -> 정렬 유무 차이 간단하므로 DISTINCT 사용
-- COUNT와 DUSTUNCT로 중복 제거 후 개수 새기
-- AS로 COUNT 별칭 주기


SELECT COUNT (DISTINCT(NAME)) as 개수

FROM ANIMAL_INS