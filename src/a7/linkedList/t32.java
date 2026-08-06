package a7.linkedList;
// 排序链表
public class t32 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        sortList(head);
        sortList(mid);
        return merge(head,mid);
    }
    private ListNode merge(ListNode head1,ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val >= head2.val) {
                pre.next = head2;
                head2 = head2.next;
            } else if (head1.val < head2.val) {
                pre.next = head1;
                head1 = head1.next;
            }
            pre = pre.next;
        }
        pre.next = head1 != null ? head1 : head2;
        return dummy.next;
    }
    private ListNode getMid(ListNode head) {
        ListNode pre = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return slow;
    }
}
