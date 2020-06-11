package _2_MangVaPhuongThucTrongJava.ThucHanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
chuyenDoi();
    }
    static double chuyenDoi(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ban muon chuyen doi nhiet do nao ? (C hay F ): ");
        String chon = scanner.nextLine();
        System.out.print("Nhap do "+chon+" muon quy doi: ");
        double nhap=scanner.nextDouble();
        double result=0;
        if (chon.equals("c")|chon.equals("C")){
            result=(nhap+32)*9/5;
            System.out.print(nhap +" do C tuong duong "+result+" do F");
        }else if (chon.equals("f")|chon.equals("F")){
            result =5/9*nhap-32;
            System.out.println(nhap +" do F tuong duong "+result+" do C");
        }else {
            System.out.println("Failed !!!");
        }
        return result;
    }
}
