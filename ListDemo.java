package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        Collections.addAll(list,"c","b");
        list.add(0,"!");
        System.out.println(list.get(0));
        list.set(0,"a+");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.indexOf("a"));
        List<String> sublist = list.subList(0,2);
        System.out.println(sublist);
    }
}
