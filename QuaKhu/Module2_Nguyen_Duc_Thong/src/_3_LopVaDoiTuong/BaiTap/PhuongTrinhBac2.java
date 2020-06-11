package LopVaDoiTuong.BaiTap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static class GiaiPhuongTrinhBac2{
        double a,b,c,delta;
        public GiaiPhuongTrinhBac2(double a,double b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getDelta(){
            return Math.sqrt((Math.pow(b,2))-4*a*c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2 dang ax2 +bx+c=0");
        System.out.print("Nhap a: ");
        double a=scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b=scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c=scanner.nextDouble();
        GiaiPhuongTrinhBac2 giaiPhuongTrinhBac2=new GiaiPhuongTrinhBac2(a,b,c);
        double delta= giaiPhuongTrinhBac2.getDelta();
        if (a==0){
            System.out.println("Phuong trinh co 1 nghiem :");
            System.out.println("x = "+(-c)/b);
        }
        else {
            if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem: ");
                System.out.println("x1 = " + (-b + delta) / (2 * a));
                System.out.println("x2 = " + (-b + delta) / (2 * a));
            } else if (delta == 0) {
                System.out.println("Phuong trinh co 1 nghiem: ");
                System.out.println("x = " + (-b) / (2 * a));
            } else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
    }
}
