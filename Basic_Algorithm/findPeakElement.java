public class findPeakElement {
    /**
     * 寻找峰值元素 峰值元素的左右两边都是严格小于峰值元素，找到其中任意一个峰值元素
     * @param nums
     * @return
     */

    public int findPeakElement(int[] nums) {
        int left = -1, right = nums.length - 1;
        int temp = binarySearch(nums,left,right);
        System.out.println(temp);
        return temp;
    }
    public int binarySearch(int[] nums,int left,int right){
        while(left + 1 < right){
            int mid = (left + right) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid;
            }else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        findPeakElement f = new findPeakElement();
        f.findPeakElement(new int[]{1,2,1,3,5,6,4});
    }
}
