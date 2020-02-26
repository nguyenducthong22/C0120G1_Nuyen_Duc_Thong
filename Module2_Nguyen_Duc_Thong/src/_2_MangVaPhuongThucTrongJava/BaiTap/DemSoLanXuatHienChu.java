package _2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienChu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String kiTu;
        String nhap;
        int dem=0;
        System.out.print("Nhap chuoi ki tu : ");
        nhap=scanner.nextLine();
        String[] arr;
        arr=new String[nhap.length()];
        for (int i=0;i<nhap.length();i++){
            nhap.charAt(i);
        }
        System.out.print("Nhap ki tu muon dem so lan xuat hien : ");
        kiTu=scanner.nextLine();
        for (int i=0;i<nhap.length();i++){
            if (arr[i].equals(kiTu)){
                dem++;
            }
        }
        System.out.print("trong chuoi "+nhap+" co "+dem+" ki tu "+kiTu);
    }
}
