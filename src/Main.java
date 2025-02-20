import java.util.*;
import java.util.function.Predicate;

/**
 * 2025, January 22, Wednesday, 10:31 PM
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("0", "1", "2", "3"));
        ListIterator<String> stringListIterator = list.listIterator(1);
        while (stringListIterator.hasNext()) {
            if(stringListIterator.next().equals("1"))
                stringListIterator.remove();
        }

        System.out.println(list);   // [0, 1, 2, 3]

        list.subList(1, 3).clear();
        System.out.println(list);   // [0, 3]


    }
}
