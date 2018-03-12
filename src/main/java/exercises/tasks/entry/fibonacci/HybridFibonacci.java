package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 10.03.2018.
 */
public class HybridFibonacci implements Fibonacci {
    public long count(long value) {
        if (value > 50) {
            int fib1 = 1;
            int fib2 = 1;
            for (int i = 3; i <= value; i++) {
                int fn = fib1;
                fib1 = fib2 + fib1;
                fib2 = fn;
            }
            return fib1;
        } else if (value == 1 || value == 2) {
            return 1;
        } else
            return count(value - 2) + count(value - 1);
    }
}
