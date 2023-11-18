package Dynamic;

import java.util.HashMap;

public class Triboannic {
    public static long triboannic(long n) {
        return triboannic(n, new HashMap<>());
    }
    public static long triboannic(long n, HashMap<Long, Long> memo) {
        if (n == 0 || n == 1){
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result = triboannic(n - 1, memo) + triboannic(n - 2, memo) + triboannic(n - 3, memo);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(triboannic(52));
    }
}
