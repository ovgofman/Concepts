package exercises.equations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq031 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("We'll count summary of digits of yours number: ");

        String s = String.valueOf(Integer.parseInt(reader.readLine()));
        char array[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }

        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + Character.getNumericValue(array[i]);
        }
        System.out.println("Summary is: " + x);
    }
}
