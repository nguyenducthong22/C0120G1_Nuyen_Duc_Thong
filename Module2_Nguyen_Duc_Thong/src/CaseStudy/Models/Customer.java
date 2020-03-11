package CaseStudy.Models;

public class Customer {
    private String id;
    private String name;
    private String gender;
    private int idCard;
    private int phone;
    private String email;
    private String type;
    private String address;
    private String birthDay;

    public Customer() {
    }

    public Customer(String id, String name, String gender, int idCard, int phone, String email, String type, String address, String birthDay) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.address = address;
        this.birthDay = birthDay;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Customer" +"\n"+
                "id='" + id + "\n"+
                ", name='" + name +"\n"+
                ", gender='" + gender +"\n"+
                ", idCard=" + idCard +"\n"+
                ", phone=" + phone +"\n"+
                ", email='" + email +"\n"+
                ", type='" + type +"\n"+
                ", address='" + address +"\n"+
                ", birthDay='" + birthDay
                ;
    }
}
