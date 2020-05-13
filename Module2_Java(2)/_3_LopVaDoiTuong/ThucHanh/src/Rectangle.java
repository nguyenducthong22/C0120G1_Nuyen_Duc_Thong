import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    public String display(){
        return
       "Hinh chu nhat ( chieu dai "+this.height+" ,chieu rong "+ this.width+" )"+"\n"+
       "Dien tich la : "+this.getArea()+"\n"+
       "Chu vi la    : "+this.getPerimeter();
    }

    public static void main(String[] args) {
        boolean check=false;
        double width=0;
        double height=0;

        Rectangle rectangle=new Rectangle();

        System.out.println("-------Hinh chu nhat-------");
        do {
            try {
                System.out.println("Nhap chieu dai : ");
                Scanner scanner = new Scanner(System.in);
                height=Double.parseDouble(scanner.nextLine());
                if (height<=0){
                    System.out.println("Chieu dai phai lon hon 0 !!!");
                }else {
                    rectangle.setHeight(height);
                    check=true;
                }
            }catch (Exception e){
                System.out.println("Chieu dai khong hop le !!! ");
            }
        }while (!check);

        check=false;
        do {
            try {
                System.out.println("Nhap chieu rong : ");
                Scanner scanner = new Scanner(System.in);
                width=Double.parseDouble(scanner.nextLine());
                if (width<=0){
                    System.out.println("Chieu rong phai lon hon 0 !!!");
                }else {
                    rectangle.setWidth(width);
                    check=true;
                }
            }catch (Exception e){
                System.out.println("Chieu rong khong hop le !!! ");
            }
        }while (!check);

        System.out.println(rectangle.display());
    }
    }

