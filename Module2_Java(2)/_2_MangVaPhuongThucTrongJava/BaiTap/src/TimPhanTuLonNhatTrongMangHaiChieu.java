import javax.swing.*;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        boolean check=false;
        int [][] array;
        Scanner sc=new Scanner(System.in);
        int row = 0;
        int colum=0;
        
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

        array = new int [row][colum];
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                array[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println("Mảng hiện taị là : ");
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

        int max= array[0][0];
        String viTri="";
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                    viTri = " dòng " + (i+1) + " cột " + (j+1) ;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : " + max + " . Có vị trí là: "+viTri);
    }
}