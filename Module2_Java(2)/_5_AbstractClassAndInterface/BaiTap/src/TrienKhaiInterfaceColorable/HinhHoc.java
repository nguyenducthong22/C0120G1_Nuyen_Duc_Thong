package TrienKhaiInterfaceColorable;

public class HinhHoc {
    private String color;
    private boolean filled;

    public HinhHoc() {
    }

    public HinhHoc( String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "HinhHoc{" +
                " color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
