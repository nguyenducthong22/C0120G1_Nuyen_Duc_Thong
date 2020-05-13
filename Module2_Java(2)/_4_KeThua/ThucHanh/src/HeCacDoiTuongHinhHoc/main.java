package HeCacDoiTuongHinhHoc;

public class main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        System.out.println(cricle);
        System.out.println();

        Square square;
        square = new Square(2.3);
        System.out.println(square);
        System.out.println();

        square = new Square("yellow",false,2);
        System.out.println(square);
        System.out.println();

        Rectangle rectangle;
        rectangle=new Rectangle("black",false,5,6);
        System.out.println(rectangle);
    }
}
