package Meituan.ByteDance;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/9/1 19:49
 * @Version : V1.2
 * @Description : two
 */
public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p[]= new int[n + 1];
        for (int i = 1;i <= n;i++){
            p[i] = input.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int count = 0;
        for (int i = 1;i <= n;i++){
            int key = p[i] - i;
            if (map.containsKey(key)) {
                ArrayList<Integer> temp = map.get(key);
                temp.add(i);
                map.put(key,temp);
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(key,list);
            }
        }
//        for (Map.Entry<Integer,ArrayList<Integer>> entry :map.entrySet()){
//            System.out.println(entry.getKey() +" "+entry.getValue());
//        }
            for (int j = 1;j <= n;j++) {
            int key = j - p[j];
            if (map.containsKey(key)){
                ArrayList<Integer> list = map.get(key);
                for (int x:list){
                    if (j > x){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
