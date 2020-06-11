package _2_MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int doDai;
        double arr[];
        boolean check=true;
      do{
          System.out.print("Nhap do dai mang muon tao: ");
          doDai=scanner.nextInt();
          if (doDai<20&&doDai>0){
              check=false;
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
        daoNguoc(arr);
        }

        static double daoNguoc(double[]arr){
            double temp;
            for (int i=0;i<arr.length/2;i++){
                temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
            System.out.print( "Mang sau khi dao nguoc : ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "  ");
            }
            return 1;
        }
    }

