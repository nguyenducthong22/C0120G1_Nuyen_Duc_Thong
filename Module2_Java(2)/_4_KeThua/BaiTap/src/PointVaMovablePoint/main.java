package PointVaMovablePoint;

public class main {
    public static void main(String[] args) {
        Point point=new Point(5,9);
        System.out.println(point);
        System.out.println();

        MovablePoint movablePoint=new MovablePoint(5,6,3,5);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
