package exercises.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr012 {
    public static void main(String[] args) throws IOException {
        int array[] = new int[12];
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = createRandom();
            while (array[i] == 0) {
                array[i] = createRandom();
            }

            if (positiveCounter >= array.length / 2 && array[i] > 0) {
                array[i] = -1 * array[i];
                positiveCounter--;
                negativeCounter++;
            }
            if (negativeCounter >= array.length / 2 && array[i] < 0) {
                array[i] = -1 * (-array[i]);
                negativeCounter--;
                positiveCounter++;
            }

            if (array[i] > 0) {
                positiveCounter++;
            }
            if (array[i] < 0) {
                negativeCounter++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Pos: " + positiveCounter);
        System.out.println("Neg: " + negativeCounter);
    }

    static int createRandom() {
        Random random = new Random();
        int x = -10 + random.nextInt(11 - (-10));
        return x;
    }
}