package exercises.tasks.entry.clock;

/**
 * Created by hofa on 22.02.2018.
 */
public class Clock {
    public static void main(String[] args) {
        int counter = 0;
        String format = "%02d";

        StringBuilder hours = new StringBuilder(), minutes = new StringBuilder();

        for (int i = 0; i < 24; i++) {
            hours.append(String.format(format, i));
            for (int j = 0; j < 60; j++) {
                minutes.append(String.format(format, j)).reverse();
                if (hours.toString().equals(minutes.toString())) {
                    System.out.printf("%02d - %s:%s\n", ++counter, hours, minutes.reverse());
                }
                minutes.delete(0, minutes.length());
            }
            hours.delete(0, hours.length());
        }
    }
}
