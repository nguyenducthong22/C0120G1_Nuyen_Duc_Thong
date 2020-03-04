package Demo;

public class Shoes extends Class {
    private int size;
    private String brand;

    public Shoes() {
    }

    public Shoes(int id, String name, int size, String brand) {
        super(id, name);
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String addNew() {
        return this.getName();
    }

    @Override
    public int edit() {
        return this.getSize();
    }

    @Override
    public String get() {
        return this.getBrand();
    }

    @Override
    public void delete() {
        return ;
    }

    @Override
    public int find() {
        return this.getId();
    }
}
