package exercises.alt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hofa on 13.04.2018.
 */
public class _60160 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringToArray = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));

        int length = Integer.parseInt(stringToArray.get(0));
        int value = Integer.parseInt(stringToArray.get(1));

        int[] array = new int[length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}