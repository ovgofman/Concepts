package exercises.tasks.entry.army;

/**
 * Created by hofa on 25.02.2018.
 */
public class UnluckyNumbers {
    public static void main(String[] args) {
        String japan = "4";
        String usa = "13";
        int counter = 0;

        for (int i = 0; i < 99_999; i++) {
            String sb = Integer.toString(i);
            if (sb.contains(japan) || sb.contains(usa)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
