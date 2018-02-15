package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq004 {
    public static void main(String[] args) {
        Integer x = 14;
        String xToString = x.toString();

        int firstDigit = Integer.parseInt(xToString.substring(0, 1));
        int secondDigit = Integer.parseInt(xToString.substring(1));

        System.out.println(firstDigit + secondDigit);


    }
}
