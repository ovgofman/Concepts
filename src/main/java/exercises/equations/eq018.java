package exercises.equations;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq018 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter INT number: ");
        boolean isInt = sc.hasNextInt();

        if (isInt) {
            System.out.println(sc.nextInt() + " is INT");
        } else {
            System.out.println("isn't INT");
        }
    }
}
