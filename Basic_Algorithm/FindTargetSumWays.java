import java.util.Arrays;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/6 23:51
 * @Version : V1.2
 * @Description : 动态规划目标和
 */
public class FindTargetSumWays {

    private int[] nums;
    private int[][] memo;

    public int findTargetSumWays(int[] nums, int target) {
        int s = 0;
        for (int x : nums) {
            s += x;
        }
        s -= Math.abs(target);
        if (s < 0 || s % 2 == 1) {
            return 0;
        }
        int m = s / 2; // 背包容量

        this.nums = nums;
        int n = nums.length;
        memo = new int[n][m + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1); // -1 表示没有计算过
        }
        return dfs(n - 1, m);
    }

    private int dfs(int i, int c) {
        if (i < 0) {
            return c == 0 ? 1 : 0;
        }
        if (memo[i][c] != -1) { // 之前计算过
            return memo[i][c];
        }
        if (c < nums[i]) {
            return memo[i][c] = dfs(i - 1, c); // 只能不选
        }
        return memo[i][c] = dfs(i - 1, c) + dfs(i - 1, c - nums[i]); // 不选 + 选
    }
}
