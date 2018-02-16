package exercises.equations;

import java.util.Random;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq012 {
    public static void main(String[] args) {
        Random random = new Random();

        int roll = 100 + random.nextInt(999 - 100);

        int f = roll / 10 / 10;
        int s = roll / 10 % 10;
        int t = roll % 10;

        int compareFS = Math.max(f, s);
        int compareST = Math.max(t, s);

        int result = Math.max(compareFS, compareST);

        System.out.println("random number is: " + roll);
        System.out.println("biggest digit is: " + result);
    }
}
