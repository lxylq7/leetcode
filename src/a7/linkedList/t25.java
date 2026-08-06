package a7.linkedList;

//环形链表 t25
public class t25 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        if (p == null || p.next == null) {
            return false;
        }
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
