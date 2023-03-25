package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer>  customers = new ArrayList<>();
        customers.add(new Customer("c","e3"));
        customers.add(new Customer("a","e2"));
        customers.add(new Customer("b","e1"));
        Collections.sort(customers,new EmailComparator());
        System.out.println(customers);
    }
}
