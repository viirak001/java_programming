package CollectionsFramework;

import java.util.*;

public class CollectionFrameworkMap {
    /*
    public static void main(String[] args) {
        /*
        Map<Integer, String> map
                = new HashMap<>();

        // add element to map
        map.put(1, "Apple");
        map.put(2, "Water");
        map.put(3, "Drink");

        // list all keys in map (temp)
        Set<Integer> keys = map.keySet();
        System.out.println("All Keys: " + keys);

        // Get all value
        Collection<String> values = (map.values());
        System.out.println("All value in map: " + values);
    }

     */
//

    /**
     * Hashmap: keys & value can not duplicate but value can null
     */
    /*
    public static void main(String[] args) {
        Map<Integer, String> map
                = new HashMap<>();

        // add element to map
        map.put(1, "Apple");
        map.put(2, "Water");
        map.put(3, "Drink");
        map.put(4, null);
        map.put(null, null);

        for (Map.Entry<Integer, String> obj: map.entrySet()){  // have obj should have Entry
            System.out.println("Key: " + obj.getKey());
            System.out.println("value: " + obj.getValue());
        }
    }

     */
//
//
    /*
    public static void main(String[] args) {
        Map<Integer, String> map
                = new HashMap<>();

        // add element to map
        map.put(1, "Apple");
        map.put(2, "Water");
        map.put(3, "Drink");
        map.put(4, null);

        System.out.print("All Element after added: ");
        for (Map.Entry<Integer, String> obj: map.entrySet()){
            System.out.println(obj);
        }
        // remove element in map by using key of map
        map.remove(4);
//        map.remove(4,null); remove by using both key and value
//        map.clear();// clear all element inside map
        String getElementUsingKey
                = map.get(3);
        System.out.println("All element after deleted: ");
        for(Map.Entry<Integer, String> obj: map.entrySet()){
            System.out.println(obj);
        }
    }

     */
//
//    Example....
//
}
