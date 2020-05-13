package HeCacDoiTuongHinhHoc;

public class Rectangle extends Shape {
    private double width=1.0;
    private double height=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean fill, double width, double height) {
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    @Override
    public String toString() {
        return "Rectangle : "+"\n"+
                "Color    : "+this.getColor()+" , fill "+this.isFill()+"\n"+
                "Height   : "+this.getHeight()+"\n"+
                "Width    : "+this.getWidth()+"\n"+
                "Area     : "+this.getArea()+"\n"+
                "Perimeter: "+this.getPerimeter()
                ;
    }

}
