package hot100.graph;

public class t54 {
    private static class Node {
        Node[] son = new Node[26];
        boolean end = false;
    }
    private final Node root = new Node();
    public t54() {

    }

    public void insert(String word) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            c -= 'a';
            if (cur.son[c] == null) {
                cur.son[c] = new Node();
            }
            cur = cur.son[c];
        }
        cur.end = true;
    }

    public boolean search(String word) {
        return find(word) == 1;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) == 2;
    }
    public int find(String word) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            c -= 'a';
            if (cur.son[c] == null) {
                return 0;
            }
            cur = cur.son[c];
        }
        return cur.end ? 1 : 2;
    }
}
