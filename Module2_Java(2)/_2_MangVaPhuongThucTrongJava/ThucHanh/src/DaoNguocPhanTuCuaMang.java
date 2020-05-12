import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
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

        for (int i=0;i<doDai/2;i++){
            int temp =array[i];
            array[i]=array[doDai-1-i];
            array[doDai-1-i]=temp;
        }

        System.out.println();
        System.out.print("Mang sau khi dao nguoc : ");
        for (int i=0;i<doDai;i++){
            System.out.print(array[i]+" ");
        }

    }
}