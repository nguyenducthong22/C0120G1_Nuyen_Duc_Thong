package HeCacDoiTuongHinhHoc;

public class Cricle extends Shape {
    private double radius=1.0;

    public Cricle() {
    }

    public Cricle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
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
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return  "Circle : "+"\n"+
                "Color  : "+this.getColor()+" , fill "+this.isFill()+"\n"+
                "Radius : "+this.getRadius()+"\n"+
                "Area   : "+this.getArea()+"\n"+
                "Perimeter : "+this.getPerimeter()
                ;
    }
}
