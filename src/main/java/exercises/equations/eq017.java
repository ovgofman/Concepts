package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq017 {
    public static void main(String[] args) {

        int startPointOfTheDay = 9 * 60 * 60;
        int finishPointOfTheDay = 17 * 60 * 60;

        String currentTime = "12.23";  // <-- Change the time here

        int x = convert(toSeconds(currentTime), finishPointOfTheDay);

        if (x >= finishPointOfTheDay || x < startPointOfTheDay) {
            System.out.println("it's not working time");
        }
        if (x < finishPointOfTheDay && x >= (finishPointOfTheDay - (1 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than one hour left");
        }
        if (x < finishPointOfTheDay - (1 * 3600) && x >= (finishPointOfTheDay - (2 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 2 hour left");
        }
        if (x < finishPointOfTheDay - (2 * 3600) && x >= (finishPointOfTheDay - (3 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 3 hour left");
        }
        if (x < finishPointOfTheDay - (3 * 3600) && x >= (finishPointOfTheDay - (4 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 4 hour left");
        }
        if (x < finishPointOfTheDay - (4 * 3600) && x >= (finishPointOfTheDay - (5 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 5 hour left");
        }
        if (x < finishPointOfTheDay - (5 * 3600) && x >= (finishPointOfTheDay - (6 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 6 hour left");
        }
        if (x < finishPointOfTheDay - (6 * 3600) && x >= (finishPointOfTheDay - (7 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 7 hour left");
        }
        if (x < finishPointOfTheDay - (7 * 3600) && x >= (finishPointOfTheDay - (8 * 3600))) {
            System.out.println(finishPointOfTheDay - x);
            System.out.println("less than 8 hour left");
        }
    }

    static int convert(int currentTimeInSeconds, int finish) {

        return finish - (finish - currentTimeInSeconds);
    }

    static int toSeconds(String currentTime) {
        int seconds = 60;
        int minutes = 60;

        String time[] = currentTime.split("\\.");
        int currentHours = Integer.valueOf(time[0]);
        int currentMinutes = Integer.valueOf(time[1]);

        int currentTimeInSeconds = currentHours * minutes * seconds + currentMinutes * seconds;

        return currentTimeInSeconds;
    }
}