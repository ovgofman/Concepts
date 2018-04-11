package exercises.tasks.entry.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hofa on 20.03.2018.
 */
public class A {
    public static <T> T getFirstValue(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
//        Integer b = A.getFirstValue(a);

        Long[] c = {1L, 2L};
        long d = A.getFirstValue(c);

        int[] e = {1};
//        int f = A.getFirstValue(e);

        Object[] g = new Object[10];
        Object h = A.getFirstValue(g);

        Set<Integer> i = new HashSet<>();
//        Integer k = A.getFirstValue(i);
    }
}