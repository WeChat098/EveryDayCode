public class MaximunCount {
    /**
     * 数组非递减排序 计算当前数组中 正数数量和负数数量的最大值
     * 使用二分查找
     *
     * 两个位置都是使用闭区间
     * @param nums
     * @return
     */
    public int maximumCount(int[] nums) {
        int start = binarySearch(nums,0,nums.length - 1,0) - 1;
        int end = binarySearch(nums,0,nums.length - 1,1);
        System.out.println(start +" "+ end);
        int res = Math.max(start + 1, nums.length - end);
        return res;
    }
    public int binarySearch(int[] nums,int left,int right,int target){
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
