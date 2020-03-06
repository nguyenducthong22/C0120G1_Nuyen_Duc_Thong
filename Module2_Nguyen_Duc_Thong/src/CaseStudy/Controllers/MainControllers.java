package CaseStudy.Controllers;

import CaseStudy.Commons.FunValidation;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainControllers {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("Main Menu : " +
                "\n1. Add New Service. " +
                "\n2. Show Service " +
                "\n3. Exit " +
                "\nPlease select one function below :");
        switch (sc.nextLine()) {
            case "1":
                addNewService();
                break;
            case "2":
                showService();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("\n Error. Back to menu ");
                backToMenu();
        }
    }

    private static void backToMenu() {
        System.out.println("Enter to continue");
        sc.nextLine();
        System.out.println("------------------");
        displayMainMenu();
    }

    private static void addNewService() {
        String content = "";
        String errMes = "";

        System.out.println("\n-------------------");
        System.out.println("Menu (Add New Service ) :" +
                "\n1. Add new Villa." +
                "\n2. Add New House" +
                "\n3. Add New Room" +
                "\n4. Back To Menu" +
                "\n5. Exit" +
                "\nPlease select function below : ");
        switch (sc.nextLine()) {
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

    private static void showService() {
        System.out.println("----------------------");
        System.out.println("\nMenu (Show Service): " +
                "\n1.Show All Villa" +
                "\n2.Show All House" +
                "\n3.Show All Room" +
                "\4. Back To Menu" +
                "\5. Exit" +
                "\n Please select function below : ");
        switch (sc.nextLine()) {
            case "1":
                showAllVilla();
                break;
            case "2":
//                showAllHouse();
                break;
            case "3":
//                showAllRoom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("\nError . Back to menu  ");
                backToMenu();
        }
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n--------------------");
            villa.showInfo();
            System.out.println("\n--------------------");
            backToMenu();
        }
    }

    private void showAllHouse() {
    }

    private void showAllRoom() {
    }

    private static Service addNewService(Service service) {
        String content = "";
        String errMes = "";

        service.setId(UUID.randomUUID().toString().replace("-", ""));
        System.out.println("Enter name Service : ");
        service.setNameService(sc.nextLine());
        while (!FunValidation.checkNameService(service.getNameService())) {
            System.out.println("Name is invalid (exam : Nguyen A )!!!Please try again");
            System.out.println("Enter Name Service:  ");
            service.setNameService(sc.nextLine());
        }

        content = "Enter Area Used : ";
        errMes = "Area Used is not invalid(Area must > 30). Please try again !!! ";
        service.setAreaUsed(FunValidation.checkValidNumberDouble(content, errMes));
        while (service.getAreaUsed() <= 30) {
            System.out.println(errMes);
            service.setAreaUsed(FunValidation.checkValidNumberDouble(content, errMes));
        }

        content = "Enter Rental Cost Used : ";
        errMes = "Rental Cost is invalid(Cost must > 0). Please try again !!! ";
        service.setAreaUsed(FunValidation.checkValidNumberDouble(content, errMes));
        while (service.getAreaUsed() <= 0) {
            System.out.println(errMes);
            service.setAreaUsed(FunValidation.checkValidNumberDouble(content, errMes));
        }

        content = "Enter Max Number Of People : ";
        errMes = "Max Number Of People is invalid (Number Of People must more than 0 and less than 20 )!!! Please try again";
        service.setMaxNumberOfPeople(FunValidation.checkValidNumberInteger(content, errMes));
        while (service.getMaxNumberOfPeople() <= 0 || service.getMaxNumberOfPeople() >= 20) {
            System.out.println(errMes);
            service.setMaxNumberOfPeople(FunValidation.checkValidNumberInteger(content, errMes));
        }

        System.out.println("Enter Type Rent : ");
        service.setTypeRent(sc.nextLine());
        while (!FunValidation.checkString(service.getTypeRent())) {
            System.out.println("Type Rent is invalid (Exam : Vip ) !!!Please try again");
            System.out.println("Enter Type Rent:  ");
            service.setTypeRent(sc.nextLine());
        }
        return service;
    }
        private static void addNewVilla () {
            String content = "";
            String errMes = "";

            System.out.println("------Add New Villa-----");
            Service villa = new Villa();
            villa = addNewService(villa);

            System.out.println("Enter Room Standard :");
            ((Villa) villa).setRoomStandard(sc.nextLine());
            while (!FunValidation.checkString(((Villa) villa).getRoomStandard())) {
                System.out.println("Room Standard is invalid (Exam : Good ) !!! Please tey again");
                System.out.println("Enter Room Standard : ");
                ((Villa) villa).setRoomStandard(sc.nextLine());
            }

            System.out.println("Enter Convent Description : ");
            ((Villa) villa).setConvenientDescription(sc.nextLine());
            while (!FunValidation.checkString(((Villa) villa).getConvenientDescription())) {
                System.out.println("Convent Description is invalid (Exam : Good)!!!Please try again");
                System.out.println("Enter Convent Description : ");
                ((Villa) villa).setConvenientDescription(sc.nextLine());
            }

            content = "Enter Area Pool : ";
            errMes = "Area Pool is invalid(Area must > 0). Please try again !!! ";
            ((Villa) villa).setAreaPool(FunValidation.checkValidNumberDouble(content, errMes));
            while (((Villa) villa).getAreaPool() <= 0) {
                System.out.println(errMes);
                ((Villa) villa).setAreaPool(FunValidation.checkValidNumberDouble(content, errMes));

            }
            content = "Enter Number of Floor :";
            errMes = "Number Of Floor is invalid (Number of floor must more than 0)!!!Please try again ";
            ((Villa) villa).setNumberOfFloor(FunValidation.checkValidNumberInteger(content, errMes));
            while (((Villa) villa).getNumberOfFloor() <= 0) {
                System.out.println(errMes);
                ((Villa) villa).setNumberOfFloor(FunValidation.checkValidNumberInteger(content, errMes));
            }

            ArrayList<Villa> listVilla = new ArrayList<>();
            listVilla.add((Villa) villa);

            FuncWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
            System.out.println("\nAdd Villa : " + villa.getNameService() + " Successfully!! ");
            backToMenu();
            }

        private static void addNewHouse () {
            System.out.println("---------Add New House----------");
            Service house = new House();
            house = addNewService(house);

            System.out.println("Enter Room Standard :");
            ((House) house).setRoomStandard(sc.nextLine());
            System.out.println("Enter Convent Description : ");
            ((House) house).setConventDescription(sc.nextLine());
            System.out.println("Enter Number Of Floor : ");
            ((House) house).setNumberOfFloor(sc.nextInt());
            ArrayList<House> listHouse = new ArrayList<>();
            listHouse.add((House) house);
            FuncWriteAndReadFileCSV.writeHouseToFileCSV(listHouse);
            System.out.println("\nAdd House : " + house.getNameService() + " Successfully!! ");
            sc.nextLine();
            backToMenu();
        }
        private static void addNewRoom () {
            System.out.println("----------Add New Room----------");
            Service room = new Room();
            room = addNewService(room);

            System.out.println("Enter free Service : ");
            ((Room) room).setFreeService(sc.nextLine());

            ArrayList<Room> listRoom = new ArrayList<>();
            listRoom.add((Room) room);
            FuncWriteAndReadFileCSV.writeRoomToFileCSV(listRoom);
            System.out.println("\nAdd Room : " + room.getNameService() + " Successfully!! ");
            backToMenu();
        }
    }



