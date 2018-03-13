package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 13.03.2018.
 */
public class XFibAppearsInYFib implements Fibonacci {
    public long count(int fib) {
        if (fib == 1 || fib == 2) {
            return 1;
        } else
            return count(fib - 2) + count(fib - 1);
    }
}
