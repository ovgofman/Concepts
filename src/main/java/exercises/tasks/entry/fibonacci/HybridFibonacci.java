package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 10.03.2018.
 */
public class HybridFibonacci implements Fibonacci {
    public long count(int fib) {
        long end, start;
        start = System.currentTimeMillis();
        if (fib > 50) {
            int fib1 = 1;
            int fib2 = 1;
            for (int i = 3; i <= fib; i++) {
                int fn = fib1;
                fib1 = fib2 + fib1;
                fib2 = fn;
            }
            return fib1;
        } else if (fib == 1 || fib == 2) {
            return 1;
        } else {
            long x = count(fib - 2) + count(fib - 1);
        }
        end = System.currentTimeMillis();
        return (end - start) / 1000L;
    }
}
