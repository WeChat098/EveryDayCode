//public class zigzagLevelOrder {

/**
 * 二叉树的锯齿形遍历
 *
 * 还是和其他层序遍历方式一样正常遍历 只有出现是偶数层的时候将得到的结果进行反转就行
 */

//        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//            if (root == null) return List.of();
//            List<List<Integer>> ans = new ArrayList<>(); // ans是结果链表
//            Queue<TreeNode> q = new ArrayDeque<>();// q是初始化一个双端队列
//            q.add(root);
//            while (!q.isEmpty()) {
//                int n = q.size();
//                List<Integer> vals = new ArrayList<>(n); // 容量已知 每次临时记录当前节点值的链表
//                while (n-- > 0) {
//                    TreeNode node = q.poll();
//                    vals.add(node.val);
//                    if (node.left != null)  q.add(node.left);
//                    if (node.right != null) q.add(node.right);
//                }
//                if (ans.size() % 2 > 0) Collections.reverse(vals);
//                ans.add(vals);
//            }
//            return ans;
//        }
//}
