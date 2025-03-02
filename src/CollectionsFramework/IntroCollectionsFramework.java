package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class IntroCollectionsFramework {
    public static void main(String[] args) {
//        ArrayList<Integer>integerArrayList
//                    = new ArrayList<>(List.of(1,2,3,4,5,6,7));
//                integerArrayList.add(4);
//                integerArrayList.add(7);
//        System.out.println(integerArrayList);


//
        ArrayList<Integer>integerArrayList
                = new ArrayList<>();
        integerArrayList.add(4);
        integerArrayList.add(7);

        // Adding new element to arrayList by specified index:
        integerArrayList.add(1, 100);

        // Remove element from arrayList using Index:
        integerArrayList.remove(0);
//        or another method:
//        integerArrayList.removeFirst();
//        integerArrayList.removeLast();

        // Update element in arrayList using Index:
        integerArrayList.set(0, 200);

        // Get element of array list:
        System.out.println(integerArrayList.getFirst());
        System.out.println(integerArrayList.getLast());

        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.get(1));

        // loop through arraylist element:
        integerArrayList.forEach(System.out::println); // or (e->System.out.println(e));
    }

}
