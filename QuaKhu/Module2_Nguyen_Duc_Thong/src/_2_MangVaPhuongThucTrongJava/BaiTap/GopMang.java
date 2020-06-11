package _2_MangVaPhuongThucTrongJava.BaiTap;

import javax.swing.*;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int doDai1;
        int doDai2;
        double []arr1;
        double []arr2;
        double []arr3;
        boolean check=false;

        do {
            System.out.print("Nhap chieu dai mang 1: ");
            doDai1=scanner.nextInt();
            if (doDai1<=20&&doDai1>0){
                check=true;
            }else {
                System.out.print("Khong qua 20 phan tu");
            }
        }while (!check);

        int i =0;
        arr1=new double[doDai1];
        while (i<doDai1){
            System.out.print("Phan thu thu "+(i+1)+" mang 1 : ");
            arr1[i]=scanner.nextDouble();
            i++;
        }

        System.out.print("mang 1 vua nhap : ");
        for (int j=0;j<doDai1;j++){
            System.out.print(arr1[j]+" ");
        }
        System.out.println("");


        boolean check2=false;
        do {
            System.out.print("Nhap chieu dai mang 2: ");
            doDai2=scanner.nextInt();
            if (doDai2<=20&&doDai2>0){
                check2=true;
            }else {
                System.out.print("Khong qua 20 phan tu");
            }
        }while (!check2);

        int i2=0;
        arr2=new double[doDai2];
        while (i2<doDai2){
            System.out.print("Phan thu thu "+(i2+1)+" mang 2 : ");
            arr2[i2]=scanner.nextDouble();
            i2++;
        }

        System.out.print("mang 2 vua nhap : ");
        for (int j=0;j<doDai2;j++){
            System.out.print(arr2[j]+" ");
        }
        System.out.println("");


        arr3=new double[doDai1+doDai2];
        for (int j=0;j<doDai1;j++){
            arr3[j]=arr1[j];
        }
        for (int j=doDai1;j<(doDai1+doDai2);j++){
            arr3[j]=arr2[j-doDai1];
        }
        System.out.print("Mang 3 bang mang 1 gop mang 2 : ");
        for (int j=0;j<arr3.length;j++){
            System.out.print(arr3[j]+" ");
        }
    }
}
