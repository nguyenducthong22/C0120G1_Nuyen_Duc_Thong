package _1_NgonNguJavaCoBan.ThucHanh;
import java.util.Scanner;
public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width=scanner.nextFloat();
        System.out.println("Enter the height: ");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.print("Area: "+area);
    }
}
