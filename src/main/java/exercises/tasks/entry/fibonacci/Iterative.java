package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 14.02.2018.
 */
public class Iterative implements Fibonacci {
    public long count(int fib) {
        int fib1 = 1;
        int fib2 = 1;

        for (int i = 3; i <= fib; i++) {
            int fn = fib1;
            fib1 = fib2 + fib1;
            fib2 = fn;
        }
        return fib1;
    }
}
