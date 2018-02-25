package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr005 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer first[] = new Integer[5];
        Integer second[] = new Integer[5];
        double averageOfFirst = 0;
        double averageOfSecond = 0;

        for (int i = 0; i < second.length; i++) {
            first[i] = 0 + random.nextInt(6 - 0);
            second[i] = 0 + random.nextInt(6 - 0);
        }
        System.out.println(Arrays.toString(first) + "\n" + Arrays.toString(second));

        for (int i = 0; i < second.length; i++) {
            averageOfFirst += first[i];
            averageOfSecond += second[i];
        }

        if (averageOfFirst > averageOfSecond) {
            System.out.println("average of first array is bigger: " + averageOfFirst / first.length);
        } else if (averageOfFirst < averageOfSecond) {
            System.out.println("average of second array is bigger: " + averageOfSecond / second.length);
        } else {
            System.out.println("the average of arrays is equal");
        }
    }
}
