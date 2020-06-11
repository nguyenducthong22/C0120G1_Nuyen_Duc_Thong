package _1_NgonNguJavaCoBan.ThucHanh;
import java.util.Scanner;
public class SoNgayCuaThang {
    public static void main(String[] args) {
        int month ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap thang ban muon biet so ngay : ");
        month=scanner.nextByte();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.print("Thang "+month+" co 31 ngay ");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.print("Thang "+month+" co 30 ngay ");
                break;
            case 2 :
                System.out.print("thang 2 co 28 hoac 29 ngay ");
                break;
            default:
                System.out.print("??????????????????? khong co ket qua khop voi : "+month+" ????????????????????");
        }
    }
}
