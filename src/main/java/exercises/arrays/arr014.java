package exercises.arrays;

import java.io.IOException;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr014 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int[][] twoDarray = new int[8][5];
        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                twoDarray[i][j] = 10 + random.nextInt(100 - 10);
            }
        }
        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                System.out.print(twoDarray[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }
    }
}
