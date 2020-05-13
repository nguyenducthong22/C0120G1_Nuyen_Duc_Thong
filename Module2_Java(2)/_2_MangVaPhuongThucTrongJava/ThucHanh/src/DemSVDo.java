

import java.util.Scanner;

public class DemSVDo {
    public static void main(String[] args) {
        int doDai;
        double arr[];
        boolean check=false;
        int dem=0;
        do{
            System.out.print("Nhap so luong sinh vien : ");
            Scanner scanner=new Scanner(System.in);
            doDai=scanner.nextInt();
            if (doDai<=30&&doDai>0){
                check=true;
            }else {
                System.out.print("Failed !!!(Khong nhieu hon 30 sinh vien )");
            }
        }while (!check);

        arr =new double[doDai];
        int i =0;
        double nhapDiem=0;
        check=false;
        while (i<doDai){
            do {
                try {
                    System.out.print("Diem sinh vien thu " + (i + 1) + " : ");
                    Scanner scanner=new Scanner(System.in);
                    nhapDiem = scanner.nextDouble();
                    if (nhapDiem <= 10 && nhapDiem >= 0) {
                        arr[i] = nhapDiem;
                        i++;
                        check = true;
                    } else {
                        System.out.println("Khong hop le !!! Diem trong khoang tu 0 den 10 !!!");
                    }
                }catch (Exception e){
                    System.out.println("Khong hop le !!! Vui long nhap lai !!!");
                }
        }while (!check);
        }


        for (int j =0;j<doDai;j++){
            if (arr[j]>=5&&arr[j]<=10){
                dem++;
            }
        }

        System.out.print("So luong sinh vien do la : "+dem);
    }
}
