import java.util.Arrays;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/9 0:41
 * @Version : V1.2
 * @Description : 编辑距离
 */
public class MinDistance {
    char cha1[],cha2[];
    int memo[][];
    public int minDistance(String word1, String word2) {
        cha1 = word1.toCharArray();
        cha2 = word2.toCharArray();
        memo = new int[cha1.length + 1][cha2.length + 1];
        for (int i = 0;i < memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return dfs(word1.length() - 1,word2.length() - 1);
    }
    public int dfs(int x,int y){
        if (x < 0) return y + 1;
        if (y < 0) return x + 1;// 这两行代码的作用是如果当前一个字符串代码为空，那么对于需要堆另外一个字符串进行删除 这个字符串长度次操作。
        if (memo[x][y] != -1){
            return memo[x][y];
        }
        if (cha1[x] == cha2[y]){
            return memo[x][y] = dfs(x - 1,y - 1);
        }else{
            return memo[x][y] = Math.min(Math.min(dfs(x,y - 1),dfs(x - 1,y)),dfs(x - 1,y - 1)) + 1; //分别表示插入 替换 和删除操作；
        }
    }
}

