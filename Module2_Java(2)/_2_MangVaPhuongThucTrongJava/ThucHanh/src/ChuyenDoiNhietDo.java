import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double DoCSangDoF(double doC) {
        double doF=(9.0/5)*doC+32;
        return doF;
    }

    public static double DoFSangDoC(double doF) {
        double doC=(5.0 / 9) * (doF - 32);
        return doC;
    }

    public static void main(String[] args) {
        double doC;
        double doF;
        boolean check=false;

        do {
            System.out.println("Chuyen Doi nhiet do ");
            System.out.println("1.Do C sang do F");
            System.out.println("2.Do F sang do C");
            System.out.println("0.Exit");
            System.out.print("Nhap lua chon  : ");
            Scanner scanner=new Scanner(System.in);
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Nhap do C can chuyen doi : ");
                    doC=scanner.nextDouble();
                    System.out.println(DoCSangDoF(doC));
                    break;
                case "2":
                    System.out.println("Nhap do F can chuyen doi : ");
                    doF=scanner.nextDouble();
                    System.out.println(DoFSangDoC(doF));
                    break;
                case "0":
                    System.out.println("Exit !!!!");
                    check=true;
                    break;
                default:
                    System.out.println("Loi !!! Moi nhap lai !!!");
            }
            System.out.println("-----------------------------------");
        }while (!check);
    }
}
