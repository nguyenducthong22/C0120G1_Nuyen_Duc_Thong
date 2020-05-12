package _5_AbstractAndInterface.ThucHanh.TrienKhaiInterfaceComparator;

import java.util.Comparator;

public class CricleComparator  implements Comparator <Cricle> {

    @Override
    public int compare(Cricle c1, Cricle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
