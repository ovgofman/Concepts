package exercises.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr002 {
    public static void main(String[] args) {
        Integer array[] = new Integer[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }

        System.out.println("ASC: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.print("DESC: " + Arrays.toString(array));
    }
}
