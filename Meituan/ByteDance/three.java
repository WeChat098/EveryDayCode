package Meituan.ByteDance;

import java.util.Scanner;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/9/1 20:43
 * @Version : V1.2
 * @Description : three
 */
public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];
        for (int i = 0;i < n;i++){
            nums[i] = input.nextInt();
        }
        int len = -1;
        for (int i = 0;i < n;i++){
            int cur = 0;
            boolean left = true;
            for (int j = 1;j < n;j++){
                if(nums[j] > nums[j - 1] && left) {
                    cur++;
                }else if (nums[j] > nums[j - 1] && !left ) {
                    cur++;
                }
            }
        }
    }
}
