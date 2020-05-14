package Triangle;

public class Triangle extends Shape{
    double size1=1.0;
    double size2=1.0;
    double size3=1.0;
    boolean checkTriangle=false;

    public void setCheckTriangle(boolean checkTriangle) {
        this.checkTriangle = checkTriangle;
    }

    public Triangle() {
    }

    public Triangle(String color, boolean fill, double size1, double size2, double size3) {
        super(color, fill);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea(){
        double p=0.0;
        p=(this.getSize1()+this.getSize2()+this.getSize3())/2;
        return  Math.pow(p*(p-this.getSize1())*(p-this.getSize2())*(p-this.getSize3()),0.5);
    }

    public double getPerimeter(){
        return this.getSize1()+this.getSize2()+this.getSize3();
    }

    public String toString(){
        if ((size1+size2>size3)&&(size1+size3>size2)&&(size3+size2>size1)){
            checkTriangle=true;
        }

        if (checkTriangle){
        return "Triangle { size1 = "+this.getSize1()+" , size2 = "+this.getSize2()+" ,size3 = "+this.getSize3()+" }"+"\n"+
                "Area = "+this.getArea()+"\n" +
                "Perimeter = "+this.getPerimeter();
        }else {
            return "size1 = "+this.getSize1()+" , size2 = "+this.getSize2()+" ,size3 = "+this.getSize3()+" khong phai do dai 3 canh cua tam giac";
        }
    }
}
