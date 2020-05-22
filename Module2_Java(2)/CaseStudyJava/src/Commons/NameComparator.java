package Commons;

import Models.Customer;


import java.util.Comparator;

public  class NameComparator implements Comparator<Customer> {
    public int compare(Customer s1, Customer s2) {
        return s1.getName().compareTo(s2.getName());
    }
}