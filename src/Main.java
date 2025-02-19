import java.util.*;
import java.util.function.Predicate;

/**
 * 2025, January 22, Wednesday, 10:31 PM
 */

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("a")) {
                // collection.remove(next);  // ConcurrentModificationException
                iterator.remove();          // [b, c]
            }
        }
    }
}
