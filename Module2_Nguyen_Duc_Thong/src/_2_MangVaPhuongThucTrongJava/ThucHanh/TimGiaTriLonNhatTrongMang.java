package _2_MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int doDai;
        double[] array;
        do {
            System.out.print("Vui long cho biet so cac phan tu : ");
            doDai = scanner.nextInt();
            if (doDai < 20 && doDai > 0) {
                check = true;
            } else {
                System.out.print("Khong hop le !!!");
            }
        } while (!check);
        array = new double[doDai];
        int i = 0;
        do {
            System.out.print("Gia tri phan tu thu " + (i + 1) + " : ");
            array[i] = scanner.nextDouble();
            i++;
        } while (i < doDai);

        timGTLN(array);
    }
    static double timGTLN(double[]array) {
        double max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.print("gia tri lon nhat la : "+max+" ung voi phan tu thu "+index);
        return max;
    }
}