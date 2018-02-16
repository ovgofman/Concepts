package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq010 {
    public static void main(String[] args) {
        double D, x1, x2;
        double a = 1;
        double b = 2;
        double c = 3;

        D = Math.pow(b, 2) - 4 * a * c;

        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;

            System.out.println("there are two real roots: \n" +
                    x1 + "\n" +
                    x2);
        }
        if (D == 0) {
            x1 = -b / 2 * a;
            System.out.println("there is one real root: \n" + x1);
        }
        if (D < 0) {
            System.out.println("there are no real roots.");
        }
    }
}
