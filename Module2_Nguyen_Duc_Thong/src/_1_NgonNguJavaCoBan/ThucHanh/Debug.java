package _1_NgonNguJavaCoBan.ThucHanh;
import java.util.Scanner;
public class Debug {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat dang (ax+b=0)");
        double a,b,ketQua;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a : ");
        a= scanner.nextDouble();
        System.out.println("Nhap b : ");
        b= scanner.nextDouble();
        if (a!=0){
            if (b==0){
                System.out.print("x = 0");
            }
            else {
                ketQua=(-b)/a;
                System.out.print("x = "+ketQua);
            }
        }
        else {
            if (b==0){
                System.out.print("Phuong trinh co vo so nghiem ");
            }
            else {
                System.out.print("Phuong trinh khong co nghiem ");
            }
        }
    }
}
