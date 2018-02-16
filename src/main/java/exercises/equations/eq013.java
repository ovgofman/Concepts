package exercises.equations;

import java.util.Random;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq013 {
    public static void main(String[] args) {
        Random random = new Random();

        int roll = 5 + random.nextInt(155 - 5);

        if (roll < 25) {
            System.out.println("number less than: 25");
        } else if (roll >= 25 && roll <= 100) {
            System.out.println("interval [25;100] contains a number: " + roll);
        } else if (roll > 100) {
            System.out.println("number bigger than: 100");
        }
    }
}
