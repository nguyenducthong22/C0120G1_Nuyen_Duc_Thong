package _4_KeThua.ThucHanh.Hinh.HinhHoc;

public class Cricle extends Shape {
    private double radius=1.0;

    public Cricle(){
    }

    public Cricle(double radius){
        this.radius=radius;
    }

    public Cricle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public String toString(){
        return  "Circle with color is "+getColor()+" and "+isFilled()+"\n"+"Area is "+getArea()+"\n"+getPerimeter();
    }

}
