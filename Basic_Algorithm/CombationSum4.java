import java.util.HashMap;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/4 21:06
 * @Version : V1.2
 * @Description : 组合总和4
 */
public class CombationSum4 {
    class Solution {
        int nums[];
        HashMap<Integer,Integer> map = new HashMap<>();
        public int combinationSum4(int[] nums, int target) {
            this.nums = nums;
            return dfs(target);
        }
        public int dfs(int target){
            if (target < 0){
                return 0;
            }
            if (target == 0){
                return 1;
            }
            if (map.containsKey(target)){
                return map.get(target);
            }
            int res = 0;
            for (Integer x: nums){
                int temp = dfs(target - x);
                res += temp;
            }
            map.put(target,res);
            return res;
        }
    }
    // 上面我们需要注意的就是使用记忆化的时候，当前的res结果是基于之前的结果，所以结果是需要加上之前的结果，在最后加入到map中

    class Solution2 {
        public int combinationSum4(int[] nums, int target) {
            int[] f = new int[target + 1];
            f[0] = 1;
            for (int i = 1; i <= target; i++) {
                for (int x : nums) {
                    if (x <= i) {
                        f[i] += f[i - x];
                    }
                }
            }
            return f[target];
        }
    }


}
