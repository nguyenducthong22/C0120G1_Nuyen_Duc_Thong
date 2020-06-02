package Models;

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
    private String idContract;
    private String startDay;
    private String endDay;
    private double depositAmount;
    private double totalMoney;

    public Customer() {
    }

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

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String enDay) {
        this.endDay = enDay;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String showInformation() {
        if (this.getTypeService().equals("room")) {
            return "Customer" +
                    "\nName= " + Name +
                    "\nDate= " + Date +
                    "\ngender= " + gender +
                    "\npassPort= " + passPort +
                    "\nphoneNumber= " + phoneNumber +
                    "\nEmail= " + Email +
                    "\ntypeCustomer= " + typeCustomer +
                    "\naddress= " + address +
                    "\ntypeService= " + typeService;
        }else  {
             return "Customer" +
                    "\nName= " + Name +
                    "\nDate= " + Date  +
                    "\ngender= " + gender +
                    "\npassPort= " + passPort  +
                    "\nphoneNumber= " + phoneNumber  +
                    "\nEmail= " + Email  +
                    "\ntypeCustomer= " + typeCustomer  +
                    "\naddress= " + address  +
                    "\ntypeService= " + typeService+
                    "\nId Contract= " + idContract+
                    "\nStart Day= " +  startDay +
                    "\nEnd Day= " + endDay  +
                    "\nDeposit Amount= " + depositAmount  +
                    "\nTotal Money= " + totalMoney  ;
        }
    }
}