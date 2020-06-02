package Models;

public class Employee {
    private String id;
    private String name;
    private String Date;
    private String gender;
    private String passPort;
    private String phoneNumber;
    private String Email;
    private String academicLevel;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String name, String date, String gender, String passPort, String phoneNumber, String email, String academicLevel, String position, String salary) {
        this.name = name;
        Date = date;
        this.gender = gender;
        this.passPort = passPort;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassPort() {
        return passPort;
    }

    public void setPassPort(String passPort) {
        this.passPort = passPort;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String showInformation() {
        return "Employee" +
                "\nId= "+ id+
                "\nName= " + name  +
                "\nDate= " + Date  +
                "\ngender= " + gender +
                "\npassPort= " + passPort +
                "\nphoneNumber= " + phoneNumber  +
                "\nEmail= " + Email  +
                "\nacademicLevel= " + academicLevel  +
                "\nposition= " + position +
                "\nSalary= " + salary
                ;
    }
}
