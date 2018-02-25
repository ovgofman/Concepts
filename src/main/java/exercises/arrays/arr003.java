package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr003 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer array[] = new Integer[15];
        int numberOfEven = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = 0 + random.nextInt(10 - 0);
            if (array[i] % 2 == 0) {
                numberOfEven++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("number of even: " + numberOfEven);

    }
}
