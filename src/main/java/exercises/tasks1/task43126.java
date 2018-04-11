package exercises.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 06.04.2018.
 * Given a two-digit number. Output its first digit (i.e. the number of tens).
 * <p>
 * Sample Input:
 * <p>
 * 42
 * Sample Output:
 * <p>
 * 4
 */
public class task43126 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstDigit = reader.readLine();
        System.out.println(firstDigit.charAt(0));
    }
}
