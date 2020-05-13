import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    double root;
    double root1;
    double root2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta(){
        return (Math.pow(getB(),2))-4*getA()*getC();
    }

    public double Root(){
            return root=(-getB())/(2*getA());
    }

    public double Root1(){
        return root1=(-getB()-Math.pow(getDelta(),0.5))/(2*getA());
    }

    public double Root2(){
        return root2=(-getB()+Math.pow(getDelta(),0.5))/(2*getA());
    }

    public static void main(String[] args) {
        boolean check=false;

        QuadraticEquation quadraticEquation=new QuadraticEquation();
        while (true) {
            System.out.println("Giai phuong trinh bac 2 dang a*x*x+b*x+c=0  ");
            do {
                try {
                    System.out.println("Nhap a : ");
                    Scanner scanner = new Scanner(System.in);
                    quadraticEquation.setA(Double.parseDouble(scanner.nextLine()));
                    check = true;
                } catch (Exception e) {
                    System.out.println("Khong hop le !!! Vui long nhap lai !!!");
                }
            } while (!check);

            check = false;
            do {
                try {
                    System.out.println("Nhap b : ");
                    Scanner scanner = new Scanner(System.in);
                    quadraticEquation.setB(Double.parseDouble(scanner.nextLine()));
                    check = true;
                } catch (Exception e) {
                    System.out.println("Khong hop le !!! Vui long nhap lai !!!");
                }
            } while (!check);

            check = false;
            do {
                try {
                    System.out.println("Nhap c : ");
                    Scanner scanner = new Scanner(System.in);
                    quadraticEquation.setC(Double.parseDouble(scanner.nextLine()));
                    check = true;
                } catch (Exception e) {
                    System.out.println("Khong hop le !!! Vui long nhap lai !!!");
                }
            } while (!check);

            if (quadraticEquation.getDelta() > 0) {
                System.out.println("Phuong trinh co 2 nghiem : ");
                System.out.println("x1 = " + quadraticEquation.Root1());
                System.out.println("x2 = " + quadraticEquation.Root2());

            } else if (quadraticEquation.getDelta() == 0) {
                System.out.println("Phuong trinh co 1 nghiem : ");
                System.out.println("x = " + quadraticEquation.Root());
            } else {
                System.out.println("Phuong trinh vo nghiem .");
            }
            System.out.println("-------------------------------------------");
        }
    }
}
