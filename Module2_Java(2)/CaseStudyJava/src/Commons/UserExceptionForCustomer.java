package Commons;

import java.util.Scanner;

public class UserExceptionForCustomer {
    private static Scanner scanner;
    public static boolean emailException(String value) {
        String regex = "^([\\w]+)\\@([A-z])+\\.([a-z])+$";
        return value.matches(regex);
    }

    private static final String FULL_NAME_PATTERN =
            "^^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$$";

    public static boolean nameException(String value) {
        if (value == null) return false;
        return value.matches(FULL_NAME_PATTERN);
    }

    public static boolean idCardException(String value) {
        String regex ="^([0-9]{3})(\\ )([0-9]{3})(\\ )([0-9]{3})$";
        return value.matches(regex);
    }

    public static boolean phoneException(String value) {
        String regex ="^(([0-9]{9})|([0-9]{9})|([0-9]{10})|([0-9]{11}))$";
        return value.matches(regex);
    }

    public static boolean birthdayException (String string){
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)([1][9][0-9][0-9]|(2)[0][0][0-2])$";
        return string.matches(regex);
    }

    public static boolean startDayException (String string){
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)([2-9][0-9][0-9][0-9])$";
        return string.matches(regex);
    }

    public static boolean endDayException (String string){
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)([2-9][0-9][0-9][0-9])$";
        return string.matches(regex);
    }
}
