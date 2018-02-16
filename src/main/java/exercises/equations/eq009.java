package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq009 {
    public static void main(String[] args) {
        int whichOfDigitsNearestTo = 10;

        double x = 13;
        double y = 15;

        if ((Math.abs(x - whichOfDigitsNearestTo)) >= (Math.abs(y - whichOfDigitsNearestTo))) {
            System.out.println(y + "  y");
        } else {
            System.out.println(x + "  x");
        }
    }
}
