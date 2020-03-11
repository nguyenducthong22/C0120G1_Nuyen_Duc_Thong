package CaseStudy2.Controllers;
import CaseStudy2.Commons.FuncValidate;
import CaseStudy2.Commons.FuncWriteAndReadFileCSV;
import CaseStudy2.Commons.UserException;
import CaseStudy2.Models.*;
import CaseStudy2.Commons.*;
import java.util.*;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println(
                "\n1.Add New Services." +
                        "\n2.Show Services." +
                        "\n3.Add New Customer" +
                        "\n4.Show Information of Customer" +
                        "\n5.Add New Booking" +
                        "\n6.Show Booking Resort" +
                        "\n7.Add Employee " +
                        "\n8.Show Information of Employee" +
                        "\n9.Exit" +
                        "\n Please select one function below : ");
        switch (scanner.nextLine()) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
//                showBookingResort;
//                break;
                break;
            case "7":
//                addEmployee();
//                break;
            case "8":
                showInformationEmployee();
            case "9":
                System.exit(0);
            default:
                System.out.println("\nError.Back To Menu.");
                backMainMenu();
        }
    }


    private static void backMainMenu() {
        System.out.println("\nEnter to continue...");
        scanner.nextLine();
        System.out.println("\n----------------------");
        displayMainMenu();
    }


    private static void addNewServices() {
        System.out.println("\n----------------------");
        System.out.println(
                "\n1.Add New Villa." +
                        "\n2.Add New House." +
                        "\n3.Add New Room." +
                        "\n4.Back To Menu." +
                        "\n5.Exit." +
                        "\nPlease select one function below: ");
        switch (scanner.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                System.out.println();
                System.out.println("\n----------------------");
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\nError.Back To Menu.");
                backMainMenu();
        }
    }

    private static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-------------------------------");
        System.out.println("\nInsert customer information:" +
                "\n1.Enter new customer." +
                "\n2.Back to main menu." +
                "\n3.Exit." +
                "Please choose one function .");
        switch (scanner.nextInt()) {
            case 1:
                addCustomer();
                break;
            case 2:
                backMainMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Error !!! Please choose another action!!");
                backMainMenu();
        }
    }

    private static void showServices() {
        System.out.println("\n-------------------" +
                "\n1.Show all villa." +
                "\n2.Show all House." +
                "\n3.Show all Room." +
                "\n4.Show all name villa not duplicate." +
                "\n5.Show all name house not duplicate." +
                "\n6.Show all name Room  not duplicate." +
                "\n7.Back to menu." +
                "\n8.Exit.");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllVillaNotDuplicate();
                break;
            case 5:
                showAllHouseNotDuplicate();
                break;
            case 6:
                showAllRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.print("Invalid.");
                backMainMenu();
        }
    }


    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n------------------------");
            System.out.println(villa.showInformation());
            System.out.println("\n------------------------");
        }
        backMainMenu();
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n------------------------");
            System.out.println(house.showInformation());
            System.out.println("\n------------------------");
        }
        backMainMenu();
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n------------------------");
            System.out.println(room.showInformation());
            System.out.println("\n------------------------");
        }
        backMainMenu();
    }

    private static void showAllVillaNotDuplicate() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        ArrayList<String> nameList = new ArrayList<>();
        for (Villa villa : listVilla) {
            nameList.add(villa.getNameService());
        }
        nameList.stream().distinct().forEach(System.out::println);
        backMainMenu();
    }

    private static void showAllHouseNotDuplicate() {
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        ArrayList<String> nameList = new ArrayList<>();
        for (House house : listHouse) {
            nameList.add(house.getNameService());
        }
        nameList.stream().distinct().forEach(System.out::println);
        backMainMenu();
    }

    private static void showAllRoomNotDuplicate() {
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        ArrayList<String> nameList = new ArrayList<>();
        for (Room room : listRoom) {
            nameList.add(room.getNameService());
        }
        nameList.stream().distinct().forEach(System.out::println);
        backMainMenu();
    }

    private static void showInformationEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        String content = "";
        String errMes = "";
        Customer customer = new Customer();

        System.out.println("Enter name customer:");
        customer.setName(scanner.nextLine());
        while (!UserException.nameException(customer.getName())) {
            System.out.println(" Name customer is invalid (Exam : Nguyen A )!!! Please try again !");
            customer.setName(scanner.nextLine());
        }
        System.out.println("Enter Date:YYYY-MM-DD");
        customer.setDate(scanner.nextLine());
        while (!UserException.birthdayException(customer.getDate())) {
            System.out.println("Birth day is invalid !!! Please try again .");
            customer.setDate(scanner.nextLine());
        }

        boolean check=false;
        do {
            System.out.println("Enter Gender(male, female or unknown) : ");
            String nhap = scanner.nextLine();
            nhap = nhap.toLowerCase();
            if (nhap.equals("male") | nhap.equals("female") | nhap.equals("unknown")) {
                customer.setGender(nhap);
                check=true;
            }
        }while (!check);


        System.out.println("Enter passPort:");
        customer.setPassPort(scanner.nextLine());
        while (!UserException.idCardException(customer.getPassPort())) {
            System.out.println("IdCard is invalid !!! Please try again ! ");
            customer.setPassPort(scanner.nextLine());
        }
        System.out.println("Enter phoneNumber:");
        customer.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter email:");
        customer.setEmail(scanner.nextLine());
        while (!UserException.emailException(customer.getEmail())) {
            System.out.println("Email is invalid (Exam abc@abc.abc) !!! Please try again ! ");
            customer.setEmail(scanner.nextLine());
        }

        System.out.println("Enter typeCustomer:");
        customer.setTypeCustomer(scanner.nextLine());

        System.out.println("Enter address:");
        customer.setAddress(scanner.nextLine());

        System.out.println("Enter typeService:");
        customer.setTypeService(scanner.nextLine());

        ArrayList<Customer> customersList = FuncWriteAndReadFileCSV.getCustomerFromCSV();
        customersList.add(customer);

        FuncWriteAndReadFileCSV.writeCustomerToFileCSV(customersList);
        System.out.print("\nAdd Customer: "
                + customer.getName() +
                "  Successfully!!!"
        );
        backMainMenu();
    }

    private static void showInformationCustomer() {
        ArrayList<Customer> customers = FuncWriteAndReadFileCSV.getCustomerFromCSV();

        System.out.println("-----------Sorted by age------------");
        Collections.sort(customers, new AgeComparator());
        for (Customer st : customers) {
            System.out.println(st.getPassPort() + " " + st.getName() + " " + st.getDate());
        }

        System.out.println("-----------Sorted by name------------");
        Collections.sort(customers, new NameComparator());
        for (Customer st : customers) {
            System.out.println(st.getPassPort() + " " + st.getName() + " " + st.getDate());
        }
    }

    private static Services addNewServices(Services services) {
        String content = "";
        String errMes = "";
        services.setId(UUID.randomUUID().toString().replace("-", ""));

        scanner.nextLine();
        System.out.println("Enter name services:");
        services.setNameService(scanner.nextLine());
        while (!FuncValidate.checkNameService(services.getNameService())) {
            System.out.println("Name service id invalid !!! Please try again");
            System.out.println("Enter name service :");
            services.setNameService(scanner.nextLine());
        }

        content = "Enter area used:";
        errMes = "Area is invalid (Area used more than 30) !!! Please try again!";
        services.setArea(FuncValidate.checkValidNumberDouble(content, errMes));
        while (services.getArea() <= 30) {
            System.out.println(errMes);
            services.setArea(FuncValidate.checkValidNumberDouble(content, errMes));
        }

        content = "Enter rent cost: ";
        errMes = "Rent cost is invalid (rent cost more than 0) !!! please try again!";
        services.setRentCost(FuncValidate.checkValidNumberDouble(content, errMes));
        while (services.getRentCost() < 0) {
            System.out.println(errMes);
            services.setRentCost(FuncValidate.checkValidNumberDouble(content, errMes));
        }
        //Enter maxNumberOfPeople
        content = "Enter max number of People:";
        errMes = "Number is invalid (0 < Area < 20) please try again!";
        services.setMaxNumberOfPeople(FuncValidate.checkValidNumberInteger(content, errMes));
        while ((services.getMaxNumberOfPeople() < 0) || (services.getMaxNumberOfPeople() > 20)) {
            System.out.println(errMes);
            services.setMaxNumberOfPeople(FuncValidate.checkValidNumberInteger(content, errMes));
        }
        //Enter typeRent
        System.out.println("Enter typeRent:");
        services.setTypeRent(scanner.nextLine());
        while (!FuncValidate.checkNameService(services.getTypeRent())) {
            System.out.println("Type Rent is invalid (Exam : Aa)!!! Please try again ! ");
            services.setTypeRent(scanner.nextLine());
        }
        return services;
    }

    private static void addNewVilla() {
        String content = "";
        String errMes = "";
        Services villa = new Villa();
        villa = addNewServices(villa);
        System.out.println("Enter room standard: ");
        ((Villa) villa).setRoomStandard(scanner.nextLine());
        while (!FuncValidate.checkNameService(((Villa) villa).getRoomStandard())) {
            System.out.println("Room standard is invalid (Exam : Aa)!!! Please try again ");
            ((Villa) villa).setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter description: ");
        ((Villa) villa).setDescription(scanner.nextLine());

        content = "Enter pool area :";
        errMes = "Area pool is invalid ( more than 0) !!! please try again!";
        ((Villa) villa).setPoolArea((FuncValidate.checkValidNumberDouble(content, errMes)));
        while (((Villa) villa).getPoolArea() <= 0) {
            System.out.println(errMes);
            ((Villa) villa).setPoolArea(FuncValidate.checkValidNumberDouble(content, errMes));
        }

        content = "Enter floor:";
        errMes = "Area is invalid (Area more than 0) !!! Please try again!";
        ((Villa) villa).setFloor((FuncValidate.checkValidNumberInteger(content, errMes)));
        while (((Villa) villa).getFloor() < 0) {
            System.out.println(errMes);
            ((Villa) villa).setFloor(FuncValidate.checkValidNumberInteger(content, errMes));
        }

        ArrayList<Villa> villaList = FuncWriteAndReadFileCSV.getVillaFromCSV();
        villaList.add((Villa) villa);
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(villaList);
        System.out.print("\nAdd Villa: "
                + villa.getNameService() +
                "  Successfully!!!"
        );
        backMainMenu();
    }

    private static void addNewHouse() {
        Services house = new House();
        house = addNewServices(house);
        System.out.println("Enter room standard:");
        ((House) house).setRoomStandard(scanner.nextLine());
        System.out.println("Enter description:");
        ((House) house).setDescription(scanner.nextLine());
        System.out.println("Enter poolArea:");
        ((House) house).setPoolArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter floor:");
        ((House) house).setFloor(Integer.parseInt(scanner.nextLine()));
        ArrayList<House> houseList = FuncWriteAndReadFileCSV.getHouseFromCSV();
        houseList.add((House) house);
        FuncWriteAndReadFileCSV.writeHouseToFileCSV(houseList);
        System.out.print("\nAdd House: "
                + house.getNameService() +
                "  Successfully!!!"
        );
        backMainMenu();
    }

    private static void addNewRoom() {
        Services room = new Room();
        room = addNewServices(room);
        System.out.println("Enter room standard:");
        ((Room) room).setBonus(scanner.nextLine());
        System.out.println("Enter description:");
        ArrayList<Room> roomList = FuncWriteAndReadFileCSV.getRoomFromCSV();
        roomList.add((Room) room);
        FuncWriteAndReadFileCSV.writeRoomToFileCSV(roomList);
        System.out.print("\nAdd Room: "
                + room.getNameService() +
                "  Successfully!!!"
        );
        backMainMenu();
    }
}