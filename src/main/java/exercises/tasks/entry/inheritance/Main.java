package exercises.tasks.entry.inheritance;

/**
 * Created by hofa on 24.03.2018.
 */
public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();

        Elephant elephant = new Elephant();
        boolean isDangerous = elephant.isDangerous();
        if (elephant.canJump()) {
            jump(elephant);
        }

        Jumpable mouse;
        mouse = new Mouse();
//        boolean isMouseDangerous = mouse.isDangerous();
        if (mouse.canJump()) {
            jump(mouse);
        }
    }

    public static void jump(Jumpable object) {
//        Animal animal = object;
//        boolean isDangerous = object.isDangerous();
        if (object.canJump()) {
            jump(object);
        }
    }
}
