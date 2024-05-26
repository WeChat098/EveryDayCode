public class countSubarrays {

    /**
     * 给你一个整数数组 nums 和一个 正整数 k 。
     *
     * 请你统计有多少满足 「 nums 中的 最大 元素」至少出现 k 次的子数组，并返回满足这一条件的子数组的数目。
     *
     * 子数组是数组中的一个连续元素序列
     *
     *
     * 思路： 同样使用左右指针 右指针有
     * @param nums
     * @param k
     * @return
     */
    public long countSubarrays(int[] nums, int k) {
        int left = 0, right = 0,cnt_max = 0,max = 0;
        long res = 0;
        for(int i = 0;i < nums.length;i++){
            max = Math.max(nums[i],max);
        }
        for (right = 0;right < nums.length;right++){
            if(nums[right] == max){
                cnt_max++;
            }
            while(cnt_max >=k){
                res += nums.length - right;
                if(nums[left++] == max){
                    cnt_max--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        countSubarrays cs = new countSubarrays();
        cs.countSubarrays(new int[]{1,4,2,1},3);
    }
}
