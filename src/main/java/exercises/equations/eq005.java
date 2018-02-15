package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq005 {
    public static void main(String[] args) {
        double accuracy = 0.000_000_000_5d;
        double value = 16.000_000_000_501d;

        if ((value - (int) value) > accuracy) {
            System.out.println(
                    (int) (value +
                            (1 - (value - (int) value)))
            );
        } else {
            System.out.println((int) value);
        }
    }
}
