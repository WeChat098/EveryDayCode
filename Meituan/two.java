package Meituan;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/8/31 20:10
 * @Version : V1.2
 * @Description : sadfasd
 */
public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int shu[] = new int [n];
        for (int i = 0;i < n;i++){
            shu[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 1;i < k;i++){
            HashSet<Integer> set = new HashSet<>();
            for (int j : shu){
                for (int t = j;t < j + i;t++){
                    set.add(t);
                }
            }
            if (set.size() >= k) {
                System.out.println(i);
                return;
            }
        }
    }
}
