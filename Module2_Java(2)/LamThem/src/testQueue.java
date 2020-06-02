import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class testQueue {
    public static void main(String[] args) {
        long nhap;
        boolean check=false;
        Queue<Integer> queue = new ArrayDeque<>();

        do {
            try {
                System.out.println("--------------- Choi dem so -----------------");
                System.out.println("Moi nhap so lan choi (Nhap 0 de thoat ) : ");
                Scanner scanner = new Scanner(System.in);
                nhap = scanner.nextInt();
                queue.add(1);
                queue.add(2);
                queue.add(3);
                queue.add(4);
                queue.add(5);
                for (int i = 1; i < nhap; i++) {
                    int so;
                    so = queue.poll();
                    queue.add(so);
                    queue.add(so);
                }
                if (nhap == 0) {
                    System.out.println("Thoat !!!");
                    check = true;
                } else {
                    System.out.println("So dau tien la : " + queue.peek());
                    queue.clear();
                    System.out.println("---------------------------------------------");
                    System.out.println();
                }
                }catch(Exception e){
                    System.out.println("Khong hop le ! Moi nhap lai !!!");
                    System.out.println();
                }
        }while (!check);
    }
}
