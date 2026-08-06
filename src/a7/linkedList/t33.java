package a7.linkedList;

import java.util.List;

public class t33 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists,0,lists.length);
    }
    private ListNode merge(ListNode[] lists,int left,int right) {
        if (right - left == 1) {
            return lists[left];
        }
        int mid = (left + right) / 2;
        ListNode l = merge(lists, left, mid);
        ListNode r = merge(lists, mid, right);
        return mergeList(l,r);
    }

    private ListNode mergeList(ListNode head1,ListNode head2) {
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
}
