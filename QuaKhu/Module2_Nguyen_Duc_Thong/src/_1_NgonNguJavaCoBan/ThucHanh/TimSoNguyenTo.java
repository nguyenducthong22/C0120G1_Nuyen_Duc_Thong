package _1_NgonNguJavaCoBan.ThucHanh;
import java.util.Scanner;
public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so can kiem tra : ");
        int so =scanner.nextInt();
        if (so<2){
            System.out.print("So "+so+" khong phai so nguyen to ");
        }
        else {
            boolean check = true;
            for ( int i=2; i<=(so/2);i++){
                if (so%i==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.print("So "+so+" la so nguyen to ");
            }
            else {System.out.print("So "+so+" khong phai so nguyen to ");}
        }
    }
}
