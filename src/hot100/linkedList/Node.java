package hot100.linkedList;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node() {
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    /**
     * 获取
     * @return val
     */
    public int getVal() {
        return val;
    }

    /**
     * 设置
     * @param val
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * 获取
     * @return next
     */
    public Node getNext() {
        return next;
    }

    /**
     * 设置
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * 获取
     * @return random
     */
    public Node getRandom() {
        return random;
    }

    /**
     * 设置
     * @param random
     */
    public void setRandom(Node random) {
        this.random = random;
    }

    public String toString() {
        return "Node{val = " + val + ", next = " + next + ", random = " + random + "}";
    }
}
