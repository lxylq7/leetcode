package hot100.linkedList;
//两两交换链表中的节点
public class t29 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        ListNode pre = new ListNode(0, head);
        ListNode d = pre;
        while (p != null && q != null) {
            p.next = q.next;
            q.next = p;
            d.next = q;
            d = p;
            p = p.next;
            if (p == null) {
                break;
            }
            q = p.next;
        }
        return pre.next;
    }
}
