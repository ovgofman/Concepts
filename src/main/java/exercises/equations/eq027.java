package exercises.equations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq027 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a natural number: ");
        int naturalNumbers = Integer.parseInt(reader.readLine());

        System.out.print("Factorial: ");
        System.out.println(count(naturalNumbers));
    }

    static int count(int value) {
        if (value == 0) {
            return 1;
        } else
            return value *= count(value - 1);
    }
}