package exercises.equations;

import java.util.Random;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq011 {
    public static void main(String[] args) {
        Random random = new Random();

        int roll = 5 + random.nextInt(155 - 5);

        if (25 < roll && roll < 100) {
            System.out.println("interval (5;155) has number: " + roll);
        } else
            System.out.println("interval (5;155) hasn't number: " + roll);
    }
}
