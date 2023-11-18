package Dynamic;

import java.util.HashMap;

public class Socure {
    public static long fib(long a) {
        return fib(a, new HashMap<>());
    }
    public static long fib(long a, HashMap<Long, Long> memo) {
        if (a == 0 || a == 1) {
            return a;
        }
        
        if (memo.containsKey(a)) {
            return memo.get(a);
        }
        long result =  fib(a - 1, memo) + fib(a - 2, memo);
        memo.put(a, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fib result: "+ fib(57L));
    }
}
