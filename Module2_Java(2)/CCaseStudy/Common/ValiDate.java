package CCaseStudy.Common;

import static CCaseStudy.Controller.MainController.sc;

public class ValiDate {
    public static  String checkString(String regex, String errorMess) {
        while (true) {
            String input= sc.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
    public static int checkInterger(String regex,String errorMess){
        while (true) {
            int input= sc.nextInt();
            if ((input+"").matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
    public static double checkDouble(String regex,String errorMess){
        while (true) {
            double input= sc.nextDouble();
            if (((int)(input)+"").matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
    public static  String checkStringLowerCase(String regex, String errorMess) {
        while (true) {
            String input= sc.nextLine();
            if (input.matches(regex)) {
                return input.toLowerCase();
            } else {
                System.out.println(errorMess);
            }
        }
    }
}
