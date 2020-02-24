package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ban muon hien thi bao nhieu so nguyen to ?");
        System.out.print("So so nguyen to muon hien thi : ");
        int nSo=scanner.nextInt();
        int layNSo=2;
        int n=1;
        while (layNSo<=nSo){
            n++;
            int dem=0;
            for (int i =1;i<=n;i++){
                if (n % i==0){
                    dem++;
                }
            }
            if (dem>2){
            }else {
                System.out.print(n+" ");layNSo++;
            }
        }
    }
}
