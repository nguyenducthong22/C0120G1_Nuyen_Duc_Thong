import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {

        System.out.println("Kiem Tra So Nguyen To ");
        System.out.println("Nhap so can kiem tra : ");
        float nhap =scanner.nextFloat();
        if (nhap<2){
            System.out.println(nhap+" khong phai so nguyen to ");
        }else {
            int i=2;
            boolean check =true;
            while (i<=Math.sqrt(nhap)){
                if (nhap%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(nhap+" la so nguyen to");
            }else {
                System.out.println(nhap+" khong phai la so nguyen to ");
            }
        }
            System.out.println("------------------------------");
    }while (true);
    }
}
