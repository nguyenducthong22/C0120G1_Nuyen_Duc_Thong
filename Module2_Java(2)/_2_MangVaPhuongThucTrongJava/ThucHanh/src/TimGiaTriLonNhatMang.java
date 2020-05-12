import java.util.Scanner;

public class TimGiaTriLonNhatMang {
    public static void main(String[] args) {
        int size=0;
        boolean check= false;
        int [] array;

        do {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Nhap do dai mang : ");
                size=Integer.parseInt(scanner.nextLine());
                if (size>20||size<=0){
                    System.out.println("Do dai khong qua 20 !!! Moi nhap lai !!!");
                    System.out.println("----------------------------------");
                }else {
                    check=true;
                }
            }catch (Exception e){
                System.out.println("Loi !!! Moi nhap lai !!!");
                System.out.println("----------------------------------");
            }
        }while (!check);

        array=new int[size];
        check=false;
        for (int i=0;i<size;i++){
            do {
                try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhap phan tu thu "+(i+1)+" : ");
            array[i]=Integer.parseInt(scanner.nextLine());
            check=true;
                }catch (Exception e){
                    System.out.println("Loi!!! Vui long nhap lai ");
                    i=i-1;
                }
        }while (!check);
        }

        System.out.print("Mang vua nhap : ");
        for (int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }

        int max=array[0];

        for (int i=0;i<size;i++){
            if (array[i]>max){
                max=array[i];
            }
        }

        System.out.println();
        System.out.println("Gia tri lon nhat trong mang la : "+max);

    }
}
