package exercises.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 06.04.2018.
 * Given a natural number N, not greater than 10000. Output the even number following this N.
 * <p>
 * Sample Input 1:
 * <p>
 * 7
 * Sample Output 1:
 * <p>
 * 8
 */
public class task003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nextEven = Integer.parseInt(reader.readLine());

        if (nextEven % 2 != 0) {
            System.out.println(nextEven + 1);
        } else {
            System.out.println(nextEven + 2);
        }
    }
}
