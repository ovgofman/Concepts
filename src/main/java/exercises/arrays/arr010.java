package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr010 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[11];

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = -1 + random.nextInt(2 - (-1));

            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else if (array[i] == 0) {
                zero++;
            }
        }
        System.out.println(Arrays.toString(array));

        if (positive > negative && positive > zero) {
            System.out.println("\"1\" appears: " + positive + " times");
        }
        if (negative > positive && negative > zero) {
            System.out.println("\"-1\" appears: " + negative + " times");
        }
        if (zero > negative && zero > positive) {
            System.out.println("\"0\" appears: " + zero + " times");
        }
    }
}
