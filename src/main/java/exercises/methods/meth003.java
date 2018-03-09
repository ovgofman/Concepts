package exercises.methods;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hofa on 02.03.2018.
 */
public class meth003 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < 2; i++) {
            fillInAnArray(arr);
            System.out.println("Before: " + Arrays.toString(arr));
            sortASC(arr);
            System.out.println("After : " + Arrays.toString(arr));
        }
    }

    public static int[] sortASC(int[] sortArray) {
        for (int i = sortArray.length - 1; i >= 1; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    int temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return sortArray;
    }

    public static int[] fillInAnArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = createNumber(3, 10);
        }
        return arr;
    }

    public static int createNumber(int from, int to) {
        Random random = new Random();
        int temp = from + random.nextInt(to - from);
        return temp;
    }
}
