package exercises.fibonacci;

/**
 * Created by hofa on 14.02.2018.
 */
public class FibonacciRunner {
    public static void main(String[] args) {
        Fibonacci iterative = new Iterative();
        Fibonacci recursive = new Recursive();

        System.out.println(iterative.count(1));
        System.out.println(recursive.count(1));
    }
}
