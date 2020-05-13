package HeCacDoiTuongHinhHoc;

public class Shape {
  private   String color="green";
  private boolean fill=true;

    @Override
    public String toString() {
        return "HeCacDoiTuongHinhHoc.Shape{" +
                "color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isFill() {
        if (fill){
            return ": fill";
        }else {
            return ": not fill";
        }
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public Shape() {
    }
}
