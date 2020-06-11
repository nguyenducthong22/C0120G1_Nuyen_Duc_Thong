package _4_KeThua.ThucHanh.Hinh.PointVaMoveablePoint;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Point point=new Point(2,8);
        System.out.println(point.toString());
        Movieablepoint movieablepoint=new Movieablepoint(4,3,5,8);
        System.out.println(Arrays.toString(movieablepoint.getSpeed()));
        System.out.println(movieablepoint.toString());
    }
}
