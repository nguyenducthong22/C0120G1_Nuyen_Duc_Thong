package Demo;

public class Customer extends Class {
    private String address;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, String address, int age) {
        super(id, name);
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String addNew() {
        return this.getName();
    }

    @Override
    public int edit() {
        return this.getAge();
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
