package hot100.linkedList;

// 删除链表的倒数第N个节点 t28
public class t28 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        dummy.next = head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
        }
        //slow 就是倒数第n个 pre是他的前驱
        pre.next = slow.next;
        return dummy.next;
    }
}
