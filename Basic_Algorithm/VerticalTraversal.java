
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 垂直遍历 同上是遍历一棵树 在遍历的时候将col加入到hashmap中，之后结果从hashmap中读取结果
 */
public class VerticalTraversal {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int cur = dfs(root, 0, 0);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            cur++;
            if (map.containsKey(cur)) {
                List<Integer> temp = map.get(cur).stream().sorted().toList(); // 升序排序
                res.add(temp);
            }
        }
        System.out.println(res);
        return res;
    }

    public int dfs(TreeNode root, int row, int col) {
        if (root == null) {
            return col;
        }
        if (!map.containsKey(col)) {
            ArrayList list = new ArrayList<>();
            list.add(root.val);
            map.put(col, list);
        } else {
            ArrayList<Integer> list = map.get(col);
            list.add(root.val);
            map.put(col, list);
        }

        int l = dfs(root.left, row + 1, col - 1);
        int r = dfs(root.right, row + 1, col + 1);
        return Math.min(l, r);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(TreeNode left,TreeNode right,int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

    }
}
