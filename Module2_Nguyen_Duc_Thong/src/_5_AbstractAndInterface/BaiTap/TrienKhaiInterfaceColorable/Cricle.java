package _5_AbstractAndInterface.BaiTap.TrienKhaiInterfaceColorable;

public class Cricle extends HinhHoc {
    private double x;
    public Cricle() {
    }

    public Cricle(double x){
    this.x=x;
    }

    public Cricle(double x, String color, boolean filled) {
        super( color, filled);
        this.x=x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.getX(),2);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Dien tich : "+this.getArea() ;
    }
}
