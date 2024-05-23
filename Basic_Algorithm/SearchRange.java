/**
 * 二分查找  在区间内找到值是target的开始端点和结束端点 如果都不存在就返回 -1 -1
 *  判断右端点的时候 是通过使用找target + 1 的位置 的 上一个位置
 *  binary_serach的目的是找到一个值是target的开始位置
 */

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums,0,nums.length - 1,target);
        if(start == nums.length || nums[start] != target){
            return new int[] {-1,-1};
        }
        int end = binarySearch(nums,0,nums.length - 1,target + 1) - 1;
        return new int[]{start,end};
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

    public static void main(String[] args) {
        SearchRange searchRange = new SearchRange();
        searchRange.searchRange(new int[]{1},1);
    }

}
