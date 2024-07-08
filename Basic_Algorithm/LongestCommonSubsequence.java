import java.util.Arrays;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/9 0:42
 * @Version : V1.2
 * @Description : 最长公共子序列
 */
public class LongestCommonSubsequence {
    char cha1[],cha2[];
    int memo[][];
    public int longestCommonSubsequence(String text1, String text2) {
        cha1 = text1.toCharArray();
        cha2 = text2.toCharArray();
        memo = new int[cha1.length + 1][cha2.length + 1];
        for (int i = 0;i < memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return dfs(cha1.length - 1,cha2.length - 1);
    }
    public int dfs(int x,int y){
        if (x < 0 || y < 0){
            return 0;
        }
        if (memo[x][y] != -1){
            return memo[x][y];
        }
        if (cha1[x] == cha2[y]){
            //两者相等的时候
            return memo[x][y] = dfs(x - 1, y - 1) + 1;
        } else {
            return memo[x][y] = Math.max(dfs(x - 1,y),dfs(x,y - 1));
        }
    }
}
