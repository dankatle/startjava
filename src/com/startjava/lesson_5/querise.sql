SELECT * FROM robots;

SELECT * FROM robots WHERE status != 'Destroyed';

SELECT * FROM robots WHERE (mark = 'Mark-1' OR  mark = 'Mark-6');

SELECT * FROM robots ORDER BY mark;

SELECT * FROM robots ORDER BY launch LIMIT 1;

SELECT * FROM robots WHERE kaijukill = (SELECT MAX(kaijukill) FROM robots);
SELECT * FROM robots WHERE kaijukill = (SELECT MIN(kaijukill) FROM robots);

SELECT AVG(weight) FROM robots;

UPDATE robots SET kaijukill = kaijukill + 1 WHERE mark != 'Destroyed';

DELETE FROM robots WHERE status = 'Destroyed';
