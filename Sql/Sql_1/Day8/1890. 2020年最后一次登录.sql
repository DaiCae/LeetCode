SELECT user_id, max(time_stamp) last_stamp
FROM Logins
WHERE year(time_stamp) = '2020'
GROUP BY user_id

# 最后登录时间采用max函数即可求出,再使用WHERE限定为2020年