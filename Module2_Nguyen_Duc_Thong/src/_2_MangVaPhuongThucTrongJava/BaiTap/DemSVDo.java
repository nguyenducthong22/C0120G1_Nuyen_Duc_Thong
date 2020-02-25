package _2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class DemSVDo {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        int doDai;
        double arr[];
        boolean check=true;
        int dem=0;
        do{
            System.out.print("Nhap so luong sinh vien : ");
            doDai=scanner.nextInt();
            if (doDai<=30&&doDai>0){
                check=false;
            }else {
                System.out.print("Failed !!!(Khong nhieu hon 30 sinh vien )");
            }
        }while (check);
        arr =new double[doDai];
        int i =0;
        while (i<doDai){
            System.out.print("Diem sinh vien thu "+(i+1)+" : ");
            arr[i]=scanner.nextDouble();
            i++;
        }

        for (int j =0;j<doDai;j++){
            if (arr[j]>=5&&arr[j]<=10){
             dem++;
            }
        }

        System.out.print("So luong sinh vien do la : "+dem);
    }
}
