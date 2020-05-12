import java.util.InputMismatchException;
import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        boolean checkA=false;
        boolean checkB=false;
        int a=0;
        int b=0;

        System.out.println("Uoc chung lon nhat cua a va b");

       do {
           try {
               Scanner scanner=new Scanner(System.in);
               System.out.println("Nhap a : ");
                a = scanner.nextInt();
                checkA=true;
           }catch (Exception e){
               System.out.println("Vui long nhap a so nguyen !!!");
           }
       }while (!checkA);

        do {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Nhap b : ");
                 b = scanner.nextInt();
                 checkB=true;
            }catch (Exception e){
                System.out.println("Vui long nhap b so nguyen !!!");
            }
        }while (!checkB);

        System.out.print("UCLN cua "+a+" va "+b +" : ");
        if (a==0||b==0){
            System.out.println("khong tim duoc uoc chung khi a hoac b bang 0 !!!");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}
