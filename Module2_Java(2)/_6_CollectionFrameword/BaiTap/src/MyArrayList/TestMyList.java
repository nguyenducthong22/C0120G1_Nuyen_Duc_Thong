package MyArrayList;

import java.util.Arrays;

public class TestMyList {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student student1=new Student(1,"quy");
        Student student2=new Student(2,"hon");
        Student student3=new Student(3,"cuc");
        Student student4=new Student(4,"lac");
        Student student5=new Student(5,"mmm");

        MyList<Student> studentMyList=new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);

        for (int i =0 ;i<studentMyList.size();i++){
            Student student= (Student) studentMyList.get(i);
            System.out.println(student.id);
            System.out.println(student.name);
         }
    }
}
