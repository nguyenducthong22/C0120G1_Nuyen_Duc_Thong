import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Giải phương trình bậc nhất (ax+b=0) : ");
        System.out.println("Nhap a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b : ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b != 0) {
                System.out.println("phương trình vô nghiệm !!!");
            }else {
                System.out.println("phương trình có vô số nghiệm !!!");
            }
        }else {
            System.out.println("phương trinh có nghiêm x = "+(-b)/a);
        }
            System.out.println("----------------------------------");
    }while (true);
    }
}