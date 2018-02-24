package exercises.tasks.entry.shelves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 22.02.2018.
 */
public class Shelves {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int produce = Integer.parseInt(reader.readLine());
        int numberOfShelvesThatContainsTwo = 0;
        System.out.println("Some company will produce " + produce + " shelves");
        for (int i = 0; i <= produce; i++) {
            if (i / 100000 % 10 == 2
                    || i / 10000 % 10 % 10 == 2
                    || i / 1000 % 10 % 10 % 10 == 2
                    || i / 100 % 10 % 10 % 10 % 10 == 2
                    || i / 10 % 10 % 10 % 10 % 10 == 2
                    || i / 1 % 10 % 10 % 10 % 10 == 2) {
                numberOfShelvesThatContainsTwo++;
            }
        }
        System.out.println("Because of something went wrong " + numberOfShelvesThatContainsTwo + " shelves will rejected");
    }
}
