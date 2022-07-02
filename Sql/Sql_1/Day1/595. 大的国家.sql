
# Solution1
SELECT name,
       population,
       area
FROM world
WHERE area >= 3000000
   OR population >= 25000000;

# Solution2
# OR会破坏索引采用UNION能够具有更好的性能
SELECT name,
       population,
       area
FROM world
WHERE area >= 3000000

UNION

SELECT name,
       population,
       area
FROM world
WHERE population >= 25000000;