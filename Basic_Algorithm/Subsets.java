import java.util.LinkedList;
import java.util.List;

/**
 * 子集型回溯
 * 方法一： 判断当前这个位置选择或者不选
 */
public class Subsets {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
//        dfs(0,nums,new LinkedList<>());
        System.out.println(res);
        return res;
    }
//    public void dfs(int i){
//        if (i == nums.length){
//            return;
//        }
//        for (int i = 0;i )
//    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        subsets.subsets(new int[]{1,2,3});
    }
}
