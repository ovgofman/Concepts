package exercises.factorial;

/**
 * Created by hofa on 13.02.2018.
 */
public class FactorialRunner {
    public static void main(String[] args) {
        Factorial iterative = new Iterative();
        Factorial recursive = new Recursive();

        System.out.println(iterative.count(2));
        System.out.println(recursive.count(2));
    }
}