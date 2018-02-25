package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr008 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer randomArray[] = new Integer[12];
        int maxValue = 0;
        int index = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = -15 + random.nextInt(16 - (-15));
            if (randomArray[i] >= maxValue) {
                maxValue = randomArray[i];
                index = i + 1;
            }
        }
        System.out.println("random array: " + Arrays.toString(randomArray));
        System.out.println("Max value: " + maxValue);
        System.out.println("index: " + index);
    }
}
