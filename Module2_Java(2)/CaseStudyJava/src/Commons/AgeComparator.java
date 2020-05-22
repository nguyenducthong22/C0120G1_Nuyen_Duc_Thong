package Commons;

import Models.Customer;
import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {
    public int compare(Customer s1, Customer s2) {

        if (Integer.parseInt(s1.getDate().substring(6,10)) == Integer.parseInt(s2.getDate().substring(6,10)))
            return 0;
        else if (Integer.parseInt(s1.getDate().substring(6,10)) > Integer.parseInt(s2.getDate().substring(6,10)))
            return 1;
        else
            return -1;
    }
}
