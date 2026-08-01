package a1.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 字母异位词分组
public class t2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            List<String> strings = hashMap.getOrDefault(s,new ArrayList<>());
            strings.add(str);
            hashMap.put(s,strings);
        }
        return new ArrayList<>(hashMap.values());
    }
}
