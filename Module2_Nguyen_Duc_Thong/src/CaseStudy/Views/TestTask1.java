package CaseStudy.Views;

import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;

import java.util.Scanner;
import java.util.UUID;

public class TestTask1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Service villa=new Villa();
        villa.setId(UUID.randomUUID().toString().replace("-",""));//Tao ra 1 chuoi ngau nhien bo dau - //
        System.out.println("Enter name service :");
        villa.setNameService(scanner.nextLine());
        System.out.println("Enter Area Used : ");
        villa.setAreaUsed(scanner.nextDouble());
        System.out.println("Enter Rental Costs : ");
        villa.setRentCosts(scanner.nextDouble());
        System.out.println("Enter Max Number Of People : ");
        villa.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Type Rent : ");
        villa.setTypeRent(scanner.nextLine());
        System.out.println("Enter Room Standard : ");
        ((Villa) villa).setRoomStandard(scanner.nextLine());
        System.out.println("Enter Convent Description : ");
        ((Villa) villa).setConvenientDescription(scanner.nextLine());
        System.out.println("Enter Area Pool : ");
        ((Villa) villa).setAreaPool(scanner.nextDouble());
        System.out.println("Enter Number Of Floor : ");
        ((Villa) villa).setNumberOfFloor(scanner.nextInt());

        System.out.println(villa.showInfo());
    }
}
