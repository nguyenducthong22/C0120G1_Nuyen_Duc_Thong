package TrienKhaiInterfaceColorable;

public class Rectangle extends HinhHoc {
    private double x;
    private double y;

    public Rectangle(){
    };

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(String color, boolean filled, double x, double y) {
        super(color, filled);
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
        return this.x*this.y;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Dien tich : "+this.getArea();
    }
}
