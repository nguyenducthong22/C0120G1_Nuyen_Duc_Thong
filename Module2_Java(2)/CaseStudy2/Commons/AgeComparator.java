package CaseStudy2.Commons;

import CaseStudy2.Models.Customer;
import java.util.*;

public class AgeComparator implements Comparator<Customer> {
    public int compare(Customer s1, Customer s2) {
        if (Integer.parseInt(s1.getDate().substring(0,4)) == Integer.parseInt(s1.getDate().substring(0,4)))
            return 0;
        else if (Integer.parseInt(s1.getDate().substring(0,4)) >Integer.parseInt(s1.getDate().substring(0,4)))
            return 1;
        else
            return -1;
    }
}