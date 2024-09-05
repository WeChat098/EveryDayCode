package Meituan.ByteDance;

import java.util.Scanner;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/9/1 19:25
 * @Version : V1.2
 * @Description : one
 */
public class one_ze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int [n];
        for (int i = 0;i < n;i++){
            nums[i] = input.nextInt();
        }
        int [] leftMax = new int [n];
        int [] leftMin = new int [n];
        int [] rightMax = new int [n];
        int [] rightMin = new int [n];
        leftMax[0] = nums[0];
        leftMin[0] = nums[0];
        for (int i = 1; i < n;i++){
            leftMax[i] = Math.max(leftMax[i - 1],nums[i]);
            leftMin[i] = Math.min(leftMin[i - 1],nums[i]);
        }
        rightMax[n - 1] = nums[n - 1];
        rightMin[n - 1] = nums[n - 1];
        for (int i = n - 2;i >= 0;i--){
            rightMax[i] = Math.max(rightMax[i + 1],nums[i]);
            rightMin[i] = Math.min(rightMin[i + 1],nums[i]);
        }
        int minToDiff = Integer.MAX_VALUE;
        for (int i = 0;i < n - 1;i++){
            int leftDiff = leftMax[i] - leftMin[i];
            int rightDiff = rightMax[i] - rightMin[i];
            int totalDiff = Math.abs(leftDiff - rightDiff);
            if (totalDiff < minToDiff) {
                minToDiff = totalDiff;
            }
        }
        System.out.println(minToDiff);
    }
}
