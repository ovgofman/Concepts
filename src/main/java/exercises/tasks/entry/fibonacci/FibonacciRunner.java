package exercises.tasks.entry.fibonacci;

/**
 * Created by hofa on 14.02.2018.
 */
public class FibonacciRunner {
    public static void main(String[] args) {
        int xFib = 4, yFib = 15;
        Fibonacci iterative = new Iterative();
        Fibonacci recursive = new Recursive();
        HybridFibonacci hybridFibonacci = new HybridFibonacci();
        XFibAppearsInYFib xFibAppearsInYFib = new XFibAppearsInYFib();

//         System.out.println(iterative.count(1));
//        System.out.println(recursive.count(1));
//        System.out.println(hybridFibonacci.count(40) + " sec");
        System.out.println("There are " + xFibAppearsInYFib.count(yFib - xFib + 1) + " times recount fib(" + xFib + ") in fib(" + yFib + ")");
    }
}
