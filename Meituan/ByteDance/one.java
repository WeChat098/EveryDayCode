package Meituan.ByteDance;

import java.util.Scanner;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/9/1 19:07
 * @Version : V1.2
 * @Description : one
 */
public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int [n];
        int preMin[] = new int[n];
        int preMax[] = new int[n];
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0;i < n;i++) {
            nums[i] = input.nextInt();
            preMin[i] = Math.min(nums[i],min);
            min = preMin[i];
            preMax[i] = Math.max(nums[i],max);
            max = preMax[i];
        }
        int sufMax[] = new int [n],sufMin[] = new int[n];
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        sufMax[n - 1] = nums[n - 1];
        sufMin[n - 1] = nums[n - 1];
        for (int i = n - 2;i >= 0;i--){
            sufMax[i] = Math.max(nums[i + 1],max);
            max = sufMax[i];
            sufMin[i] = Math.min(nums[i + 1],min);
            min = sufMin[i];
        }
        int curMin = Integer.MAX_VALUE;
        for (int i = 0;i < n;i++){
            int curLeftMax = preMax[i];
            int curLeftMin = preMin[i];
            int curRightMax = sufMax[i];
            int curRightMin= sufMin[i];
            curMin = Math.min(curMin,Math.abs((curLeftMax - curLeftMin) - (curRightMax- curRightMin)));
        }
        System.out.println(curMin);
//        for (int i = 0; i< n;i++){
//            System.out.print(nums[i]+" ");
//            System.out.print(sufMax[i]+" ");
//            System.out.print(sufMin[i]+" ");
//            System.out.println();
//        }
    }
}
