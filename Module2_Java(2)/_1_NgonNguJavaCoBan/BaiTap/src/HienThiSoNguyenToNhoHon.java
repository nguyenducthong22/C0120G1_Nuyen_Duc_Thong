import java.util.Scanner;

public class HienThiSoNguyenToNhoHon {
    public static void main(String[] args) {
        int nhap=0;
        boolean check=false;

        do {
            try {
                System.out.println("Nhap gioi han : ");
                Scanner scanner=new Scanner(System.in);
                nhap=scanner.nextInt();
                check=true;
            }catch (Exception e){
                System.out.println("Failed !!!");
            }
        }while (!check);

        for (int i=2;i<=nhap;i++){
        int dem=0;
            for (int j=1;j<=i;j++){
            if (i%j==0){
                dem=dem+1;
            }
            }
            if (dem>2){
            }else {
            System.out.println(i+" ");
            }
        }
    }
}
