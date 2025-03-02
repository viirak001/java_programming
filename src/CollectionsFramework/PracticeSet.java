package CollectionsFramework;

import java.util.HashSet;
import java.util.List;

public class PracticeSet {
    public static void main(String[] args) {
        java.util.Set<String> stringSet
                = new HashSet<>(List.of("Somnang"));
        // Start Add:
        stringSet.add("jame");
        stringSet.add("jonh");
        stringSet.add("jame");

        // Remove by index:
        stringSet.remove("Somnang");

        //Clear all element inside set:
        stringSet.clear();

        // check if set is empty:
        if (stringSet.isEmpty()){

        }

        // check if the element exist in the set:
        stringSet.contains("Somnang");
        System.out.println(stringSet);
    }
}
