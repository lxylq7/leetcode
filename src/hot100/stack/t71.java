package hot100.stack;

public class t71 {
    public String decodeString(String s) {
        return d(s.toCharArray());
    }
    private int i = 0;
    private String d(char[] s) {
        StringBuilder res = new StringBuilder();
        int k = 0;
        while (i < s.length) {
            char c = s[i];
            i++;
            if (Character.isLetter(c)) {
                res.append(c);
            } else if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                String t = d(s);
                for (int j = 0; j < k; j++) {
                    res.append(t);
                }
                k = 0;
            } else if (c == ']') {
                break;
            }
        }
        return res.toString();
    }
}
