package MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public Student() {
            }

            public int Id() {
                return id;
            }

            public void Id(int id) {
                this.id = id;
            }

            public String Name() {
                return name;
            }

            public void Name(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<Student>();
        Student student1=new Student(1,"Cuoi");
        Student student2=new Student(2,"Hac");
        Student student3=new Student(3,"Thang");
        Student student4=new Student(4,"Thien");
        Student student5=new Student(5,"mmmmmm");

        myLinkedList.addFirst(student1);
        myLinkedList.add(0,student2);
        myLinkedList.add(1,student3);
        myLinkedList.add(2,student4);
        myLinkedList.addLast(student5);
        myLinkedList.remove(2);


            Student student= (Student) myLinkedList.get(0);
            System.out.println(student.id);
            System.out.println(student.name);
        }
    }

