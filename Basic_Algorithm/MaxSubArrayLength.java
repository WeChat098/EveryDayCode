import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口 集合最多出现k次的子数组长度
 */

public class MaxSubArrayLength {
        public int maxSubarrayLength(int[] nums, int k) {
            int ans = 0, left = 0;
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int right = 0; right < nums.length; right++) {
                cnt.merge(nums[right], 1, Integer::sum);
                while (cnt.get(nums[right]) > k) {
                    cnt.merge(nums[left++], -1, Integer::sum);
                }
                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    public static void main(String[] args) {
        MaxSubArrayLength maxSubArrayLength = new MaxSubArrayLength();
        maxSubArrayLength.maxSubarrayLength(new int[]{3,1,1}, 1);
    }
}
