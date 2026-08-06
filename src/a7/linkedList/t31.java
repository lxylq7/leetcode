package a7.linkedList;


public class t31 {
    public Node copyRandomList(Node head) {
        //复制每个节点 把新节点直接插到原节点的后面
        for (Node cur = head;cur != null;cur = cur.next.next) {
            cur.next = new Node(cur.val,cur.next,null);
        }
        //遍历交错链表中的原链表节点
        for (Node cur = head;cur != null;cur = cur.next.next) {
            if (cur.random != null) {
                //要复制的 random 是cur.random的下一个节点
                cur.next.random = cur.random.next;
            }
        }
        //把交错链表分离成两个链表
        Node dummy = new Node(0);
        Node tail = dummy;
        Node cur = head;
        while (cur != null) {
            Node copy = cur.next; //新节点
            tail.next = copy; //新节点插在tail后面
            cur.next = copy.next; //原节点修复
            cur = cur.next;
            tail = tail.next;
        }
        return dummy.next;
    }
}
