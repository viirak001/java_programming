package CollectionsFramework;

import java.util.Set;
// no duplicate: in set
public class PracticeTreeSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new java.util.TreeSet<>();
        numbers.add(-200);
        numbers.add(-2);
        numbers.add(100);
        numbers.add(1);

        // Remove:
        numbers.remove(-200);

        // Remove if:
        numbers.removeIf(e->e.equals(100)); // can use your name.
        System.out.println(numbers);
    }
}
