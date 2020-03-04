package Demo;

public class Clothes extends Class {
private int  size;
private String color;

    public Clothes() {
    }

    public Clothes(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothes(int id, String name, int size, String color) {
        super(id, name);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String addNew() {
        return this.getName();
    }

    @Override
    public int edit() {
        return this.getColor();
    }

    @Override
    public String get() {
        return this.getSize();
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
