//public class findBottomLeftValue {
/**
 * 找到二叉树中最左下角的节点 返回这个的值
 *
 * 可以使用层序遍历每一层的节点 之后如果当前节点是第一个就记录下来
 *
 * 同样也可以使用前序遍历 到当前这个深度的时候 如果还没有出现节点值 就更新节点值
 */


//    public int findBottomLeftValue(TreeNode root) {
//        int a = 0;
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//        while (queue.size() > 0){
//            int size = queue.size();
//            for (int i = 0;i < size;i++){
//                TreeNode tempNode = queue.poll();
//                if (i == 0){
//                    a = tempNode.val;
//                }
//                if (tempNode.left != null) queue.add(tempNode.left);
//                if (tempNode.right != null) queue.add(tempNode.right);
//            }
//        }
//        return a;
//    }
//}
