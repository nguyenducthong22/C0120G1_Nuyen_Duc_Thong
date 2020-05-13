package CircleAndCylinder;

public class Cylinder extends Circle {
private double height=1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.getRadius()*this.getHeight()*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder : "+" , color "+this.getColor()+"\n"+
                "Radius : "+this.getRadius()+"\n"+
                "Area   : "+this.getArea()+"\n"+
                "Perimeter : "+this.getPerimeter();
    }
}
