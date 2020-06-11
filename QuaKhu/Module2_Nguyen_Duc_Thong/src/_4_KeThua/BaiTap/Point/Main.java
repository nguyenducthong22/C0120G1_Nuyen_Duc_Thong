package _4_KeThua.BaiTap.Point;

import java.util.Arrays;

public class Main {
    public static <point3D> void main(String[] args) {
        Point2D point2D=new Point2D(5,8);
        System.out.println(point2D.toString());
        Point3D point3D=new Point3D(5,9,6);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
        Point2D ten=new Point3D(6,9,8);
        ((Point3D) ten).setZ(6);
        System.out.println(ten.toString());

    }
}
