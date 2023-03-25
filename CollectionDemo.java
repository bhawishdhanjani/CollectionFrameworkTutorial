package Collection;

import java.util.ArrayList;
import java.util.Arrays;
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
        String[] collectionString = collection.toArray(new String[0]);
        System.out.println(Arrays.toString(collectionString));
        collection.clear();
        System.out.println(collection.isEmpty());
        Collections.addAll(collection,"a,b,c");
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection.equals(other));


    }
}
