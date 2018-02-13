package exercises.factorial;

/**
 * Created by hofa on 13.02.2018.
 */
public class Recursive implements Factorial {
    public int count(int value) {
        if (value == 0) {
            return 1;
        } else
            return value *= count(value - 1);
    }
}
