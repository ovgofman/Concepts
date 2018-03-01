package exercises.methods;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 02.03.2018.
 */
public class meth001 {
    public static void main(String[] args) {
        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = createNumber(3,7);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int createNumber(int from, int to) {
        Random random = new Random();
        int temp = from + random.nextInt(to - from);
        return temp;
    }
}
