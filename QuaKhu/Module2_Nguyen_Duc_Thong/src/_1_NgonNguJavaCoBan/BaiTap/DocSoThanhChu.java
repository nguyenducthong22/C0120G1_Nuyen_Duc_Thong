package _1_NgonNguJavaCoBan.BaiTap;
import java.util.Scanner;
public class DocSoThanhChu {
    public static void main(String[] args) {
        boolean check = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so can doc : ");
            int so = scanner.nextInt();
            if (0<=so&&so <= 10) {
                switch (so) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    case 10:
                        System.out.println("ten");
                        break;
                }
            }
            if (so < 20 && so > 10) {
                switch (so) {
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                    case 13:
                        System.out.println("thirteen");
                        break;
                    case 14:
                        System.out.println("fourteen");
                        break;
                    case 15:
                        System.out.println("fifteen");
                        break;
                    case 16:
                        System.out.println("sixteen");
                        break;
                    case 17:
                        System.out.println("seventeen");
                        break;
                    case 18:
                        System.out.println("eighteen");
                        break;
                    case 19:
                        System.out.println("nineteen");
                        break;
                }
            }
            if (so >= 20 && so < 100) {
                String docHangChuc = "";
                String docHangDonVi = "";
                int hangChuc = so / 10;
                int hangDonVi = so - hangChuc * 10;
                switch (hangChuc) {
                    case 2:
                        docHangChuc = "Twenty ";
                        break;
                    case 3:
                        docHangChuc = "Thirty ";
                        break;
                    case 4:
                        docHangChuc = "Fourty";
                        break;
                    case 5:
                        docHangChuc = "Fifty ";
                        break;
                    case 6:
                        docHangChuc = "Sixty ";
                        break;
                    case 7:
                        docHangChuc = "Seventy ";
                        break;
                    case 8:
                        docHangChuc = "Eighty ";
                        break;
                    case 9:
                        docHangChuc = "Ninety ";
                        break;
                }
                switch (hangDonVi) {
                    case 0:
                        docHangDonVi = "";
                        break;
                    case 1:
                        docHangDonVi = "one";
                        break;
                    case 2:
                        docHangDonVi = "two";
                        break;
                    case 3:
                        docHangDonVi = "three";
                        break;
                    case 4:
                        docHangDonVi = "four";
                        break;
                    case 5:
                        docHangDonVi = "Five";
                        break;
                    case 6:
                        docHangDonVi = "Six";
                        break;
                    case 7:
                        docHangDonVi = "Seven";
                        break;
                    case 8:
                        docHangDonVi = "Eight";
                        break;
                    case 9:
                        docHangDonVi = "Nine";
                        break;
                }
                System.out.println(docHangChuc + docHangDonVi);
            }
                if (so >= 100 && so < 1000) {
                    String docHangtram = "";
                    String docHangChuc = "";
                    String docHangDonVi = "";
                    int hangTram = so / 100;
                    int hangChuc = (so - 100 * hangTram) / 10;
                    int hangDonVi = so - hangTram * 100 - hangChuc * 10;
                    switch (hangTram) {
                        case 1:
                            docHangtram = "One hundred ";
                            break;
                        case 2:
                            docHangtram = "Two hundred ";
                            break;
                        case 3:
                            docHangtram = "Three hundred ";
                            break;
                        case 4:
                            docHangtram = "Four hundred ";
                            break;
                        case 5:
                            docHangtram = "Five hundred ";
                            break;
                        case 6:
                            docHangtram = "Six hundred ";
                            break;
                        case 7:
                            docHangtram = "Seven hundred ";
                            break;
                        case 8:
                            docHangtram = "Eight hundred ";
                            break;
                        case 9:
                            docHangtram = "Nine hundred ";
                            break;
                    }
                    switch (hangChuc) {
                        case 0:
                            docHangChuc="";
                            break;
                        case 1:
                            if (hangDonVi==0){
                            docHangChuc="ten";}
                            else {
                                switch (hangDonVi){
                                    case 1:
                                        docHangChuc="eleven";
                                        break;
                                    case 2:
                                        docHangChuc="twelve";
                                        break;
                                    case 3:
                                        docHangChuc="thirteen";
                                        break;
                                    case 4:
                                        docHangChuc="fourteen";
                                        break;
                                    case 5:
                                        docHangChuc="fifteen";
                                        break;
                                    case 6:
                                        docHangChuc="sixteen";
                                        break;
                                    case 7:
                                        docHangChuc="seventeen";
                                        break;
                                    case 8:
                                        docHangChuc="eighteen";
                                        break;
                                    case 9:
                                        docHangChuc="nineteen";
                                        break;

                                }
                            }
                            break;
                        case 2:
                            docHangChuc = "twenty ";
                            break;
                        case 3:
                            docHangChuc = "thirty ";
                            break;
                        case 4:
                            docHangChuc = "fourty";
                            break;
                        case 5:
                            docHangChuc = "Fifty ";
                            break;
                        case 6:
                            docHangChuc = "sixty ";
                            break;
                        case 7:
                            docHangChuc = "seventy ";
                            break;
                        case 8:
                            docHangChuc = "eighty ";
                            break;
                        case 9:
                            docHangChuc = "ninety ";
                            break;
                    }
                    if(hangChuc!=1) {
                        switch (hangDonVi) {
                            case 0:
                                docHangDonVi = "";
                                break;
                            case 1:
                                docHangDonVi = "one";
                                break;
                            case 2:
                                docHangDonVi = "two";
                                break;
                            case 3:
                                docHangDonVi = "three";
                                break;
                            case 4:
                                docHangDonVi = "four";
                                break;
                            case 5:
                                docHangDonVi = "Five";
                                break;
                            case 6:
                                docHangDonVi = "Six";
                                break;
                            case 7:
                                docHangDonVi = "Seven";
                                break;
                            case 8:
                                docHangDonVi = "Eight";
                                break;
                            case 9:
                                docHangDonVi = "Nine";
                                break;
                        }
                    }
                    System.out.println(docHangtram + docHangChuc + docHangDonVi);
                }
                if (so>999|so<0){ System.out.println("Out of ability");}
        } while (!check);
    }
    }