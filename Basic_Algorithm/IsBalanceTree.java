//public class IsBalanceTree {
/**
 * 判断是否是平衡二叉树
 * 首先判断左子树是不是平衡二叉树 之后判断右子树是否是平衡二叉树
 * 如果左右两棵子树都是平衡二叉树 那么这时候判断以root为根的树是否是平衡二叉树
 */

//    private int getHeight(TreeNode node) {
//        if (node == null) return 0;
//        int leftH = getHeight(node.left);
//        if (leftH == -1) return -1; // 提前退出，不再递归
//        int rightH = getHeight(node.right);
//        if (rightH == -1 || Math.abs(leftH - rightH) > 1) return -1;
//        return Math.max(leftH, rightH) + 1;
//    }
//
//    public boolean isBalanced(TreeNode root) {
//        return getHeight(root) != -1;
//    }
//}
