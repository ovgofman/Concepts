package exercises.equations;

import java.util.Random;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq014 {
    public static void main(String[] args) {
        Random dice = new Random();
        int sideA = 0, sideB = 0, sideC = 0, sideD = 0, sideE = 0, sideF = 0;
        String percentage = "percentage of side";

        for (int i = 0; i < 100; i++) {
            int roll = 1 + dice.nextInt(7 - 1);

            switch (roll) {
                case 1:
                    sideA++;
                    break;
                case 2:
                    sideB++;
                    break;
                case 3:
                    sideC++;
                    break;
                case 4:
                    sideD++;
                    break;
                case 5:
                    sideE++;
                    break;
                default:
                    sideF++;
            }
        }

        System.out.println(percentage + " A: %" + sideA * 0.01 + "\n" +
                percentage + " B: %" + sideB * 0.01 + "\n" +
                percentage + " C: %" + sideC * 0.01 + "\n" +
                percentage + " D: %" + sideD * 0.01 + "\n" +
                percentage + " E: %" + sideE * 0.01 + "\n" +
                percentage + " F: %" + sideF * 0.01 + "\n"
        );
    }
}
