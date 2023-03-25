package Collection;

import java.util.*;

public class SetDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c","c");
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        System.out.println(set);
        Set<String> sett = new HashSet<>(collection);
        System.out.println(sett);
//        Set Operation
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("c","d","e"));
//        Union
//        set1.addAll(set2);
//        Intersection
//        set1.retainAll(set2);
//        Difference
//        set1.removeAll(set2);
        System.out.println(set1);



    }
}
