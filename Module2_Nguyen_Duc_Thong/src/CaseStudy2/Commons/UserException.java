package CaseStudy2.Commons;

import java.util.Scanner;

public class UserException {
    private static Scanner scanner;
    public static boolean emailException(String value) {
        String regex = "^([\\w]+)\\@([A-z])+\\.([a-z])+$";
        return value.matches(regex);
    }

    public static boolean genderException(String value) {
        String a="male", b="female",c="unknow";
        return (value.matches(a) || value.matches(b) || value.matches(c));
    }
    private static final String FULL_NAME_PATTERN =
            "^^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$$";

    public static boolean nameException(String value) {
        if (value == null) return false;
        return value.matches(FULL_NAME_PATTERN);
    }

    public static boolean idCardException(String value) {
        String regex ="^([0-9]+)$";
        return value.matches(regex);
    }

    public static boolean birthdayException (String string){
        String regex = "^\\d\\d\\d\\d-(0?[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])$";
        return string.matches(regex);
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
}