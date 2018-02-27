package exercises.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr013 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Scanner readUserNumber;
        int arrayLenght;

        System.out.print("type a number: ");
        do {
            readUserNumber = new Scanner((System.in));
            arrayLenght = readUserNumber.nextInt();
            if (arrayLenght <= 3) {
                System.out.print("it has to be 3 or more: ");
            }
        }
        while (arrayLenght <= 3);
        int array[] = new int[arrayLenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(arrayLenght + 1);
        }
        System.out.println(Arrays.toString(array));

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 ) {
                counter++;
            }
        }
        int array2[] = new int[counter];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 ) {
                array2[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
