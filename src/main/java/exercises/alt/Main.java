package exercises.alt;

import java.io.IOException;

/**
 * Created by hofa on 13.04.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String city = reader.readLine();
        isVowel('W');
    }

    public static boolean isVowel(char ch) {
        String s = String.valueOf(ch);
        if (s.toLowerCase().equals("a") || s.toLowerCase().equals("e") || s.toLowerCase().equals("i") || s.toLowerCase().equals("o") || s.toLowerCase().equals("u")) {
            return true;
        } else {
            return false;
        }
    }
}