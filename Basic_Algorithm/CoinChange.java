import java.util.Arrays;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/6 23:52
 * @Version : V1.2
 * @Description : 零钱兑换动态规划
 */
public class CoinChange {
        public int coinChange(int[] coins, int amount) {
            int n = coins.length;
            int[][] f = new int[n + 1][amount + 1];
            Arrays.fill(f[0], Integer.MAX_VALUE / 2); // 除 2 防止下面 + 1 溢出
            f[0][0] = 0;
            for (int i = 0; i < n; i++) {
                for (int c = 0; c <= amount; c++) {
                    if (c < coins[i]) f[i + 1][c] = f[i][c];
                    else f[i + 1][c] = Math.min(f[i][c], f[i + 1][c - coins[i]] + 1);
                }
            }
            int ans = f[n][amount];
            return ans < Integer.MAX_VALUE / 2 ? ans : -1;
        }
    }
