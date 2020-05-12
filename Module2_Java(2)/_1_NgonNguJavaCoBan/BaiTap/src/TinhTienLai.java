import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        int month=0;
        double money=0;
        double interset_rate=0;
        double total_interset=0;
        boolean check =false;

        do {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("So tien goi : ");
                money=scanner.nextDouble();
                check=true;
            }catch (Exception e){
                System.out.println("Failed !!! Vui long nhap lai !!!");
            }
        }while (!check);

        check=false;
        do {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("So thang goi : ");
                month=scanner.nextInt();
                if (month>12||month<1){
                    System.out.println("Failed !!! Vui long nhap lai !!!");
                }else {
                    check = true;
                }
            }catch (Exception e){
                System.out.println("Failed !!! Vui long nhap lai !!!");
            }
        }while (!check);

        check =false;
        do {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Lai suat : ");
                interset_rate=scanner.nextDouble();
                if (interset_rate<=0){
                    System.out.println("Failed !!! Vui long nhap lai !!!");
                }else {
                check=true;
                }
            }catch (Exception e){
                System.out.println("Failed !!! Vui long nhap lai !!!");
            }
        }while (!check);

        total_interset=money;
        for (int i=0;i<month;i++){
            total_interset=total_interset+total_interset*(interset_rate/100);
        }

        System.out.println("Tong tien nhan duoc khi goi "+money+" trong "+month+" thang voi lai suat "+interset_rate+" la : "+total_interset);
    }
}
