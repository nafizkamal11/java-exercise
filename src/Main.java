import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Predicate;

/**
 * 2025, January 22, Wednesday, 10:31 PM
 */

public class Main {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));    // [a, b, c, d, e, f]
        NavigableSet<String> reversedStrings = navigableSet.descendingSet();    // [f, e, d, c, b, a]


    }
}
