package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq016 {
    public static void main(String[] args) {
        int seconds = 60;
        int minutes = 60;
        int start = 9 * minutes * seconds;
        int finish = 17 * minutes * seconds;

        String currentTime = "11.59";  // <-- Change the time here

        String time[] = currentTime.split("\\.");
        int currentHours = Integer.valueOf(time[0]);
        int currentMinutes = Integer.valueOf(time[1]);
        int currentTimeInSeconds = currentHours * minutes * seconds + currentMinutes * seconds;

        if (currentTimeInSeconds >= finish || currentTimeInSeconds < start) {
            System.out.println("it's not working time");
        }
        if (currentHours < 17 && currentHours >= 16) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println("less than one hour left");
        }
        if (currentHours < 16 && currentHours >= 15) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
        if (currentHours < 15 && currentHours >= 14) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
        if (currentHours < 14 && currentHours >= 13) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
        if (currentHours < 13 && currentHours >= 12) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
        if (currentHours < 12 && currentHours >= 11) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
        if (currentHours < 11 && currentHours >= 10) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
        if (currentHours < 10 && currentHours >= 9) {
            System.out.println(finish - currentTimeInSeconds);
            System.out.println(((finish - currentTimeInSeconds) / minutes / seconds) + " hours left");
        }
    }
}
