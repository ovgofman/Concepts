package exercises.arrays;

import java.io.IOException;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr017 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int[][] twoDarray = new int[6][7];

        for (int row = 0; row < twoDarray.length; row++) {
            for (int index = 0; index < twoDarray[row].length; index++) {
                twoDarray[row][index] = random.nextInt(10);

                int maxValueForEachRow = 0;
                int indexOfMaxValueForEachRow = 0;
                System.out.print(twoDarray[row][index] + " ");

                if (index == 0) {
                    maxValueForEachRow = twoDarray[row][index];
                } else if (maxValueForEachRow < twoDarray[row][index]) {
                    maxValueForEachRow = twoDarray[row][index];
                    indexOfMaxValueForEachRow = index;
                }

                if (index == twoDarray[row].length - 1) {
                    int temp = twoDarray[row][0];
                    twoDarray[row][0] = twoDarray[row][indexOfMaxValueForEachRow];
                    twoDarray[row][indexOfMaxValueForEachRow] = temp;
                }
            }
            System.out.println(" ");
        }
        for (int row = 0; row < twoDarray.length; row++) {
            for (int index = 0; index < twoDarray[row].length; index++) {
                System.out.print(twoDarray[row][index] + " ");
            }
        }
    }
}
