package TrienKhaiInterfaceColorable;

public class main {
    public static void main(String[] args) {
        HinhHoc[] hinhHoc=new HinhHoc[4];
        hinhHoc[0]=new Square("blue",true,3);
        hinhHoc[1]=new Rectangle("white",false,5,6);
        hinhHoc[2]=new Cricle(6,"pink",false);
        hinhHoc[3]=new Square("green",true,3);

        for (HinhHoc hinhHoc1:hinhHoc) {
            System.out.println(hinhHoc1.toString());
            if (hinhHoc1 instanceof Square){
                System.out.println(((Square) hinhHoc1).howtoColor());
            }
            System.out.println();
        }
    }
}
