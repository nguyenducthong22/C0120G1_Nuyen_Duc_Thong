import javax.swing.*;
import java.util.Scanner;

public class TinhTongCua1Cot {
    public static void main(String[] args) {
        boolean check=false;
        double [][] array;
        Scanner sc=new Scanner(System.in);
        int row = 0;
        int colum=0;
        double nhap=0;
        int cotTinhTong=0;

        do {
            try {
                System.out.print("Nhập độ dài row: ");
                row = sc.nextInt();
                check=true;
            }catch (Exception e){
                System.out.println("Khong hop le !!!");
            }
        }while (!check);

        check=false;
        do {
            try {
                System.out.print("Nhập độ dài colum: ");
                colum=sc.nextInt();
                check=true;
            }catch (Exception e){
                System.out.println("Khong hop le");
            }
        }while (!check);

        array = new double [row][colum];


        String viTri="";
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                check=false;
                do {
                    try {
                        System.out.println("Nhap gia tri cho dong "+(i+1)+" cot "+(j+1)+" : ");
                        Scanner scanner =new Scanner(System.in);
                        nhap=Integer.parseInt(scanner.nextLine());
                        array[i][j]=nhap;
                        check=true;
                    }catch (Exception e){
                        System.out.println("Khong hop le !!!");
                    }
                }while (!check);
            }
         }

        System.out.println("Mang 2 chieu vua nhap : ");
        for (int i=0 ;i<row;i++){
            for (int j=0;j<colum;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }

        check=false;
        double tongCot=0;
        do {
            try {
                System.out.println("Nhap cot muon tinh tong : ");
                Scanner scanner=new Scanner(System.in);
                cotTinhTong=Integer.parseInt(scanner.nextLine());
                if (cotTinhTong>0&&cotTinhTong<=colum){
                    for (int i=0;i<=colum;i++){
                        tongCot+=array[i][cotTinhTong-1];
                    }
                    check=true;
                }else {
                    System.out.println("Khong hop le !!!");
                }
            }catch (Exception e){
                System.out.println("Khong hop le ");
            }
            }while (!check);

        System.out.println("Tong cua cot "+cotTinhTong+" = "+tongCot);
        }
}


