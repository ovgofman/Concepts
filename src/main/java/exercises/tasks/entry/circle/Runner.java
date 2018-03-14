package exercises.tasks.entry.circle;

import java.io.IOException;

/**
 * Created by hofa on 13.03.2018.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Circle c = new Circle();
        Circle c2 = new Circle();
        System.out.println();

//        c.radius = 3;
        System.out.print("Length c: ");
        c.countCircleLength();
        System.out.print("Length c2: ");
        c2.countCircleLength();
        System.out.println();

//        System.out.println("Before changes");
//        System.out.println("X: " + c.x + ", Y: " + c.y);
//        System.out.println("X2: " + c2.x + ", Y2: " + c2.y);
//        System.out.print("Length between points: ");
//        c.countLengthBetweenCircles(c, c2);

//        c.moveCircle();
//        c2.moveCircle();
//        System.out.println("\nAfter changes");
//        System.out.println("X: " + c.x + ", Y: " + c.y);
//        System.out.println("X2: " + c2.x + ", Y2: " + c2.y);
//        System.out.print("Length between points: ");
//        c.countLengthBetweenCircles(c, c2);
        c.checkIntersection(c, c2);
    }
}
