//public class RemoveNthNode {

/**
 * 删除倒数第n个节点
 * 初始化一个快慢指针，首先让快指针走n次 之后快慢指针一起走，当快指针的下一个节点等于null的时候，现在left指针的下一个节点就是需要删除的节点了
 */
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0,head);
//        ListNode left = dummy,right = dummy;
//        while (n-- > 0){
//            right = right.next; // 这里是由于题目保证链表中至少会存在n个节点
//        }
//        while (right.next != null){
//            right = right.next;
//            left = left.next;
//        }
//        left.next = left.next.next;
//        return dummy.next;
//    }
//}
