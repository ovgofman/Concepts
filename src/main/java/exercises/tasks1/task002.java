package exercises.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hofa on 06.04.2018.
 * Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?
 * Input data format
 * On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
 * Sample Input 1:
 * 10
 * 3
 * 2
 * Sample Output 1:
 * 8
 */
public class task002 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(reader.readLine());
        int feetsGoUp = Integer.parseInt(reader.readLine());
        int feetsGoDown = Integer.parseInt(reader.readLine());
        int days;
        int var = 0;

        for (days = 1; var + feetsGoUp < height; days++) {
            var += feetsGoUp - feetsGoDown;
        }
        System.out.println(days);
    }
}
