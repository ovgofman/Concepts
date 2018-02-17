package exercises.equations;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq016 {
    public static void main(String[] args) {
        int seconds = 60;
        int minutes = 60;
        int finish = 17 * minutes * seconds;

        String currentTime = "9.00";  // <-- Change the time here

        String time[] = currentTime.split("\\.");
        int h = Integer.valueOf(time[0]);
        int m = Integer.valueOf(time[1]);
        int left = ((finish - h * minutes * seconds + m) / minutes / seconds);

        if (left > 0 && left < 9) {
            switch (left) {
                case 8:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                case 7:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                case 6:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                case 5:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                case 4:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                case 3:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                case 2:
                    System.out.println(left + " hours left to 5 p.m.");
                    break;
                default:
                    System.out.println("less than one hour left to 5 p.m.");
                    break;
            }
        } else
            System.out.println("it's not working time");
    }
}
