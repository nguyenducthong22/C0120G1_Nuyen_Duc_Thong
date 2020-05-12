package _5_AbstractAndInterface.ThucHanh.TrienKhaiInterfaceComparator;

import _4_KeThua.BaiTap.HinhTru.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CricleComparatorTest {
    public static void main(String[] args) {
        Cricle[] circles = new Cricle[3];
        circles[0] = new Cricle(3.6);
        circles[1] = new Cricle();
        circles[2] = new Cricle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Cricle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CricleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Cricle circle : circles) {
            System.out.println(circle);
        }
    }
}
