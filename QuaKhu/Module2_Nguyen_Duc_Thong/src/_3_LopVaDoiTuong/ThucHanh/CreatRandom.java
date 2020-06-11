package _3_LopVaDoiTuong.ThucHanh;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
class CreatRandom {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu muon tim : ");
        try {
            int nhap=scanner.nextInt();
            CreatRandom creatRandom=new CreatRandom();
            Integer[] arr =creatRandom.createRandom();
            System.out.println("");
            int dem=0;

            for(int i =0;i<arr.length;i++){
                if (nhap==arr[i]){
                    System.out.println("So "+nhap+" o vi tri thu "+(i+1));
                    dem++;
                }
            }

            if (dem==0){
                System.out.println("Khong co gia tri nay");
            }

        }catch (InputMismatchException e){
            System.out.println("khong hop le ! ");
        }
    }
}
