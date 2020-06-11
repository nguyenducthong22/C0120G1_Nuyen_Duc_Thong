package CaseStudy.Commons;

import java.util.Scanner;

public class FunValidation {
    private static String regex="";
    private static Scanner sc;

    public static boolean checkName(String string){
        regex="^([A-Z][a-z]*)\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$|^([A-Z][a-z]*)\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*\\ [A-Z][a-z]*$";
        return  string.matches(regex);
    }

    public static boolean checkEmail(String string){
        regex="^([\\w]+)\\@([a-z]+)\\.([a-z]+)$";
        return  string.matches(regex);
    }

    public static boolean checkBirthDay(String string){
        Double.parseDouble(string);
        regex="^((0)[1-9]|[12][0-9]|(3)[01])(\\/)((0)[1-9]|(1)[0-2])(\\/)(([1][9][0-9]{2}))|([2][0][01][0-9])$";
        return  string.matches(regex);
    }

    public static String checkGender(){
       do {
           sc=new Scanner(System.in);
           System.out.println("Enter Gender(male,female,unknown) : ");
           String gender =sc.nextLine();
            gender= gender.toLowerCase();
            if (gender.equals("male")||gender.equals("female")||gender.equals("unknown")){
                return gender;
            }else {
                System.out.println("Gender is invalid !");
            }
       }while (true);
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

