package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 14.02.2018.
 */
public class FibonacciRunner {
    public static void main(String[] args) {
        long end, start;
        Fibonacci iterative = new Iterative();
        Fibonacci recursive = new Recursive();
        HybridFibonacci hybridFibonacci = new HybridFibonacci();
        start = System.currentTimeMillis();
//         System.out.println(iterative.count(1));
//        System.out.println(recursive.count(1));
        System.out.println(hybridFibonacci.count(50));
        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000L + " sec");

    }
}
