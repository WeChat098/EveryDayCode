import java.util.Arrays;
import java.util.List;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/6 23:54
 * @Version : V1.2
 * @Description : 和为目标值的最长子序列的长度
 */
public class LengthOfLongestSubsequence {
        List<Integer> nums;
        int memo[][];
        public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
            this.nums = nums;
            memo = new int[nums.size() + 1][target + 1];
            for (int i = 0;i < memo.length;i++){
                Arrays.fill(memo[i],-1);
            }
            int res = dfs(nums.size() -1 ,target);
            return res < 0 ? -1 : res;
        }
        public int dfs(int index,int target){
            if (index < 0){
// 现在需要找的是最大值
                return target == 0?0:Integer.MIN_VALUE / 2;
            }
            if (target < 0){
                return Integer.MIN_VALUE / 2;
            }
            if (memo[index][target] != -1){
                return memo[index][target];
            }
            int x = Math.max(dfs(index - 1,target - nums.get(index)) + 1,dfs(index - 1,target));
            memo[index][target] = x;
            return x;
        }
    }
