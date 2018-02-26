package exercises.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr011 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter an integer that is positive and even: ");
        int capacity;
        do {
            capacity = Integer.parseInt(reader.readLine());
            if (capacity <= 0) {
                System.out.print("please, enter positive integer: ");
            } else if (capacity % 2 != 0) {
                System.out.print("please, enter even integer: ");
            }
        } while (capacity < 0 || capacity % 2 != 0);
        int[] array = new int[capacity];
        int leftHalf = 0;
        int rightHalf = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = -5 + random.nextInt(6 - (-5));
            if (i < array.length / 2) {
                leftHalf += Math.abs(array[i]);
            } else {
                rightHalf += Math.abs(array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
        if (leftHalf > rightHalf) {
            System.out.println("left half is bigger: " + leftHalf);
        }
        if (leftHalf < rightHalf) {
            System.out.println("right half is bigger: " + rightHalf);
        }
        if (leftHalf == rightHalf) {
            System.out.println("both halves are equal: " + leftHalf);
        }
    }
}
