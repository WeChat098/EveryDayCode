public class reverseList {
    // 反转链表
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null,cur = head; // 需要三个指针 分别是当前指针指向的 前一个指针指向的 下一个指针指向的
        while (cur != null){ // 四行代码
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        // 最后 cur 指向的是null 因为之后cur指向null了之后，才会跳出while循环 所以最后pre指向的是最后一个节点
        return pre;
    }
}
