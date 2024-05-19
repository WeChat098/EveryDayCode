public class CatchRainWater {
    /**
     * 接雨水
     *
     * 计算两个前缀数组，分别是前缀的最大值 和后缀的最大值
     * 当前这个位置能接多少水，是由当前位置左边的最大值和右边的最大值
     * 中的较小值决定的，因为左边的最大值和右边的最大值中较小的那个值
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int len = height.length;
        if(len <= 2){
            return 0;
        }
        int prefix[] = new int[len];
        int suffix[] = new int[len];
        prefix[0] = height[0];
        int max = prefix[0];
        for(int i = 1;i < len;i++){
            if(height[i] >= max){
                max = height[i];
            }
            prefix[i] = max;
        }
        suffix[len - 1] = height[len - 1];
        max = suffix[len - 1];
        for(int i = len - 2;i >= 0;i--){
            if(height[i] >= max){
                max = height[i];
            }
            suffix[i] = max;
        }
        int res = 0;
        for(int i = 0;i < len;i++){
            int min = Math.min(prefix[i],suffix[i]);
            res += (min - height[i]);
        }
        return res;
    }
}
