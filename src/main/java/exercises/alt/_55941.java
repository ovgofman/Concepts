package exercises.alt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hofa on 13.04.2018.
 * Given two 2D vectors. Find the angle (degree) between them.
 * <p>
 * If you don't know how to find the angle, see here: http://www.wikihow.com/Find-the-Angle-Between-Two-Vectors.
 * <p>
 * Input data format
 * <p>
 * The first line contains two components of the first vector, the second line contains two components of the second vector. Components in one line is separated by space.
 * <p>
 * Output data format
 * <p>
 * One double value - an angle between two vectors. The result can have an error less than 1e-8.
 * <p>
 * Sample Input 1:
 * <p>
 * 1 3
 * 4 2
 * Sample Output 1:
 * <p>
 * 45
 * Sample Input 2:
 * <p>
 * 0 4
 * 0 4
 * Sample Output 2:
 * <p>
 * 0
 */
public class _55941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> firstVector = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
        ArrayList<String> secondVector = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));

        int firstVectorX = Integer.parseInt(firstVector.get(0));
        int firstVectorY = Integer.parseInt(firstVector.get(1));

        int secondVectorX = Integer.parseInt(secondVector.get(0));
        int secondVectorY = Integer.parseInt(secondVector.get(1));

        double a = firstVectorX * secondVectorX + firstVectorY * secondVectorY;
        double moduleOneLenght = Math.sqrt(Math.pow(firstVectorX,2) + Math.pow(firstVectorY, 2));
        double moduleTwoLenght = Math.sqrt(Math.pow(secondVectorX, 2) + Math.pow(secondVectorY,2));

        double x = Math.toDegrees(Math.acos(a / (moduleOneLenght * moduleTwoLenght))) ;
        System.out.println(x);
    }
}