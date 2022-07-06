SELECT activity_date day, COUNT(DISTINCT user_id) active_users
FROM activity
WHERE datediff('2019-07-27', activity_date) >= 0 AND datediff('2019-07-27', activity_date) <30
GROUP BY activity_date

