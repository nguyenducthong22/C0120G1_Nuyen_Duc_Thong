package _5_AbstractAndInterface.BaiTap.TrienKhaiInterfaceResizeable;

public class Rectangle implements Resizeable{
    private double x;
    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea(){
        return this.x*this.y ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
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
