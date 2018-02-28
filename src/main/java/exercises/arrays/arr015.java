package exercises.arrays;

import java.io.IOException;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr015 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int[][] twoDarray = new int[5][8];
        int maxValue = 0;

        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                twoDarray[i][j] = -99 + random.nextInt(100 - (-99));
                if (maxValue < twoDarray[i][j]) {
                    maxValue = twoDarray[i][j];
                }
            }
        }
        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                System.out.print(twoDarray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max value of array is: " + maxValue);
    }
}
