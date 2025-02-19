import java.util.*;
import java.util.function.Predicate;

/**
 * 2025, January 22, Wednesday, 10:31 PM
 */

public class Main {
    static class Range implements Iterable<Integer> {

        private final int start;
        private final int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<>() {
                private int index = start;

                @Override
                public boolean hasNext() {
                    return index < end;
                }

                @Override
                public Integer next() {
                    if (index > end) {
                        throw new NoSuchElementException("" + index);
                    }
                    int currentIndex = index;
                    index++;
                    return currentIndex;
                }
            };
        }
    }

    public static void main(String[] args) {
        for (int i : new Range(0, 5)) {
            System.out.println("i = " + i);
        }

    }
}
