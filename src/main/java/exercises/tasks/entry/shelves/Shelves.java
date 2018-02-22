package exercises.tasks.entry.shelves;

/**
 * Created by hofa on 22.02.2018.
 */
public class Shelves {
    public static void main(String[] args) {
        int numberOfShelvesThatContainsTwo = 0;
        for (int i = 0; i <= 50_000; i++) {

            if (i / 100000 % 10 == 2
                    || i / 10000 % 10 % 10 == 2
                    || i / 1000 % 10 % 10 % 10 == 2
                    || i / 100 % 10 % 10 % 10 % 10 == 2
                    || i / 10 % 10 % 10 % 10 % 10 == 2
                    || i / 1 % 10 % 10 % 10 % 10 == 2) {
                numberOfShelvesThatContainsTwo++;
            }
        }
        System.out.println("" + numberOfShelvesThatContainsTwo);


    }
}
