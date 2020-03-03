package _5_AbstractAndInterface.BaiTap.TrienKhaiInterfaceColorable;

public class Square extends HinhHoc implements Colorable {
    @Override
    public String howtoColor() {
       return "to mau ca 4 mat";
    }

    private double x;

    public Square(){
    }

    public Square(double x) {
        this.x = x;
    }

    public Square(String color, boolean filled, double x) {
        super(color, filled);
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getArea(){
        return this.x*this.x;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Dien Tich : "+this.getArea();
    }
}
