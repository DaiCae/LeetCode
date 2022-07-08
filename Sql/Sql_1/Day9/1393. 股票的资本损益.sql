SELECT stock_name,
       SUM(
               CASE operation
                   WHEN 'sell' #如果我们的操作是卖出
                       THEN price
                   ELSE -price #那么返回我们的到的收益，反之，操作是买入，返回支出
                   END
           ) AS capital_gain_loss #计算卖出和买入差值的和
FROM Stocks
GROUP BY stock_name #要报告每只股票的资本损益，需要对股票进行分组
