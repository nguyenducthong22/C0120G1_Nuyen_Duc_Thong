package _4_KeThua.ThucHanh.Hinh;

import _4_KeThua.ThucHanh.Hinh.Shape;

public class Square extends Shape {
    private double size=1.0;
    public Square(){
    }

    public Square(double size){
        this.size=size;
    }

    public Square(double size,String color,boolean filled){
        super(color,filled);
        this.size=size;
    }

    public double getSize(){
        return this.size;
    }

    public void setSize(double size){
        this.size=size;
    }

    public double getArea(){
        return this.size*this.size;
    }

    public  double getPerimeter(){
        return this.size*4;
    }

    public String toString(){
        return super.toString()+"\n"+"Size = "+this.getSize()+"\n"+"Area = "+this.getArea()+"Perimeter = "+this.getPerimeter();
    }
}
