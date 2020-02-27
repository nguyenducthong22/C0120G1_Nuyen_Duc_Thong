package _4_KeThua.ThucHanh.Hinh;

public class main {
    public static void main(String[] args) {
        Shape cricle = new Cricle(5,"blue",false);
        System.out.println(cricle.toString());
        Shape rectangle=new Rectangle(5,6,"pink",true);
        System.out.println(rectangle.toString());
        Shape square=new Square(5,"brown",true);
        System.out.println(square.toString());
        System.out.println(cricle.getColor());
    }
}
