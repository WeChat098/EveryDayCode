//public class isVaildBST {
/**
 * 判断是否是二叉搜索树 判断是否是一个二叉搜索树 给定一个节点，我们只需要知道其中一个范围 然后依次判断所有的范围是否满足 如果有一个不满足，直接就退出
 */

//    public boolean isValidBST(TreeNode root) {
//        if (root == null){
//            return true;
//        }
//        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
//    }
//    public boolean dfs(TreeNode root,long left,long right){
//        if (root == null){
//            return true;
//        }
//        long cur = root.val;
//        return left < cur && cur < right && dfs(root.left,left,cur) && dfs(root.right,cur,right);
//    }
//}
