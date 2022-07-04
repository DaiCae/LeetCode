-- //从pos开始的位置，截取len个字符(空白也算字符)。
-- SUBSTR(string ,pos,len);
SELECT
    user_id,
    concat(upper(left(name,1)),lower(substr(name,2))) AS name
FROM
    Users
ORDER BY
    user_id