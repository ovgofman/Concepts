package exercises.equations;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq019 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int x = 0, y = 0;

        if (sc.hasNextInt()) {
            x = sc.nextInt();
            if (sc.hasNextInt()) {
                y = sc.nextInt();
                System.out.println(Integer.parseInt(String.valueOf(x)) + Integer.parseInt(String.valueOf(y)));
            } else {
                System.out.println("Wrong second number");
            }
        } else {
            System.out.println("Wrong first number");
        }
    }
}
