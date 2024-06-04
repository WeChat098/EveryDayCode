//public class RightSideView {
/**
 * 找到当前这棵树的右视图
 * 设置一个全局变量 list 计算当前这一层的高度，如果当前这一层的高度大于list.size() 说明当前这一层暂时还没有添加右视图
 * 每一次都是先访问一个节点的右子树，之后访问左子树 保证先看到右节点
 */
//    List<Integer> res = new LinkedList<>();
//    public List<Integer> rightSideView(TreeNode root) {
//        if(root == null) return res;
//        dfs(root,1);
//        return res;
//    }
//    public void dfs(TreeNode root,int height){
//        if(root == null){
//            return;
//        }
//        if(height > res.size()){
//            res.add(root.val);
//        }
//        dfs(root.right,height + 1);
//        dfs(root.left,height + 1);
//        return;
//    }
//}
