package exercises.alt;

import java.io.IOException;

/**
 * Created by hofa on 13.04.2018.
 * Implement a method named isBetween that takes three integer numbers as parameters and returns true if the first number is between the second and third ones (inclusive). Otherwise, it must return false.
 * <p>
 * The sorting order of two last arguments can be any.
 * Sample Input 1:
 * <p>
 * 3 3 3
 * Sample Output 1:
 * <p>
 * true
 * Sample Input 2:
 * <p>
 * 40 30 50
 * Sample Output 2:
 * <p>
 * true
 * Sample Input 3:
 * <p>
 * 40 100 20
 * Sample Output 3:
 * <p>
 * true
 */
public class _55926 {
    public static void main(String[] args) throws IOException {

        System.out.println(isBetween(50,60,40));
    }

    public static boolean isBetween(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return true;
        } else {
            return false;
        }
    }
}