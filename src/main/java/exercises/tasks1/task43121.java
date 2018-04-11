package exercises.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 06.04.2018.
 * Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59), i.e. first goes the number of hours, then goes the two-digit number of minutes, followed by the two-digit number of seconds. If necessary, number of minutes and seconds are filled by zeroes to a two-digit number.
 * <p>
 * N seconds passed from the beginning of the day. Output what the watches will display.
 * <p>
 * Input data format
 * <p>
 * Given the natural number N on input, not exceeding 10^7 (10000000).
 * <p>
 * Sample Input 1:
 * <p>
 * 3602
 * Sample Output 1:
 * <p>
 * 1:00:02
 * Sample Input 2:
 * <p>
 * 129700
 * Sample Output 2:
 * <p>
 * 12:01:40
 */
public class task43121 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rawSeconds = Integer.parseInt(reader.readLine());
        System.out.format("%d:%02d:%02d", rawSeconds / 3600 % 24, rawSeconds / 60 % 60, rawSeconds % 3600 % 60);
    }
}
