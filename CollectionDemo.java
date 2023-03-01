package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        for (var item:collection)
            System.out.println(item);
        System.out.println(collection);
        Collections.addAll(collection,"d","e","f");
        System.out.println(collection);
        System.out.println(collection.size());

    }
}
