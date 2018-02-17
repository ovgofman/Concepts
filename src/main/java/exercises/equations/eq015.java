package exercises.equations;

import java.util.Arrays;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq015 {
    public static void main(String[] args) {
        int x = 3, y = 6, z = 1;
        numsToArray(x, y, z);
    }

    static void numsToArray(int x, int y, int z) {
        int array[] = {x, y, z};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
