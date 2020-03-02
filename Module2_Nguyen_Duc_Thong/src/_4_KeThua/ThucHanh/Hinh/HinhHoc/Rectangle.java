package _4_KeThua.ThucHanh.Hinh.HinhHoc;

public class Rectangle  extends Shape {
    private double width=1.0;
    private double height=1.0;

    public Rectangle(){
    }

    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }

    public Rectangle(double width,double height,String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getArea(){
        return  this.height*this.width;
    }

    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    public String toString(){
        return  super.toString()+"\n"+"Width : "+this.getWidth()+"\n"+"Height : "+this.getHeight()+"\n"+"Area: "+this.getArea()+"\n"+"Perimeter : "+this.getPerimeter();
    }
}
