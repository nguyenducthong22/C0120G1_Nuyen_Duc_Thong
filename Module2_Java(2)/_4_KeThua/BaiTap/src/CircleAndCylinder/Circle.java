package CircleAndCylinder;

public class Circle {
    private String color="green";
    private double radius=1.0;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Circle "+"\n"+
                "Color "+this.getColor()+"\n"+
                "Radius : "+this.getRadius()+"\n"+
                "Area   : "+this.getArea()+"\n"+
                "Perimeter : "+this.getPerimeter();
    }
}
