package exercises.methods;

import java.util.Arrays;

/**
 * Created by hofa on 02.03.2018.
 */
public class meth004 {
    public static void main(String[] args) {
        String[] authors = {
                "Пушкин",
                "Лермонтов",
                "Некрасов",
                "Толстой Л. Н.",
                "Толстой А. Н.",
                "Есенин",
                "Паустовский"
        };

        Arrays.sort(authors);
        for (int i = 0; i < authors.length; i++) {
            System.out.println(authors[i]);
        }
    }
}
