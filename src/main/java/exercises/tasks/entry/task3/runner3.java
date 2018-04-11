package exercises.tasks.entry.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 18.03.2018.
 */
class runner3 {
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
