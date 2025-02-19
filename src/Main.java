import java.util.*;
import java.util.function.Predicate;

/**
 * 2025, January 22, Wednesday, 10:31 PM
 */

public class Main {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("");
        collection.add(null);
        collection.add("b");
        collection.add("");
        collection.add(null);
        collection.add("c");
        System.out.println(collection);     // [a, , null, b, , null, c]

        collection.removeIf(((Predicate<String>) Objects::isNull).or(String::isEmpty));
        System.out.println(collection);     // [a, b, c]
    }
}
