package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq002 {
    public static void main(String[] args) {
        int x = 14;
        double result = x / 209 + 14 * x * (29 - Math.pow(14, 2) + 14 / 3);
        double castToDouble = (double) x / 209 + 14 * x * (29 - Math.pow(14, 2) + 14 / 3);
        int castToInt = (int) (x / 209d + 14 * x * (29 - Math.pow(14, 2) + 14 / 3));

        System.out.println(result);
        System.out.println(castToDouble);
        System.out.println(castToInt);
    }
}
