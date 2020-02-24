package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap nam kiem tra : ");
        int nhap = scanner.nextInt();
        boolean check =false;
        if (nhap%4==0){
            if (nhap%100==0){
                if(nhap%400==0){
                    check=true;
                }
            }else {check=true;}
        }

        if (check){
            System.out.print("Nam "+nhap+" la nam nhuan ");
        }else {
            System.out.print("Nam "+nhap+" khong phai la nam nhuan ");
        }
    }
}

