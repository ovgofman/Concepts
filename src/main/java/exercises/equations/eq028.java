package exercises.equations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq028 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int divider = Integer.parseInt(reader.readLine());
        System.out.print("Dividers: ");
        
        for (int i = 1; i <= divider; i++) {
            if (divider % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}