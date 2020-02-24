package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class ChiSoBMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the weight : ");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();
        double BMI = weight/(Math.pow(height,2));
        if (BMI<18.5){
            System.out.println("Underweight");
        }else if (BMI<25) {
            System.out.println("Normal");
        }else if (BMI<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
