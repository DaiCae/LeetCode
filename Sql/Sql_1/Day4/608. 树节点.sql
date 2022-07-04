-- 解法一 使用UNIION
SELECT id,
       'Root' AS Type
FROM tree
WHERE p_id IS NULL
UNION
SELECT id,
       'Leaf' AS Type
FROM tree
WHERE id NOT IN (SELECT DISTINCT p_id
                 FROM tree
                 WHERE p_id IS NOT NULL)
  AND p_id IS NOT NULL
UNION
SELECT id,
       'Inner' AS Type
FROM tree
WHERE id IN (SELECT DISTINCT p_id
             FROM tree
             WHERE p_id IS NOT NULL)
  AND p_id IS NOT NULL
ORDER BY id;


-- 解法二 使用CASE
SELECT id AS 'Id', CASE
    WHEN tree.id = (SELECT atree.id FROM tree atree WHERE atree.p_id IS NULL)
        THEN 'Root'
    WHEN tree.id IN (SELECT atree.p_id FROM tree atree)
        THEN 'Inner'
    ELSE 'Leaf'
    END AS 'type'
FROM tree
ORDER BY 'Id'