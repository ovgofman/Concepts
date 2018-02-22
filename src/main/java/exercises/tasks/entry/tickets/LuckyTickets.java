package exercises.tasks.entry.tickets;

/**
 * Created by hofa on 22.02.2018.
 */
public class LuckyTickets {
    public static void main(String[] args) {

        int numberOfLuckyTickets = 0;
        for (int i = 0; i <= 999999; i++) {
            int num1 = i / 100000 % 10;
            int num2 = i / 10000 % 10 % 10;
            int num3 = i / 1000 % 10 % 10 % 10;
            int num4 = i / 100 % 10 % 10 % 10 % 10;
            int num5 = i / 10 % 10 % 10 % 10 % 10;
            int num6 = i / 1 % 10 % 10 % 10 % 10;

            if (num1 + num2 + num3 == num4 + num5 + num6) {
                numberOfLuckyTickets++;
            }
        }
        System.out.println(numberOfLuckyTickets);
    }
}
