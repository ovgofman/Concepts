package exercises.alt;

import java.io.IOException;

/**
 * Created by hofa on 13.04.2018.
 * Groundhogs like to throw fun parties, and at their parties, they like to eat Reeses peanut butter cups. But not too many Reeses or they feel sick! A successful groundhog party will have between 10 and 20 Reeses peanut butter cups, inclusive unless it is the weekend, in which case they will need 15 to 25 Reeses peanut butter cups, inclusive.
 * Your Java method should take two parameters, the first being the number of Reeses peanut butter cups, the second a boolean representing whether it is the weekend and returns the boolean value - the party is successful or not.
 * <p>
 * Sample Input 1:
 * <p>
 * 5 true
 * Sample Output 1:
 * <p>
 * false
 * Sample Input 2:
 * <p>
 * 16 false
 * Sample Output 2:
 * <p>
 * true
 */
public class _55929 {
    public static void main(String[] args) throws IOException {
        System.out.println(groundhogParty(21, true));
    }

    public static boolean groundhogParty(int numReeses, boolean isWeekend) {
        if ((numReeses >= 10 && numReeses <= 20 && isWeekend == true) ||
                (numReeses >= 15 && numReeses <= 25 && isWeekend == false)) {
            return true;
        } else {
            return false;
        }
    }
}