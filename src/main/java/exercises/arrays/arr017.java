package exercises.arrays;

import java.io.IOException;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr017 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int[][] array = new int[1][7];

        for (int row = 0; row < array.length; row++) {
            for (int index = 0; index < array[row].length; index++) {
                array[row][index] = random.nextInt(10);
                System.out.print(array[row][index] + " ");
            }
            System.out.println();
        }
        for (int row = 0; row < array.length; row++) {
            for (int index = array[row].length -1; index > 0; index--) {
                if (array[row][index] > array[row][index - 1]) {
                    int temp = array[row][index];
                    array[row][index] = array[row][index - 1];
                    array[row][index - 1] = temp;
                }
            }
        }
        System.out.println("++++++++++++++++");
        for (int row = 0; row < array.length; row++) {
            for (int index = 0; index < array[row].length; index++) {
                System.out.print(array[row][index] + " ");
            }
            System.out.println(" ");
        }
    }
}
