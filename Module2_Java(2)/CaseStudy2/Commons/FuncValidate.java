package CaseStudy2.Commons;

import java.util.Scanner;

public class FuncValidate {
    private static Scanner scanner;
    private static String regex = "";

    public static boolean checkNameService(String string){
        regex ="^([A-Z][a-z]*)$";
        return string.matches(regex);
    }

    public static double checkValidNumberDouble(String content, String errMes) {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println(content);
                return scanner.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    public static int checkValidNumberInteger(String content, String errMes) {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println(content);
                return scanner.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }
    public static void main(String[] args) {
        checkValidNumberDouble("Enter double type", "wrong type");
    }
}