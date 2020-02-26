package LopVaDoiTuong.ThucHanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static class HinhChuNhat{
        double width,height;
        public HinhChuNhat(){
        }
        public HinhChuNhat(double width,double height){
           this.width=width;
           this.height=height;

        }
        public double getArea(){
            return this.height*this.width;
        }
        public double getPerimeter(){
            return (this.height+this.width)*2;
        }
        public String disPlay(){
            return "Hinh chu nhat (chieu dai = "+height+" , chieu rong = "+width;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double width=scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double height=scanner.nextDouble();
        HinhChuNhat hinhChuNhat=new HinhChuNhat(width,height);
        System.out.println(hinhChuNhat.disPlay());
        System.out.println("Dien tich la : "+hinhChuNhat.getArea());
        System.out.println("Chu vi la : "+hinhChuNhat.getPerimeter());
    }
}
