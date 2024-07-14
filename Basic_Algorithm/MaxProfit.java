import java.util.Arrays;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/14 11:50
 * @Version : V1.2
 * @Description : 买卖股票的最大收益有空窗期
 */
public class MaxProfit {
        int prices[];
        int memo[][];
        public int maxProfit(int[] prices) {
            this.prices = prices;
            memo = new int[prices.length + 1][2];
            for (int i = 0; i < memo.length;i++){
                Arrays.fill(memo[i],Integer.MIN_VALUE / 2);
            }
            return dfs(prices.length - 1,0);
        }
        public int dfs(int index,int hold){
            if (index < 0){
                return hold == 1 ? Integer.MIN_VALUE / 2:0;// index < 0 当前如何还是持有股票的话是不符合题意的 所以设置成最小值
                //否则的情况 如果当前index小于1，正常来说是应该没有持有股票的 这时候应该返回结果是0
            }
            if (memo[index][hold] != Integer.MIN_VALUE / 2){
                return memo[index][hold];
            }
            if (hold == 1){
                //当前持有股票
                return memo[index][hold] = Math.max(dfs(index - 1,hold),dfs(index - 2,0) - prices[index]);
            }
            return memo[index][hold] = Math.max(dfs(index - 1,hold),dfs(index - 1,1) + prices[index]);
        }
}
