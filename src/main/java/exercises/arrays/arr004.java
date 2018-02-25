package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr004 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer array[] = new Integer[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(11 - 1);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
