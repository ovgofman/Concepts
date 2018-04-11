package exercises.tasks.entry.inheritance;

/**
 * Created by hofa on 18.03.2018.
 */
public abstract class Animal {
    private int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public boolean isDangerous() {
        return isPredator() || getWeight() > 15;
    }

    protected int getWeight() {
        return weight;
    }

    abstract boolean isPredator();
}

interface Jumpable {
    boolean canJump();
}
