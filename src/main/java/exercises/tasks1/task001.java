package exercises.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 06.04.2018.
 */
public class task001 {
    public static void main(String[] args) throws IOException {
        int login = 100500;
        int password = 424242;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] loginAndPass = reader.readLine().split("\\s+");

        int parseLogin = Integer.parseInt(loginAndPass[0]);
        int parsePassword = Integer.parseInt(loginAndPass[1]);

        if (parseLogin == login && parsePassword == password) {
            System.out.println("Login success");
        } else if (parseLogin == login && parsePassword != password) {
            System.out.println("Wrong password");
        } else if (parseLogin != login) {
            System.out.println("No user with login " + parseLogin + " found");
        }
    }
}
