package _4_KeThua.BaiTap.HinhTru;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(5,8,"black");
        System.out.println( cylinder.toString());
        Circle circle=new Circle(5,"green");
        System.out.println( circle.toString());
        Circle cylinder1=new Cylinder();
        cylinder1.setColor("yellow");
        System.out.println(cylinder1.toString());
    }
}
