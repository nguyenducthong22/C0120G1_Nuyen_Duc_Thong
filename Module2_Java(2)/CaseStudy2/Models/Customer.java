package CaseStudy2.Models;

public class Customer {
    private String Name;
    private String Date;
    private String gender;
    private String passPort;
    private String phoneNumber;
    private String Email;
    private String typeCustomer;
    private String address;
    private String typeService;

    public Customer(String name, String date, String gender, String passPort, String phoneNumber, String email, String typeCustomer, String address, String typeService) {
        Name = name;
        Date = date;
        this.gender = gender;
        this.passPort = passPort;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.typeService = typeService;
    }
    public Customer() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String isGender() {
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

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeService() {
        return typeService;
    }


    public String showInformation() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Date='" + Date + '\'' +
                ", gender=" + gender +
                ", passPort='" + passPort + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", typeService=" + typeService +
                '}';
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }



}