package exercises.equations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq029 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Is your number natural: ");
        int divider = Integer.parseInt(reader.readLine());
        int counter = 0;
        int numberOfOpeningSecondIf = 0;

        if (divider > 1) {
            for (int i = 2; i < divider; i++) {
                if (divider % i == 0) {
                    numberOfOpeningSecondIf++;
                    System.out.println("It's not: " + divider / i);
                    break;
                }
            }
        }
        if (counter >= numberOfOpeningSecondIf) {
            System.out.println("It is");
        }
    }
}
