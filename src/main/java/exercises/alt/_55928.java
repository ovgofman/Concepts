package exercises.alt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hofa on 13.04.2018.
 */
public class _55928 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringToArray = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
        int a = Integer.parseInt(stringToArray.get(0));
        int b = Integer.parseInt(stringToArray.get(1));
        int c = Integer.parseInt(stringToArray.get(2));

        System.out.println(pairSum20(a, b, c));
    }

    public static boolean pairSum20(int a, int b, int c) {
        if (a + b >= 20 || c + b >= 20 || a + c >= 20) {
            return true;
        } else {
            return false;
        }
    }
}