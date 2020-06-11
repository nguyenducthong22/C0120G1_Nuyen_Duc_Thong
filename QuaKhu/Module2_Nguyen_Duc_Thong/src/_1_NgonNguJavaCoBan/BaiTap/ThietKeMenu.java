package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class ThietKeMenu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1.Draw the triangle ");
        System.out.println("2.Draw the square ");
        System.out.println("3.Draw the rectangle ");
        System.out.println("0.Exit");
        boolean check=false;
        do {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 3:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 0:
                    System.out.print("End !!!");
                    check=true;
                    break;
                default:
                    System.out.println("Your choice is invalid ! ");
                    break;
            }
        }while (!check);
    }
}
