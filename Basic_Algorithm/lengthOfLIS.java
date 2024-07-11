import java.util.Arrays;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/9 16:58
 * @Version : V1.2
 * @Description : 最长上升子序列
 */
public class lengthOfLIS {
    int nums[];
    int memo[][];
    public int lengthOfLIS(int[] nums) {
        this.nums = nums;
        memo = new int [nums.length + 1][nums.length + 2];
        for (int i = 0;i < nums.length + 1;i++){
            Arrays.fill(memo[i],Integer.MIN_VALUE);
        }
        return dfs(nums.length - 1,nums.length);
    }
    public int dfs(int index,int pre){
        if (index < 0){
            return 0;
        }
        if (memo[index][pre] != Integer.MIN_VALUE){
            return memo[index][pre];
        }
        if (pre == nums.length || nums[index] < nums[pre]){
            return memo[index][pre] = Math.max(dfs(index - 1,index) + 1,dfs(index - 1,pre));
        }
        return memo[index][pre] = dfs(index - 1,pre);
    }
}
