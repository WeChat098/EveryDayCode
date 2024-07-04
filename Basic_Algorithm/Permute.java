import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/4 15:17
 * @Version : V1.2
 * @Description : 全排列
 */
public class Permute {
    int shu[] = {1,2,3};
    boolean flag[] = new boolean[3];
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public static void main(String[] args) {
        Permute permute = new Permute();
        permute.dfs(0);
    }
    public void dfs(int i){
        if (i == shu.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int j = 0; j <  shu.length;j++){
            if (!flag[j]){
                temp.add(shu[j]);
                flag[j] = true;
                dfs(i + 1);
                flag[j] = false;
            }
        }
    }
}
