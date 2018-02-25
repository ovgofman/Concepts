package exercises.arrays;

import java.util.Arrays;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr006 {
    public static void main(String[] args) {
        Integer fibonacciArray[] = new Integer[20];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        for (int i = 2; i < fibonacciArray.length; i++) {
            if (i < 2) {
                fibonacciArray[i] = 1;
            } else {
                fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
            }
        }
        System.out.println(Arrays.toString(fibonacciArray));
    }
}
