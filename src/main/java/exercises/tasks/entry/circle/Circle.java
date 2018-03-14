package exercises.tasks.entry.circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by hofa on 13.03.2018.
 */
public class Circle {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    public double x;
    public double y;
    public double radius;

    public Circle() throws IOException {
        System.out.print("enter X: ");
        this.x = Integer.parseInt(reader.readLine());
        System.out.print("enter Y: ");
        this.y = Integer.parseInt(reader.readLine());
        System.out.print("enter R: ");
        this.radius = Integer.parseInt(reader.readLine());
    }

    public void countCircleLength() {
        System.out.println(2 * Math.PI * radius);
    }

    public void moveCircle() {
        this.x = -99 + random.nextInt(100 - (-99));
        this.y = -99 + random.nextInt(100 - (-99));
    }

    public void countLengthBetweenCircles(Circle c, Circle c2) {
        double x = Math.abs(c2.x - c.x);
        double y = Math.abs(c2.y - c.y);
        double length = Math.sqrt(x * x + y * y);
        System.out.println(length);
    }

    public void checkIntersection(Circle c, Circle c2) {
        double x = Math.abs(c2.x - c.x);
        double y = Math.abs(c2.y - c.y);
        double length = Math.sqrt(x * x + y * y);

        if (c.x == c2.x && c.y == c2.y && c.radius == c2.radius) {
            System.out.println("Points are equal");
        } else if (length > (c.radius + c2.radius)) {
            System.out.println("Outer type;");
            System.out.println("Circles haven't got any intersections");
        } else if (length == (c.radius + c2.radius)) {
            System.out.println("Circles have got the only intersection");
        } else if (length < c.radius + c2.radius &&) {
            System.out.println("Circles have got two intersections");  //check it
        } else if (Math.abs(c2.radius - c.radius) == length && (2 * Math.PI * c.radius < 2 * Math.PI * c2.radius | 2 * Math.PI * c2.radius < 2 * Math.PI * c.radius)) {
            System.out.println("Circles have got the only intersection");
            System.out.println("Inner type;");
        } else if (Math.abs(c2.radius - c.radius) < length && (2 * Math.PI * c.radius < 2 * Math.PI * c2.radius | 2 * Math.PI * c2.radius < 2 * Math.PI * c.radius)) {
            System.out.println("Circles haven't got any intersections");
            System.out.println("Inner type;");
        }
    }
}
