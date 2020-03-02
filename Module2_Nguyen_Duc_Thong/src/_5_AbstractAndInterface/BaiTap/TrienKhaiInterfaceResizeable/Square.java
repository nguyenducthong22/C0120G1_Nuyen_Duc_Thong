package _5_AbstractAndInterface.BaiTap.TrienKhaiInterfaceResizeable;

public class Square implements Resizeable {
    private double x;

    public Square() {
    }

    public Square(double x) {
        this.x=x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getArea(){
        return  this.x*this.x;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                '}';
    }

    @Override
    public double resize(double percent) {
       double area= this.getArea()*percent/100;
        System.out.println( "Dien tich ban dau : "+this.getArea()+
                "\n"+"Dien tich sau khi thay doi : "+area);
        return area;
    }
}
