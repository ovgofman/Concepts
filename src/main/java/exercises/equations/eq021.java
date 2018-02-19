package exercises.equations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String palindrome[] = reader.readLine().split("");

        System.out.println(isPalindrome(palindrome));
    }

    static boolean isPalindrome(String array[]) {
        int start = 0;
        int end = array.length - 1;

        if (array.length == 5) {
            for (int i = 0; i < array.length / 2; i++) {
                if (!array[start].equalsIgnoreCase(array[end])) {
                    return false;
                }
                start += 1;
                end -= 1;
            }
        }
        return true;
    }
}
