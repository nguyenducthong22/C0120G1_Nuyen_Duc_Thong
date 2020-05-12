import java.util.Scanner;

public class ThaoTacVoiMang {
    public static int[] ThemPhanTu(int[]array){
        int viTri=0;
        int so=0;
        boolean check=false;

        System.out.println("----------------------------");
        System.out.println("--------Them phan tu--------");
        System.out.print("Mang so nguyen : ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        do {
            try {
                System.out.println("Nhap vi tri muon them : ");
                Scanner scanner=new Scanner(System.in);
                viTri=scanner.nextInt();

                if (viTri>array.length+1||viTri<=0){
                    System.out.println("Error !!!");
                }else {
                    check=true;
                }
            }catch (Exception e){
                System.out.println("Vui long nhap dung vi tri !!!");
            }
        }while (!check);

        check=false;
        do {
            try {
                System.out.println("Nhap gia tri muon them vao vi tri "+viTri+" : ");
                Scanner scanner=new Scanner(System.in);
                so=Integer.parseInt(scanner.nextLine());
                check=true;
            }catch (Exception e){
                System.out.println("Loi !!! Vui long nhap lai !!!");
            }
        }while (!check);

        int []arrayThem=new int[array.length+1];

        for (int i=0;i<viTri-1;i++){
            arrayThem[i]=array[i];
        }
        arrayThem[viTri-1]=so;
        for (int i=viTri-1;i<arrayThem.length-1;i++){
            arrayThem[i+1]=array[i];
        }


        System.out.print("Mang sau khi them : ");
        for (int i=0;i<arrayThem.length;i++){
            System.out.print(arrayThem[i]+" ");
        }
        System.out.println();
        System.out.println("Enter back to menu:");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("---------------------------");
        menu2(arrayThem);


       return arrayThem;
    }

    public static int[] XoaPhanTu(int[]array){
        int viTri=0;
        boolean check=false;

        System.out.println("---------------------------");
        System.out.println("--------Xoa phan tu--------");
        System.out.print("Mang so nguyen : ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        do {
            try {
                System.out.println("Nhap vi tri muon xoa : ");
                Scanner scanner=new Scanner(System.in);
                viTri=scanner.nextInt();

                if (viTri>array.length||viTri<=0){
                    System.out.println("Error !!!");
                }else {
                    check=true;
                }
            }catch (Exception e){
                System.out.println("Vui long nhap dung vi tri !!!");
            }
        }while (!check);

        System.out.println("Xoa phan tu thu "+viTri+" co gia tri "+array[viTri-1]+" !!!");

    for (int i=viTri-1;i<array.length-1;i++){
        array[i]=array[i+1];
    }
    int []arrayXoa=new int[array.length-1];
    System.arraycopy(array ,0,arrayXoa,0,array.length-1);

        System.out.print("Mang sau khi xoa : ");
        for (int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter back to menu:");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("---------------------------");
        menu2(arrayXoa);
        return arrayXoa;
    }

    public static int ThayDoiPhanTu(int[]array){
        int so = 0;
        int viTri=0;
        boolean check=false;

        System.out.println("--------------------------------");
        System.out.println("--------Thay doi phan tu--------");
        System.out.print("Mang so nguyen : ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        do {
            try {
            System.out.println("Nhap vi tri muon thay doi : ");
            Scanner scanner=new Scanner(System.in);
            viTri=scanner.nextInt();

            if (viTri>array.length||viTri<=0){
                System.out.println("Error !!!");
            }else {
                check=true;
            }
        }catch (Exception e){
                System.out.println("Vui long nhap dung vi tri !!!");
            }
        }while (!check);

        check=false;
        do {
            try {
                System.out.println("Nhap gia ti phan tu moi : ");
                Scanner scanner=new Scanner(System.in);
                so=scanner.nextInt();
                array[viTri-1]=so;
                check=true;
            }catch (Exception e){
                System.out.println("Vui long nhap so nguyen !!!");
            }
        }while (!check);


        System.out.print("Mang sau khi thay doi : ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter back to menu:");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("---------------------------");
        menu2(array);
        return array[0];
    }

    public static void menu() {
        int doDai = 0;
        boolean check = false;
        int[] array;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap do dai mang : ");
                doDai = Integer.parseInt(scanner.nextLine());
                if (doDai > 20 || doDai <= 0) {
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

        check=false;
        do {

            System.out.print("Mang so nguyen : ");
            for (int i = 0; i < doDai; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Menu : ");
            System.out.println("1.Them phan tu ");
            System.out.println("2.Xoa phan tu ");
            System.out.println("3.Thay doi phan tu ");
            System.out.println("0.Exit!!!");
            Scanner scanner=new Scanner(System.in);
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    ThemPhanTu(array);
                    break;
                case "2":
                    XoaPhanTu(array);
                    break;
                case "3":
                    ThayDoiPhanTu(array);
                    break;
                case "0":
                    check=true;
                    break;
                default:
                    System.out.println("Loi !!! Vui long nhap lai !!!");
            }
        }while (!check);
    }

    public static void menu2(int[]array){
        boolean check=false;
        do {
        System.out.println("Menu : ");
        System.out.println("1.Them phan tu ");
        System.out.println("2.Xoa phan tu ");
        System.out.println("3.Thay doi phan tu ");
        System.out.println("0.Exit!!!");
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.nextLine();
        switch (choice){
            case "1":
                    ThemPhanTu(array);
                break;
            case "2":
                XoaPhanTu(array);
                break;
            case "3":
                ThayDoiPhanTu(array);
                break;
            case "0":
                check=true;
                break;
            default:
                System.out.println("Loi !!! Vui long nhap lai !!!");
        }
    }while (!check);
}


    public static void main(String[] args) {
        menu();
    }
}
