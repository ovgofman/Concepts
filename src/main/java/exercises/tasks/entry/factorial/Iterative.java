package exercises.tasks.entry.factorial;

/**
 * Created by hofa on 13.02.2018.
 */
class Iterative implements Factorial {
    public int count(int value) {
        int result = 1;

        while (value > 0) {
            result *= value;
            value -= 1;
        }
        return result;
    }
}
