package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");
        Map<String,Customer> map = new HashMap<>();
        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);
        var customer = map.getOrDefault("e10",new Customer("Unknown",""));
        System.out.println(customer);
        var exists = map.containsKey("e1");
        System.out.println(exists);
        map.replace("e1",new Customer("a+","e1"));
        System.out.println(map);
        for(var key : map.keySet())
            System.out.println(key);
        for(var entry : map.entrySet())
            System.out.println(entry);
        for (var customer1:map.values())
            System.out.println(customer1);

    }
}
