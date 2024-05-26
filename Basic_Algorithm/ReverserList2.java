

public class ReverserList2 {
    /**
     * 需要注意的点是 left指针的前一个节点需要和right指针相连接
     * @param head
     * @param left
     * @param right
     * @return
     */
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode dummy = new ListNode(0, head), p0 = dummy;
//        for (int i = 0; i < left - 1; ++i)
//            p0 = p0.next;
//
//        ListNode pre = null, cur = p0.next;
//        for (int i = 0; i < right - left + 1; ++i) {
//            ListNode nxt = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = nxt;
//        }
//        p0.next.next = cur;
//        p0.next = pre;
//        return dummy.next;
//    }
}
