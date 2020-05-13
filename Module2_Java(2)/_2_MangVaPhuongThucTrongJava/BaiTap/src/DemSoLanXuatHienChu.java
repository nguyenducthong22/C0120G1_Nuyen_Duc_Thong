

import java.util.Scanner;

public class DemSoLanXuatHienChu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char kiTu;
        String nhap;
        int dem=0;
        System.out.print("Nhap chuoi ki tu : ");
        nhap=scanner.nextLine();
        System.out.print("Nhap ki tu muon dem so lan xuat hien : ");
        kiTu=scanner.nextLine().charAt(0);
        for (int i=0;i<nhap.length();i++){
            if (nhap.charAt(i)==kiTu){
                dem++;
            }
        }
        System.out.print("trong chuoi "+nhap+" co "+dem+" ki tu "+kiTu);
    }
}
