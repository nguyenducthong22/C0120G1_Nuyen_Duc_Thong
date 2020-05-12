import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
        boolean check= false;
        System.out.println("Nhap nam can kiem tra : ");
        int year = scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    check=true;
                }
            }else {
                check=true;
            }
        }
        if (check){
            System.out.printf("%d la nam nhuan  ",year );
        }else {
            System.out.printf("%d khong phai nam nhuan ",year);
        }
        System.out.println();
        System.out.println("-------------------------------");
    }while (true);
    }
}
