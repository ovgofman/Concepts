package exercises.alt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hofa on 13.04.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringToArray = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));

        double a = Double.parseDouble(stringToArray.get(0));
        double b = Double.parseDouble(stringToArray.get(1));

        b = Math.pow(a, b);

        System.out.println(b);
    }
}