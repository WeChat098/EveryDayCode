///**

/**
 * 判断链表中是否有环存在
 * 同样使用快慢指针，初始化同样是初始化一个next指针是head指针的头节点
 * fast指针一次走两步，slow指针一次走一步
 * while循环同样需要判断当前节点的下一个节点是否是null 或者 下下一个节点是否是null
 * 之后在while中查看是否需要判断当前slow和fast是否是相等的。




// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if(head == null){
//            return false;
//        }
//        ListNode fast = new ListNode(0,head);
//        ListNode slow = new ListNode(0,head);
//
//        while(fast.next != null && fast.next.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                return true;
//            }
//        }
//        return false;
//    }
//}