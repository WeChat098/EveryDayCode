public class MaxArea {

    /**
     * 接水最多的容器
     * 同样是使用双指针的思路 从左右两边向中间靠拢
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int width = height.length - 1;
        int left = 0, right = height.length - 1;
        int res = 0;
        for(int i = 0;i < height.length;i++){
            int minHeight = Math.min(height[left],height[right]);
            res = Math.max(res,width * Math.min(height[left],height[right]));
            if(height[left] >= height[right]){
                right--;
            }else{
                left++;
            }
            width--;
        }
        return res;
    }
}
