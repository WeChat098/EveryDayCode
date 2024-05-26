public class longestOnes {
    /**
     * 最长1的连续子序列 给定一个数字k，可以将0转换成1 最多k次，问最多有多少个连续的1
     *
     * 解决思路：同样使用左右指针 循环通过一次进行遍历 内部使用while进行左指针的相加
     *
     * 重点：for循环在消耗k资源  while循环用来补充k资源 只要当前的状态还不满足，就让while继续运行，left指针继续向右走
     * @param nums
     * @param k
     * @return
     */
    public int longestOnes(int[] nums, int k) {
        int ans = 0, left = 0, cnt0 = 0;
        for (int right = 0; right < nums.length; right++) {
            cnt0 += 1 - nums[right]; // 0 变成 1，用来统计 cnt0
            while (cnt0 > k) {
                cnt0 -= 1 - nums[left++];
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        longestOnes lo = new longestOnes();
        lo.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);
    }
}
