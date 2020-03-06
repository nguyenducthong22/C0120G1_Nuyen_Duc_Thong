package CaseStudy.Commons;

import java.util.Scanner;

public class FunValidation {
    private static String regex="";
    private static Scanner sc;

    public static boolean checkNameService(String string){
        regex="^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$";
        return  string.matches(regex);
    }

    public static boolean checkString(String string){
        regex="^[A-Z][a-z]*$";
        return string.matches(regex);
    }

    public static double checkValidNumberDouble(String content,String errMes){
        boolean err=false;
        while (true ){
            try {
                sc=new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            }catch (Exception ex){
                System.out.println(errMes);
            }
        }
    }

    public static Integer checkValidNumberInteger(String content,String errMes){
        boolean err=false;
        while (true ){
            try {
                sc=new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            }catch (Exception ex){
                System.out.println(errMes);
            }
        }
    }
}

