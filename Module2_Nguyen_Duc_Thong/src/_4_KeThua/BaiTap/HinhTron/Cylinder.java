package _4_KeThua.BaiTap.HinhTron;

public class Cylinder extends Circle{
    private double radius=1.0;
    private double height=1.0;
    String color="white";

    public Cylinder(){
    }

    public Cylinder(double radius,double height,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
