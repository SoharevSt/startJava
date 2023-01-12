\set ECHO all

-- Вывод всей таблицы
SELECT *
FROM jaegers;

-- Отображение только не уничтоженных роботов
SELECT *
FROM jaegers
WHERE status = 'Active';

-- Отображение роботов нескольких серий: Mark-1 и Mark-4
SELECT *
FROM jaegers
WHERE mark IN ('Mark-1', 'Mark-4');

-- Отображение всех роботов, кроме Mark-1 и Mark-4
SELECT *
FROM jaegers
WHERE mark NOT IN ('Mark-1', 'Mark-4');

-- Сортировка таблицы по убыванию по столбцу mark
SELECT *
FROM jaegers
ORDER BY mark DESC;

-- Отображение самого старого робота
SELECT *
FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- Отображение роботов, которые уничтожили больше всех kaiju
SELECT *
FROM jaegers
WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers);

-- Отображение среднего веса роботов
SELECT AVG(weight)
FROM jaegers;

-- Увеличение на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers
SET kaiju_kill = kaiju_kill + 1
WHERE status = 'Active';

-- Удаление уничтоженных роботов
DELETE
FROM jaegers
WHERE status = 'Destroyed';