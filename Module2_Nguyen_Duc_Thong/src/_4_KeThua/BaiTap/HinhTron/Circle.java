package _4_KeThua.BaiTap.HinhTron;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle " + "\n" + "Color is " + this.getColor() + " and radius is " + this.getRadius() + "\n" + "Area is " + this.getArea();
    }
}

