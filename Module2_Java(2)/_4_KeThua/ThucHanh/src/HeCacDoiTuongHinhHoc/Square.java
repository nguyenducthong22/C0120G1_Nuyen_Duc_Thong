package HeCacDoiTuongHinhHoc;

public class Square extends Shape {
    private  double size =1.0;

    public Square() {
    }

    public Square(String color, boolean fill, double size) {
        super(color, fill);
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea(){
        return this.size*this.size;
    }

    public double getPerimeter(){
        return 4*this.size;
    }

    @Override
    public String toString() {
        return "Square  : "+"\n"+
                "Color  : "+this.getColor()+" , fill "+this.isFill()+"\n"+
                "Size   : "+this.getSize()+"\n"+
                "Area   : "+this.getArea()+"\n"+
                "Perimeter : "+this.getPerimeter()
                ;
    }
}
