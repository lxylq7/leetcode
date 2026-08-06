package a7.linkedList;

import java.util.List;
//K个一组反转链表
public class t30 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if ( k <= 1) {
            return head;
        }
        ListNode d = new ListNode(0, head);
        ListNode pre = d;
        loop:
        while (true) {
            ListNode f = pre;
            for (int i = 0; i < k; i++) {
                f = f.next;
                if (f == null) {
                    break loop;
                }
            }
            //参数
            ListNode h = pre.next; //本组头
            ListNode nh = f.next; //下一组头
            pre.next = reverse(h,nh);
            pre = h;
        }
        return d.next;
    }
    private ListNode reverse(ListNode head, ListNode tail)  {
        ListNode pre = tail;
        ListNode cur = head;
        while (cur != tail) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
