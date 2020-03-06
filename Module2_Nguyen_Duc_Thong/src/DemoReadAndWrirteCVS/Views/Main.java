package DemoReadAndWrirteCVS.Views;

import DemoReadAndWrirteCVS.Commons.FunFileCSV;
import DemoReadAndWrirteCVS.Models.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private  static  ArrayList<Student> listStudent = new ArrayList<>();
    private static ArrayList<Student> listStuden;

    public static void main(String[] args) {
displayMainMenu();
    }
    public static void displayMainMenu(){
        System.out.println("1. Add New Student " +
                "\n2. Show Information Student" +
                "\n3. Exit" +
                "\nPlease select function below : ");
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextLine()){
            case "1":
                addNewStudent();
                break;
            case "2":
                showInformation();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Failed ! Please choose again ! Enter to continue...");
                scanner.nextLine();
                displayMainMenu();
                break;
        }
    }

    private static void addNewStudent(){
        listStuden =FunFileCSV.readFileCSVToListStudent();
        Student student=new Student();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name student : ");
        student.setName(scanner.nextLine());
        System.out.println("Enter grade student : ");
        student.setGrade(scanner.nextLine());
        System.out.println("Enter Address student : ");
        student.setAddress(scanner.nextLine());
        listStudent.add(student);
        FunFileCSV.writeStudentToFileCSV(listStudent);
        System.out.println("Add New student complete !Enter to continue....");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showInformation(){
        listStudent=FunFileCSV.readFileCSVToListStudent();
        for (Student student: listStudent){
            System.out.println("-------------------");
            System.out.println("Name : "+student.getName());
            System.out.println("Grade : "+student.getGrade());
            System.out.println("Address : "+student.getAddress());
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter to continue ...");
        scanner.nextLine();
        displayMainMenu();
    }
}
