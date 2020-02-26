package _2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuMang_coLoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int doDai;
        double[] array;
        do {
            System.out.print("Vui long cho biet so cac phan tu : ");
            doDai = scanner.nextInt();
            if (doDai < 20 && doDai > 0) {

                check = true;
            } else {
                System.out.print("Khong hop le !!!");
            }
        } while (!check);
        array = new double[doDai];
        int i = 0;
        do {
            System.out.print("Gia tri phan tu thu " + (i + 1) + " : ");
            array[i] = scanner.nextDouble();
            i++;
        } while (i < doDai);

        System.out.print("mang vua nhap : ");
        for (int j = 0; j < doDai; j++) {
            System.out.print(array[j] + " ");
        }

        boolean check2=false;
        double delete;
        do {
            int demDelete=0;
            System.out.print("Chon gia tri muon xoa: ");
            delete=scanner.nextDouble();
            for (int j=0;j<array.length-1;j++){
                if (delete==array[j]){
                        array[j]=array[j+1];
                        demDelete++;
                }
            }
            if (demDelete==0){
                System.out.println("Khong co gia tri nay tong mang ");
            }
            System.out.print("mang vua nhap : ");
            for (int l = 0; l < doDai-demDelete; l++) {
                System.out.print(array[l] + " ");
            }
        }while (!check2);
    }
}
