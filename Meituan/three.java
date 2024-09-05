package Meituan;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/8/31 20:21
 * @Version : V1.2
 * @Description : three
 */
public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int shu[]= new int[n];
        for (int i = 0;i < n;i++){
            shu[i] = input.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        for (int i = 0;i < k;i++){
            int start = input.nextInt();
            int end = input.nextInt();
            for (int j = start - 1;j < end;j++){
                pq.add(shu[j]);
            }
            int minLeft = 0;
            int curmax = pq.peek();
            boolean one = false,two = false,three = false;
            for (int t = start - 2; t >= 0;t--) {
                minLeft++;
                if (shu[t] > curmax){
                    one = true;
                    break;
                } else if (shu[t] == curmax) {
                    two = true;
                }
            }
            int minRight = 0;
            boolean x = false,y = false,z =false;
            for (int t = end; t < shu.length;t++) {
                minRight++;
                if (shu[t] > curmax){
                    x = true;
                    break;
                } else if (shu[t] == curmax) {
                    y = true;
                }
            }
            if (one && x) {
                System.out.println("win");
                System.out.println(Math.min(minRight,minLeft) + (end - start));
            }else if (one && !x){
                System.out.println("win");
                System.out.println(minLeft + (end - start) + 1);
            } else if (!one && x) {
                System.out.println("win");
                System.out.println(minRight+ (end - start) + 1);
            } else if (two && !y) {
                System.out.println("draw");
                System.out.println(minLeft+ (end - start) + 1);
            } else if (!two && y) {
                System.out.println("draw");
                System.out.println(minRight+ (end - start) + 1);
            }else {
                System.out.println("lose");
                System.out.println((end - start) + 2);
            }
        }
    }
}
