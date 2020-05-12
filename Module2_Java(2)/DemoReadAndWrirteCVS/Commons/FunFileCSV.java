package DemoReadAndWrirteCVS.Commons;

import DemoReadAndWrirteCVS.Models.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR="\n";
    private static final String FILE_HEADER_STUDENT="name,grade,address";
    private static final String fileNameStudent="src/DemoReadAndWrirteCVS/Data/Student.csv";

    public static void writeStudentToFileCSV(ArrayList<Student> listStudent){
        FileWriter fileWriter=null;
        try {
            fileWriter =new FileWriter(fileNameStudent);
            fileWriter.append(FILE_HEADER_STUDENT);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Student student:listStudent){
                fileWriter.append(student.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getGrade());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception e){
            System.out.println("Error !!!");
        }finally {
            try {
                fileWriter.flush();//Xoa bo nho dem //
                fileWriter.close();//Dong luong //
            }catch (Exception ex){
                System.out.println("Error !!!!");
            }
        }
    }

    public static ArrayList<Student> readFileCSVToListStudent(){
        BufferedReader br =null;
        ArrayList<Student> listStudent = new ArrayList<>();
        Path path= Paths.get(fileNameStudent);
        if (!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileNameStudent);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
            String line ;
            br =new BufferedReader(new FileReader(fileNameStudent));

            while ((line=br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")){
                    continue;
                    // bo qua dong tieu de
                }
                Student student=new Student();
                student.setName(splitData[0]);
                student.setGrade(splitData[1]);
                student.setAddress(splitData[2]);
                listStudent.add(student);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return  listStudent;
    }
}
