package exercises.alt;

import java.io.IOException;

/**
 * Created by hofa on 13.04.2018.
 * Implement a static method that takes three ints as parameters and returns true if exactly one parameter is positive.
 * <p>
 * For example:
 * exactlyOnePositive(1,0,0) -> true
 * Sample Input:
 * <p>
 * 1 1 1
 * Sample Output:
 * <p>
 * false
 */
public class _55927 {
    public static void main(String[] args) throws IOException {
        System.out.println(exactlyOnePositive(0, 8, 0));
    }

    public static boolean exactlyOnePositive(int a, int b, int c) {
        if (a + b == 0 || c + b == 0 || a + c == 0) {
            return true;
        } else {
            return false;
        }
    }
}