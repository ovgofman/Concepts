package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 14.02.2018.
 */
public class Recursive implements Fibonacci {
    public long count(long value) {
        if (value == 1 || value == 2) {
            return 1;
        } else
            return count(value - 2) + count(value - 1);
    }
}
