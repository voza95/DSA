package Dynamic;

import java.util.HashMap;

public class GridTraveler {
    public static void main(String[] args) {
        System.out.println(gridTraveler(18, 18, new HashMap<>()));
    }

    public static Long gridTraveler(Integer m, Integer n, HashMap hashMap) {
        String key = m + "," + n;
        if (hashMap.containsKey(key)) return (Long) hashMap.get(key);
        if (m == 1 && n == 1) return 1L;
        if (m == 0 || n == 0) return 0L;
        hashMap.put(key, gridTraveler(m-1 , n, hashMap) + gridTraveler(m, n -1, hashMap));
        return (Long) hashMap.get(key);
    }
}
