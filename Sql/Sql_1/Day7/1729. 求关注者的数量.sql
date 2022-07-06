SELECT user_id, COUNT(user_id) followers_count
FROM followers
GROUP BY user_id
ORDER BY user_id;