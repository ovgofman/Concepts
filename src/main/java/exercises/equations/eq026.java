package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq026 {
    public static void main(String[] args) {
        for (int i = 2; i < 10000; i = 2 * i - 1) {
            System.out.print(i + " ");
        }
    }
}
