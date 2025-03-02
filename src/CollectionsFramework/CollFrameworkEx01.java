package CollectionsFramework;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class CollFrameworkEx01 {
    static Set<String> names = new TreeSet<>();

    public static void main(String[] args) {
        // Add element to set
        names.add("Somnang");
        names.add("Visal".toLowerCase(Locale.ROOT));
        names.add("Ratha");
        // search element from set
        for(String name: names){
            if(name.equals("VISAL".toLowerCase())){
                System.out.println(name + "existed");
            }
        }
        // remove
        names.remove("Visal");

//        // Get element from wet
//        for (String name:names){
//            System.out.println("Name: " + name);
//        }


    }
}
