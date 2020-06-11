package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Hien thi cac so nguyen to nho hon 100 ");
        for ( int so = 2;so<=100;so++){
            int dem=0;
            for (int i=1;i<=so;i++){
                if  (so %i==0){
                    dem=dem+1;
                }
            }
           if (dem>2){
           }else {
               System.out.print(so+" ");
           }
        }
    }
}
