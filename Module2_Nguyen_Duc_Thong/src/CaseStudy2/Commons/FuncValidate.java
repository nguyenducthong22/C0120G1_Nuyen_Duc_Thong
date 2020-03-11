package CaseStudy2.Commons;

import java.util.Scanner;

public class FuncValidate {
    private static Scanner scanner;
    private static String regex = "";

    public static boolean checkIDService(int value ,String id) {
        if (value == 1) {
            regex="^([S])([V])([V])([L])([0-9]{4})$";
        } else if (value == 2) {
            regex ="^([S])([V])([H])([O])([0-9]{4})$";
        } else if (value == 3) {
            regex ="^([S])([V])([R])([O])([0-9]{4})$";
        }
        return id.matches(regex);
    }

    public static boolean checkNameService(String string){
        regex ="^([A-Z])([a-z]+)$";
        return string.matches(regex);
    }

    public static boolean checkArea(Double value) {
        return value >= 30;
    }
    public static boolean  checkCost(double value){
        return value >= 0;
    }
    public static boolean checkNumberPeople(int value){
        return (value > 0 && value < 20);
    }
    public static void checkTypeRent(){}
    public static boolean checkFloor(int value){
        return value >= 0;
    }

    public static boolean checkDateBorn(String string){
        regex = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
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