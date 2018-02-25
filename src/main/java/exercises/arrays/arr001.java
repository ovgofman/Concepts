package exercises.arrays;

/**
 * Created by hofa on 25.02.2018.
 */
public class arr001 {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
            System.out.print(array[i] + " ");
        }
    }
}
