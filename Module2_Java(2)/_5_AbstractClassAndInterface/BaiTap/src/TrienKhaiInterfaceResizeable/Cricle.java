package TrienKhaiInterfaceResizeable;

public class Cricle implements Resizeable{
    private double radius;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius* Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double resize(double percent) {
        double area=this.getArea()*percent/100;
        System.out.println( "Dien tich ban dau : "+this.getArea()+
                "\n"+"Dien tich sau khi thay doi : "+area);
        return area;
    }

}
