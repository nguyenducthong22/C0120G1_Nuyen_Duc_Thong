package _1_NgonNguJavaCoBan.ThucHanh;
import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students={"Tan","Hung","Hoa","Tien","Hungf","Thong","Quoc"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student: ") ;
        String input_name =  sc.nextLine();
        boolean inExist=false;
        for (int i =0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the student int the list "+ input_name+" is : "+(i+1));
                inExist=true;
                break;
            }
        }
    }
}
