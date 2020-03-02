package _5_AbstractAndInterface.BaiTap.TrienKhaiInterfaceResizeable;

public class main {
    public static void main(String[] args) {
        Cricle cricle=new Cricle(5);
        cricle.resize(80);
        Rectangle rectangle=new Rectangle(5,9);
        rectangle.resize(70);
        Square square=new Square(4);
        square.resize(50);
    }
}
