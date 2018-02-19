package exercises.equations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq020 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        if (Math.abs(x) < Math.abs(y)) {
            System.out.println(x);
        } else if (Math.abs(y) < Math.abs(z)) {
            System.out.println(y);
        } else if (Math.abs(x) < Math.abs(z)) {
            System.out.println(x);
        } else {
            System.out.println(z);
        }
    }
}
