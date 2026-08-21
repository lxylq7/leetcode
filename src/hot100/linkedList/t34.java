package hot100.linkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class t34 {
    private final int capacity;
    private final Map<Integer,Integer> cache = new LinkedHashMap<>();


    public t34(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = cache.remove(key);
        if (value != null) {
            cache.put(key,value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Integer oldValue = cache.remove(key);
        if (oldValue != null) {
            cache.put(key,value);
            return;
        }
        // 插入 判断cache是否满了
        if (cache.size() >= capacity) {
            Integer eldest = cache.keySet().iterator().next();
            cache.remove(eldest);
        }
        cache.put(key,value);
    }
}
