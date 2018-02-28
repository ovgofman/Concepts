package exercises.arrays;

import java.io.IOException;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr016 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int[][] twoDarray = new int[7][4];
        int[] x = new int[twoDarray.length];

        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                twoDarray[i][j] = -5 + random.nextInt(6 - (-5));
                x[i] += Math.abs(twoDarray[i][j]);
            }
        }
        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                System.out.print(twoDarray[i][j] + " ");
            }
            System.out.println();
        }

        int indexOfTheLineSumMathAbs = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > x[indexOfTheLineSumMathAbs]) {
                indexOfTheLineSumMathAbs = i;
            }
        }
        System.out.println(indexOfTheLineSumMathAbs + " index of the line");
    }
}
