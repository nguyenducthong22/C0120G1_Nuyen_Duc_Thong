package TrienKhaiInterfaceResizeable;

public class main {
    public static void main(String[] args) {
        Cricle cricle=new Cricle(5);
        System.out.println(cricle);
        cricle.resize(80);
        System.out.println();

        Rectangle rectangle=new Rectangle(5,9);
        System.out.println(rectangle);
        rectangle.resize(70);
        System.out.println();

        Square square=new Square(4);
        System.out.println(square);
        square.resize(50);


    }
}
