package CaseStudy.Controllers;

import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainControllers {
    private static Scanner sc=new Scanner(System.in);

    public static void displayMainMenu(){
        System.out.println("Main Menu : " +
                "\n1. Add New Service. "+
                "\n2. Show Service "+
                "\n3. Exit "+
                "\nPlease select one function below :");
        switch (sc.nextLine()){
            case "1" :
                addNewService();
                break;
            case "2" :
                showService();
                break;
            case "3" :
                System.exit(0);
            default:
                System.out.println("\n Error. Back to menu ");
                backToMenu();
        }
    }
    private static void backToMenu(){
        System.out.println("Enter to continue");
        sc.nextLine();
        System.out.println("------------------");
        displayMainMenu();
    }
    private static void addNewService(){
        System.out.println("\n-------------------");
        System.out.println("Menu (Add New Service ) :" +
                "\n1. Add new Villa." +
                "\n2. Add New House" +
                "\n3. Add New Room" +
                "\n4. Back To Menu" +
                "\n5. Exit" +
                "\nPlease select function below : ");
        switch (sc.nextLine()){
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                System.out.println("------------------");
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Error. Back to menu ");
                backToMenu();
        }
    }

    private static void showService(){

    }

    private static Service addNewService(Service service) {
        service.setId(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("Enter name Service : ");
        service.setNameService(sc.nextLine());
        System.out.println("Enter Area Used : ");
        service.setAreUsed(sc.nextDouble());
        System.out.println("Enter Rental Costs");
        service.setRentCosts(sc.nextDouble());
        System.out.println("Enter Number Of People : ");
        service.setMaxNumberOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Type Rent ");
        service.setTypeRent(sc.nextLine());
        return service;
    }

    private static void  addNewVilla(){
        Service villa=new Villa();
        villa=addNewService(villa);

        System.out.println("Enter Room Standard :");
        ((Villa) villa).setRoomStandard(sc.nextLine());

        System.out.println("Enter Convent Description : ");
        ((Villa) villa).setConvenientDescription(sc.nextLine());

        System.out.println("Enter Area Pool : ");
        ((Villa) villa).setAreaPool(sc.nextDouble());

        System.out.println("Enter Number Of Floor : ");
        ((Villa) villa).setNumberOfFloor(sc.nextInt());

        ArrayList<Villa> listVilla= new ArrayList<>();
        listVilla.add((Villa)villa);
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\nAdd Villa : "+villa.getNameService()+" Successfully!! ");
        sc.nextLine();
        backToMenu();
    }
    private static void  addNewRoom(){}
    private static void  addNewHouse(){}


}
