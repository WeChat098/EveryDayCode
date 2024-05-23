import java.util.Arrays;

/**
 * 给你两个正整数数组 spells 和 potions ，长度分别为 n 和 m ，其中 spells[i] 表示第 i 个咒语的能量强度，potions[j] 表示第 j 瓶药水的能量强度。
 *
 * 同时给你一个整数 success 。一个咒语和药水的能量强度 相乘 如果 大于等于 success ，那么它们视为一对 成功 的组合。
 *
 * 请你返回一个长度为 n 的整数数组 pairs，其中 pairs[i] 是能跟第 i 个咒语成功组合的 药水 数目。
 *
 * 同样使用二分查找
 */

public class SuccessfullPairs {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int res[] = new int [spells.length];
        for(int i = 0;i < spells.length;i++){
            int left = 0, right = potions.length - 1;
            long target = (long)Math.ceil((double) success / (double)spells[i]);
            System.out.println(target);
            int temp = binarySearch(potions,left,right,target);
            System.out.println(temp+"  temp");
            if(temp >= potions.length){
                res[i] = 0;
            }else{
                res[i] = potions.length - temp;
            }

        }
        return res;
    }
    public static int binarySearch(int[] nums, int left, int right, long target){
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
        successfulPairs(new int[]{5,1,3},new int[]{1,2,3,4,5},7);
    }
}
