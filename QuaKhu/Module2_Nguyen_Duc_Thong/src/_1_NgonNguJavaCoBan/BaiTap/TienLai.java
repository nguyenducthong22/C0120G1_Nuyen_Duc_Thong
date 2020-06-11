package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class TienLai {
    public static void main(String[] args) {
        double soTien=0;
        int soThang=1;
        double laiSuat=1;
        System.out.println("Tinh tien !!!!!!!!!!!!!!!!!!!!!!");
        Scanner scanner=new Scanner(System.in);
        System.out.println("So tien goi : ");
        soTien = scanner.nextDouble();
        System.out.println("So thang goi : ");
        soThang = scanner.nextInt();
        System.out.println("Lai suat : ");
        laiSuat=scanner.nextDouble();
        double tongTien=0;
        for (int i =0;i<soThang;i++){
            tongTien=soTien*((laiSuat/100)/12)*3;
        }
        System.out.print("Tong lai nhan duoc khi goi "+soTien+" voi lai suat "+laiSuat+" trong "+soThang+" thang la : "+tongTien);
    }
}
