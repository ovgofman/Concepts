package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq006 {
    public static void main(String[] args) {
        double x = 099d;

        if (x < 1000 && x >= 100) {
            double firstDigit = (int) x / 10 / 10;
            double secondDigit = (int) x / 10 % 10;
            double thirdDigit = (int) x % 10;
            System.out.println((int) (firstDigit + secondDigit + thirdDigit));
        }
        if (x < 100 && x >= 10) {
            double firstDigit = (int) x / 10;
            double secondDigit = (int) x % 10;
            System.out.println((int) (firstDigit + secondDigit));
        }
        if (x < 10 && x >= 0) {
            System.out.println((int) x);
        }
    }
}
