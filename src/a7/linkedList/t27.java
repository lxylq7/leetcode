package a7.linkedList;

public class t27 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(-1);
        ListNode prev = h;
        ListNode head = prev;
        int count = 0;
        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                sum += l2.val;
            } else if (l2 == null) {
                sum += l1.val;
            } else {
                sum += l1.val + l2.val;
            }
            count = 0;
            if (sum >= 10) {
                sum %= 10;
                count = 1;
            }
            ListNode node = new ListNode();
            node.val = sum;
            node.next = null;
            prev.next = node;
            prev = node;
            if (l1 == null) {
                l2 = l2.next;
            } else if (l2 == null) {
                l1 = l1.next;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if (count != 0) {
            ListNode node = new ListNode();
            node.val = 1;
            node.next = null;
            prev.next = node;
        }
        return head.next;
    }
}
