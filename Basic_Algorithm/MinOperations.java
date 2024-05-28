public class MinOperations {
    public int minOperations(int[] nums, int x) {
        int left = 0, right = nums.length - 1,minOp = 0,temp = 0;
        while (left <= right){
            if(x == 0){
                return minOp;
            }
            if (nums[left] <= x || nums[right] <= x){
                if (nums[left] >= nums[right] && nums[left] <= x){
                    x -= nums[left];
                    left++;
                    minOp++;
                } else if(nums[left] <= nums[right] && nums[right] <= x){
                    x -= nums[right];
                    right--;
                    minOp++;
                }else if(nums[left] >= nums[right] && nums[right] <= x){
                    x -= nums[right];
                    right--;
                    minOp++;
                }else if(nums[left] <= nums[right] && nums[left] >= x){

                }
            }else{
                if(x != 0){
                    return -1;
                }
            }
        }
        return minOp;
    }

    public static void main(String[] args) {
        MinOperations minOperations = new MinOperations();
        minOperations.minOperations(new int[]{3,2,20,1,1,3},10);
    }

}
