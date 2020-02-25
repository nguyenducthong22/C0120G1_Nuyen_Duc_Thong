package _2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int doDai;
        double arr[];
        boolean check=true;
        do{
            System.out.print("Nhap do dai mang muon tao: ");
            doDai=scanner.nextInt();
                check=false;
                if (doDai<20&&doDai>0){
            }else {
                System.out.print("Failed !!!(Up to 20 elements )");
            }
        }while (check);

        arr =new double[doDai];
        int i =0;
        while (i<doDai){
            System.out.print("Phan thu thu "+(i+1)+" : ");
            arr[i]=scanner.nextDouble();
            i++;
        }

        System.out.print("mang vua nhap : ");
        for (int j=0;j<doDai;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("");

        do {
            System.out.print("Ban muon thay doi phan tu thu : ");
            int stt = scanner.nextInt();
            if (stt < doDai && stt > 0) {
                System.out.print("Thay doi phan tu thu " + arr[stt-1] + " thanh : ");
                arr[stt-1] = scanner.nextDouble();
                System.out.print("mang vua nhap : ");
                for (int j = 0; j < doDai; j++) {
                    System.out.print(arr[j] + " ");
                    check=true;
                }
            } else {
                System.out.print("Failed !!!");
            }
        }while (check);
    }
}
