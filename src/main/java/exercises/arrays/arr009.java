package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr009 {
    public static void main(String[] args) {
        Random random = new Random();
        int first[] = new int[9];
        int second[] = new int[9];
        double ratioFirstToSecond[] = new double[9];

        int counter = 0;
        for (int i = 0; i < first.length; i++) {
            first[i] = 1 + random.nextInt(10 - 1);
            second[i] = 1 + random.nextInt(10 - 1);
            ratioFirstToSecond[i] = (double) first[i] / second[i];
            if (ratioFirstToSecond[i] % 1 == 0) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(ratioFirstToSecond));
        System.out.println("there is(are) " + counter + " int(s) in array");
    }
}
