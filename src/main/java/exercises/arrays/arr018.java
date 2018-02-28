package exercises.arrays;

import java.io.IOException;
import java.util.Random;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr018 {
    public static void main(String[] args) throws IOException {
        int[][] multiplicationTable = new int[10][10];
        Random multiplicationTable2to9 = new Random();

        for (int i = 2; i < multiplicationTable.length; i++) {
            for (int j = 2; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = i * j;
            }
        }

        System.out.println("randomization of multiplication table: ");
        for (int i = 0; i < 15; i++) {
            int x = 2 + multiplicationTable2to9.nextInt(10 - 2);
            int y = 2 + multiplicationTable2to9.nextInt(10 - 2);
            if (multiplicationTable[x][y] != 0) {
                System.out.println(x + " * " + y);
                multiplicationTable[x][y] = 0;
            } else {
//                System.out.println("result was removed because of existing");
                --i;
            }
        }
    }
}
