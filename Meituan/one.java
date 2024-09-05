package Meituan;

import java.util.Scanner;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/8/31 19:36
 * @Version : V1.2
 * @Description : meita
 */
public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;
        String string = input.nextLine();
        String name[] = string.split(" ");
        for (String x: name){
            if (x.equals("")){
                continue;
            }
            if ((int)x.charAt(0) < 91){
                res++;
            }

        }
        System.out.println(res);
    }
//public static void main(String[] args) {
//    String a = "ABC";
//    System.out.println((int)a.charAt(0));
//}
}
