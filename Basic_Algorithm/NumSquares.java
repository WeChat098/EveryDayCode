import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/6 23:56
 * @Version : V1.2
 * @Description : 完全平方数 动态规划
 */
public class NumSquares {
        List<Integer> list = new ArrayList<>();
        int memo[][];
        public int numSquares(int n) {
            for (int i = 1; i <= n; i++){
                if (i * i <= n){
                    list.add(i * i);
                }else {
                    break;
                }
            }
            memo = new int[list.size() + 1][n + 1];
            return dfs(list.size() - 1,n) - 1;
        }
        public int dfs(int index,int count){
            if (index < 0){
                return count == 0 ? 1 : Integer.MAX_VALUE / 2;
            }
            if (count < 0){
                return  Integer.MAX_VALUE / 2;
            }
            if (memo[index][count] != 0){
                return memo[index][count];
            }
            memo[index][count] = Math.min(dfs(index,count - list.get(index)) + 1,dfs(index - 1,count));
            return memo[index][count];
        }
    }
