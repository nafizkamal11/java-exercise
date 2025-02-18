import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 2025, January 22, Wednesday, 10:31 PM
 */

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

        Set<Integer> keys = map.keySet();
        System.out.println("keys = " + keys);

        Collection<String> values = map.values();
        System.out.println("values = " + values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entries = " + entries);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry = " + entry);
        }

    }
}
