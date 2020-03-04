package Demo;

public class Employee extends Class {
    private double Salary;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, double salary, String address) {
        super(id, name);
        Salary = salary;
        this.address = address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String addNew() {
        return this.getName();
    }

    @Override
    public int edit() {
        return (int) this.getSalary();
    }

    @Override
    public String get() {
        return this.getAddress();
    }

    @Override
    public void delete() {
        return;
    }

    @Override
    public int find() {
        return this.getId();
    }
}
