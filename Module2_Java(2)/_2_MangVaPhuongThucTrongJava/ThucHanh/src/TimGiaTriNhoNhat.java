import java.util.Scanner;

public class TimGiaTriNhoNhat {

    public  static int min (int []array){
        int min=array[0];
        String viTri="";

        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }

        for (int i=0;i<array.length;i++) {
            if (array[i]==min){
                viTri=viTri+(i+1)+" ";
            }
        }

        System.out.println("Gia Tri nho nhat la : "+min);
        System.out.println("Vi tri thu : "+viTri);
        return min;
    }

    public static void main(String[] args) {
        int doDai = 0;
        boolean check = false;
        int[] array;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap do dai mang : ");
                doDai = Integer.parseInt(scanner.nextLine());
                if (doDai > 20||doDai<=0) {
                    System.out.println("Do dai khong qua 20 !!! Moi nhap lai !!!");
                    System.out.println("----------------------------------");
                } else {
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("Loi !!! Moi nhap lai !!!");
                System.out.println("----------------------------------");
            }
        } while (!check);

        array = new int[doDai];
        check = false;
        for (int i = 0; i < doDai; i++) {
            do {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap phan tu thu " + (i + 1) + " : ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                    check = true;
                } catch (Exception e) {
                    System.out.println("Loi!!! Vui long nhap lai ");
                    i = i - 1;
                }
            } while (!check);
        }

        System.out.print("Mang vua nhap : ");
        for (int i = 0; i < doDai; i++) {
            System.out.print(array[i] + " ");
        }

    min(array);

    }
}