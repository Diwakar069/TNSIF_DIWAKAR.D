package Constructor;

import com.tnsif.daythree.Customer;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setId(101);
        c1.setCname("Raja");
        c1.setCity("Villupuram");
        System.out.println(c1);  // printing the object

        Customer c2 = new Customer();
        c2.setId(102);
        c2.setCname("Priya");
        c2.setCity("Puducherry");
        System.out.println(c2);
    }
}
