public class MinSubArrayLen {
    /**
     * 长度最小的字数组 找到满足连续一段数组长度大于等于target的最小长度
     * 使用滑动窗口，左右指针进行判断 如果当前值一直小于target右指针一直向右移动 否则让左指针向右边移动
     * @param target
     * @param nums
     * @return
     */

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0, right = 0;
        int temp = nums[left];
        if(temp >= target){
            return 1;
        }
        for(int i = 0;i < nums.length * 2;i++){
            if(left == right){
                temp = nums[left];
            }
            if(temp >= target){
                minLen = Math.min(minLen,right - left + 1);
                temp -= nums[left];
                left++;
            }else{
                if(right + 1 < nums.length){
                    temp += nums[++right];
                }
            }
        }
        if(minLen == Integer.MAX_VALUE){
            minLen = 0;
        }
        return minLen;
    }

    public static void main(String[] args) {
        minSubArrayLen(11,new int[]{1,2,3,4,5});
    }
}
