/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/6 23:55
 * @Version : V1.2
 * @Description : 分割等和子集
 */
public class CanPartition {
        int nums[];
        int memo [][];
        public boolean canPartition(int[] nums) {
            this.nums = nums;
            int sum = 0;
            for (int x:nums){
                sum += x;
            }
            if (sum % 2 != 0){
                return false;
            }
            memo = new int[nums.length + 1][sum / 2 + 1];
            return dfs(nums.length - 1,sum / 2) == 1 ? true : false;
        }
        public int dfs(int index,int count){ // 0 表示初始值 1 表示 true -1 表示 false
            if (index < 0){
                return count == 0 ? 1:-1;
            }
            if (count < 0){
                return -1;
            }
            if (memo[index][count] != 0){
                return memo[index][count] == 1 ? 1 : -1;
            }
            int a = dfs(index - 1,count - nums[index]);
            int b = dfs(index - 1,count);
            memo[index][count] = (a == 1 || b == 1) ? 1 : -1;
            return memo[index][count];
        }
    }
