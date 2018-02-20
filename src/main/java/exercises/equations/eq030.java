package exercises.equations;

import java.io.IOException;

/**
 * Created by hofa on 15.02.2018.
 */

public class eq030 {
    public static void main(String[] args) throws IOException {
//        Создайте программу, выводящую на экран 12 первых элементов последовательности 2an-2–2, где a1=3 и a2=2.
        for (int i1 = 3, i2 = 2; i1 < 15; i1++, i2++) {
            int first = 2 * (i1 - 2) - 2;
            int second = 2 * (i2 - 2) - 2;
            System.out.println(first + " " + second);
        }
    }
}
