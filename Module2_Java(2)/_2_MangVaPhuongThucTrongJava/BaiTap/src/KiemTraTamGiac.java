import java.time.Year;
import java.util.Scanner;

public class KiemTraTamGiac {
    public static boolean IllegalTriangleException(double a,double b,double c){
        boolean checkTamGiac;

            if ((a + b > c) && (a + c > b) && (b + c > a)){
                checkTamGiac=true;
            }else {
                checkTamGiac=false;
            }
            if (checkTamGiac){
                System.out.println("a= "+a+" , b= "+b+" , c= "+c+" la do dai 3 canh cua 1 tam giac ");
            }else {
                System.out.println("a= "+a+" , b= "+b+" , c= "+c+" khong phai la do dai 3 canh cua 1 tam giac ");
            }
        System.out.println("----------------------------------");

            return checkTamGiac;
    }
    public static void main(String[] args) {
        double a=0;
        double b=0;
        double c=0;
        boolean check=false;

        System.out.println("Kiem tra a,b,c co phai la do dai 3 canh cua 1 tam giac ");
        do {
            try {
            System.out.println("Nhap a : ");
            Scanner scanner=new Scanner(System.in);
            a=Integer.parseInt(scanner.nextLine());
            if (a<=0){
                System.out.println("Khong hop le !!!");
            }else {
                check = true;
            }
        }catch (Exception e){
                System.out.println("Khong hop le !!! Moi nhap lai !!!");
            }
        }while (!check);

        check=false;
        do {
            try {
                System.out.println("Nhap b : ");
                Scanner scanner=new Scanner(System.in);
                b=Integer.parseInt(scanner.nextLine());
                if (a<=0){
                    System.out.println("Khong hop le !!!");
                }else {
                    check = true;
                }
            }catch (Exception e){
                System.out.println("Khong hop le !!! Moi nhap lai !!!");
            }
        }while (!check);

        check=false;
        do {
            try {
                System.out.println("Nhap c : ");
                Scanner scanner=new Scanner(System.in);
                c=Integer.parseInt(scanner.nextLine());
                if (a<=0){
                    System.out.println("Khong hop le !!!");
                }else {
                    check = true;
                }
            }catch (Exception e){
                System.out.println("Khong hop le !!! Moi nhap lai !!!");
            }
        }while (!check);

        IllegalTriangleException(a,b,c);


    }
}

