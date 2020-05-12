import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
        System.out.print("Nhap thang ban muon biet so ngay : ");
        String nhap= scanner.nextLine();
        switch (nhap){
            case "1":
                System.out.println("Thang 1 co 31 ngay !!!");
                break;
            case "2":
                System.out.println("Thang 2 co 28 ngay hoac 29 ngay !!!");
                break;
            case "3" :
                System.out.println("Thang 3 co 31 ngay !!!");
                break;
            case "4":
                System.out.println("Thang 4 co 30 ngay !!!");
                break;
            case "5":
                System.out.println("Thang 5 co 31 ngay !!!");
                break;
            case"6":
                System.out.println("Thang 6 co 30 ngay !!!");
                break;
            case "7":
                System.out.println("Thang 7 co 31 ngay !!!");
                break;
            case "8":
                System.out.println("Thang 8 co 31 ngay !!!");
                break;
            case "9":
                System.out.println("Thang 9 co 30 ngay !!!");
                break;
            case "10":
                System.out.println("Thang 10 co 31 ngay !!!");
                break;
            case "11":
                System.out.println("Thang 11 co 30 ngay !!!");
                break;
            case "12":
                System.out.println("Thang 12 co 31 ngay !!!");
                break;
            default:
                System.out.println("Khong hop le !!!");
        }
            System.out.println("------------------------------");
    }while (true);
    }
}
