# MySQL 使用三值逻辑 —— TRUE, FALSE 和 UNKNOWN。
# 任何与 NULL 值进行的比较都会与第三种值 UNKNOWN 做比较。
# 这个“任何值”包括 NULL 本身！
# 这就是为什么 MySQL 提供 IS NULL 和 IS NOT NULL 两种操作来对 NULL 特殊判断。
# 因此，在 WHERE 语句中我们需要做一个额外的条件判断 `referee_id IS NULL'。
SELECT name FROM customer WHERE referee_id !=2 OR referee_id IS NULL;