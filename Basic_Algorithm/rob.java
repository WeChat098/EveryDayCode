import java.util.HashMap;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/4 16:09
 * @Version : V1.2
 * @Description : 打家劫舍
 */
public class rob {
    class Solution {
        private int nums[];
        public int rob(int[] nums) {
            this.nums = nums;
            return dfs(nums.length - 1);
        }
        public int dfs(int i){
            if (i < 0){
                return 0;
            }
            int res = Math.max(dfs(i - 1), dfs(i - 2) + nums[i]);
            return res;
        }
    }


    class Solution1 {
        private int nums[];
        HashMap<Integer,Integer> hashmap = new HashMap<>(); // 记忆化数组
        public int rob(int[] nums) {
            this.nums = nums;
            return dfs(nums.length - 1);
        }
        public int dfs(int i){
            if (i < 0){
                return 0;
            }
            if (hashmap.containsKey(i)){ // 如果当前这个位置之前已经算过，直接去记忆化数组中拿
                return hashmap.get(i);
            }
            int res = Math.max(dfs(i - 1), dfs(i - 2) + nums[i]);
            hashmap.put(i,res); // 每次计算一个结果 就将当前的结果存入到记忆化数组中
            return res;
        }
    }

    class Solution2 {
        int nums[];
        private int res[];
        public int rob(int[] nums) {
            this.nums = nums;
            res = new int[nums.length + 2];
            res[0] = 0;
            res[1] = 0;
            for (int i = 2;i < res.length;i++){
                res[i] = Math.max(res[i - 1],res[i - 2] + nums[i - 2]);
            }
            return res[res.length - 1];
        }
    }


}
