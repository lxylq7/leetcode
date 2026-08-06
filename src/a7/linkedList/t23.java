package a7.linkedList;

// t23 反转链表9
public class t23 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nxt = cur.next; //保存下一个节点
            cur.next = pre; //反转指针
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
