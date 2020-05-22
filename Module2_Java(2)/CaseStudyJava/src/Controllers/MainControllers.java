package Controllers;

import Commons.*;
import Models.*;

import java.util.*;

public class MainControllers {
    public static void displayMainMenu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n---------------------------------------------------------");
        System.out.println("<---------------{  > Furama Resort  < }----------------->" +
                "\nMain menu : " +
                "\n1.Add New Service" +
                "\n2.Show Service " +
                "\n3.Add New Customer " +
                "\n4.Show Information of Customer " +
                "\n5.Add New Booking " +
                "\n6.Show Employee " +
                "\n7.Buy cinema ticket 4D" +
                "\n8.Find Employee" +
                "\n00.Exit " +
                "\nPlease select one function below : ");

        switch (scanner.nextLine()){
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
                showInformationEmployee();
                break;
            case "7":
                buyCinemaTicket4D();
                break;
            case "8":
                findEmployee();
                break;
            case "00":
                System.out.println("Exit !!!");
                System.exit(0);
                break;
            default:
                System.out.print("\nError!!! Back To Menu ...");
                displayMainMenu();
        }
    }

    // (1)Add New Service--------------------------------------------------------------------------------------------------------
    // Menu add new service----------------------------------------------------------------
    private static void addNewServices() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("-------------------Add New Service-----------------------");
        System.out.println("Menu : " +
                "\n1.Add New Villa" +
                "\n2.Add New House" +
                "\n3.Add New Room" +
                "\n0.Back To Main Menu" +
                "\n00.Exit" +
                "\nPlease select one function below: ");
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextLine()){
            case "1":
                System.out.println("   -------Add New Villa------  ");
                addNewVilla();
                break;
            case "2":
                System.out.println("   -------Add New House------  ");
                addNewHouse();
                break;
            case "3":
                System.out.println("   -------Add New Room------  ");
                addNewRoom();
                break;
            case "0":
                System.out.print("Back to main menu !!!");
                backMainMenu();
                break;
            case "00":
                System.out.println("Exit !!!");
                System.exit(0);
                break;
            default:
                System.out.println("\nError!!!Back To Menu Add New Service...");
                addNewServices();
        }
    }
    // exit menu add new service--------------------------------------------------------------

    // add new Service (Shared for villa,house,room)------------------------------------------
    private static Services addNewServices(Services services) {
        Scanner scanner=new Scanner(System.in);
        String content = "";
        String errMes = "";
        services.setId(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("Enter name services:");
        services.setNameService(scanner.nextLine());
        while (!FunctionValidateForService.checkNameService(services.getNameService())) {
            System.out.println("Name service is invalid !!!(Exam : Room ) Please try again");
            System.out.println("Enter name service :");
            services.setNameService(scanner.nextLine());
        }

        content = "Enter area used:";
        errMes = "Area is invalid (Area used more than 30) !!! Please try again!";
        services.setArea(FunctionValidateForService.checkValidNumberDouble(content, errMes));
        while (services.getArea() <= 30) {
            System.out.println(errMes);
            services.setArea(FunctionValidateForService.checkValidNumberDouble(content, errMes));
        }

        content = "Enter rent cost: ";
        errMes = "Rent cost is invalid (rent cost more than 0) !!! please try again!";
        services.setRentCost(FunctionValidateForService.checkValidNumberDouble(content, errMes));
        while (services.getRentCost() < 0) {
            System.out.println(errMes);
            services.setRentCost(FunctionValidateForService.checkValidNumberDouble(content, errMes));
        }

        //Enter maxNumberOfPeople
        content = "Enter max number of People:";
        errMes = "Number is invalid (0 < number < 20) please try again!";
        services.setMaxNumberOfPeople(FunctionValidateForService.checkValidNumberInteger(content, errMes));
        while ((services.getMaxNumberOfPeople() <= 0) || (services.getMaxNumberOfPeople() >= 20)) {
            System.out.println(errMes);
            services.setMaxNumberOfPeople(FunctionValidateForService.checkValidNumberInteger(content, errMes));
        }

        //Enter typeRent
        System.out.println("Enter typeRent:");
        services.setTypeRent(scanner.nextLine());
        while (!FunctionValidateForService.checkName(services.getTypeRent())) {
            System.out.println("Type Rent is invalid (Exam : Abc or abc)!!! Please try again ! ");
            services.setTypeRent(scanner.nextLine());
        }
        return services;
    }
    // exit add new Service (Shared for villa,house,room)-----------------------------------

    // (1.1) add new Villa -----------------------------------------------------------------------
    private static void addNewVilla() {
        Scanner scanner=new Scanner(System.in);
        String content = "";
        String errMes = "";
        Services villa = new Villa();
        villa = addNewServices(villa);
        System.out.println("Enter room standard: ");
        ((Villa) villa).setRoomStandard(scanner.nextLine());
        while (!FunctionValidateForService.checkName(((Villa) villa).getRoomStandard())) {
            System.out.println("Room standard is invalid (Exam : Abc or abc)!!! Please try again ");
            ((Villa) villa).setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter description: ");
        ((Villa) villa).setDescription(scanner.nextLine());

        content = "Enter pool area :";
        errMes = "Area pool is invalid ( more than 0) !!! please try again!";
        ((Villa) villa).setPoolArea((FunctionValidateForService.checkValidNumberDouble(content, errMes)));
        while (((Villa) villa).getPoolArea() <= 0) {
            System.out.println(errMes);
            ((Villa) villa).setPoolArea(FunctionValidateForService.checkValidNumberDouble(content, errMes));
        }

        content = "Enter floor:";
        errMes = "Floor is invalid (Floor more than 0) !!! Please try again!";
        ((Villa) villa).setFloor((FunctionValidateForService.checkValidNumberInteger(content, errMes)));
        while (((Villa) villa).getFloor() < 0) {
            System.out.println(errMes);
            ((Villa) villa).setFloor(FunctionValidateForService.checkValidNumberInteger(content, errMes));
        }

        ArrayList<Villa> villaList = FuncWriteAndReadFileCSV.getVillaFromCSV();
        villaList.add((Villa) villa);
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(villaList);
        System.out.print("\nAdd Villa: "
                + villa.getNameService() +
                " . Successfully!!! " +
                "\nBack to menu add new service. Enter to continue ..."
        );
        scanner.nextLine();
        addNewServices();
    }
    //(1.1) exit add new villa-------------------------------------------------------------

    // (1.2) add new house------------------------------------------------------------------
    private static void addNewHouse() {
        Scanner scanner=new Scanner(System.in);
        String content = "";
        String errMes = "";
        Services house = new House();
        house = addNewServices(house);
        System.out.println("Enter room standard: ");
        ((House) house).setRoomStandard(scanner.nextLine());
        while (!FunctionValidateForService.checkName(((House) house).getRoomStandard())) {
            System.out.println("Room standard is invalid (Exam : Abc or abc)!!! Please try again ");
            ((House) house).setRoomStandard(scanner.nextLine());
        }

        System.out.println("Enter description: ");
        ((House) house).setDescription(scanner.nextLine());

        content = "Enter floor:";
        errMes = "Floor is invalid (Floor more than 0) !!! Please try again!";
        ((House) house).setFloor((FunctionValidateForService.checkValidNumberInteger(content, errMes)));
        while (((House) house).getFloor() <= 0) {
            System.out.println(errMes);
            ((House) house).setFloor(FunctionValidateForService.checkValidNumberInteger(content, errMes));
        }

        ArrayList<House> houseList = FuncWriteAndReadFileCSV.getHouseFromCSV();
        houseList.add((House) house);
        FuncWriteAndReadFileCSV.writeHouseToFileCSV(houseList);
        System.out.print("\nAdd House: " + house.getNameService() + " . Successfully!!!"+
                "\nBack to menu add new service. Enter to continue"
        );
        scanner.nextLine();
        addNewServices();
    }
    //(1.2)exit add new house------------------------------------------------------------------

    //(1.3) add new room-----------------------------------------------------------------------
    private static void addNewRoom() {
        boolean check=false;
        Services room = new Room();
        room = addNewServices(room);

        do {
            System.out.println("Enter Accompanied Service (massage, karaoke, food, drink, car) : ");
            Scanner scanner=new Scanner(System.in);
            String choice=scanner.nextLine();
            if (choice.equals("massage")||choice.equals("car")||choice.equals("karaoke")||choice.equals("food")||choice.equals("drink")){
                ((Room) room).setBonus(choice);
                check=true;
            }else {
                System.out.println("Please Choose 1 of 5 categories : massage, karaoke, food, drink, car !");
                System.out.println("Please try again !!! ");
            }
        }while (!check);

        ArrayList<Room> roomList = FuncWriteAndReadFileCSV.getRoomFromCSV();
        roomList.add((Room) room);
        FuncWriteAndReadFileCSV.writeRoomToFileCSV(roomList);
        System.out.print("\nAdd House: "
                + room.getNameService() +
                " . Successfully!!!"+
                "\nBack to menu add new service. Enter to continue ..."
        );
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        addNewServices();
    }


// (2) Show Service --------------------------------------------------------------------------------------------------------------
    //Menu show Service------------------------------------------------------------------------
    private static void showServices() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n---------------------------------------------------------");
        System.out.println("------------------- Show  Service -----------------------");
        System.out.print("Menu : "+
                "\n1.Show all villa." +
                "\n2.Show all House." +
                "\n3.Show all Room." +
                "\n4.Show all name villa not duplicate." +
                "\n5.Show all name house not duplicate." +
                "\n6.Show all name Room  not duplicate." +
                "\n0.Back to main menu." +
                "\n00.Exit." +
                "\nPlease choice one function below : ");
        switch (scanner.nextLine()) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showAllVillaNotDuplicate();
                break;
            case "5":
                showAllHouseNotDuplicate();
                break;
            case "6":
                showAllRoomNotDuplicate();
                break;
            case "0":
                System.out.print("Back To Main Menu !!!");
                backMainMenu();
                break;
            case "00":
                System.out.println("Exit !!!");
                System.exit(0);
            default:
                System.out.println("\nError!!!Back To Menu Show Service...");
                showServices();
        }
    }

    // (2.1) show villa-------------------------------------------------------------------
    private static void showAllVilla() {
        int i=1;
        System.out.println();
        System.out.println(" --------------Show All Villa--------------  ");
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.print("\n-------------------- "+i+" --------------------");
            System.out.print(villa.showInformation());
            System.out.println("\n-------------------------------------------");
            i++;
        }

        System.out.println();
        System.out.print("Enter back to menu show services !!! Enter to continue ...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        showServices();
    }

    // (2.2) show house-------------------------------------------------------------------
    private static void showAllHouse() {
        int i=1;
        System.out.println();
        System.out.println(" --------------Show All House--------------  ");
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.print("\n-------------------- "+i+" --------------------");
            System.out.print(house.showInformation());
            System.out.println("\n-------------------------------------------");
            i++;
        }
        System.out.println();
        System.out.print("Enter back to menu show services !!! Enter to continue ...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        showServices();
    }

    // (2.3) show room--------------------------------------------------------------------
    private static void showAllRoom() {
        int i=1;
        System.out.println();
        System.out.println(" --------------Show All Room--------------  ");
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.print("\n-------------------- "+i+" --------------------");
            System.out.print(room.showInformation());
            System.out.println("\n-------------------------------------------");
            i++;
        }
        System.out.println();
        System.out.print("Enter back to menu show services !!! Enter to continue ...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        showServices();
    }

    //(2.4)  show All Villa NotDuplicate---------------------------------------------------
    private static void  showAllVillaNotDuplicate(){
        System.out.println();
        System.out.println(" ---------Show All Villa NotDuplicate---------  ");
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        TreeSet<String> treeSetVilla = new TreeSet<>(new HashSet<>());
       for (int t=0;t<listVilla.size();t++){
           treeSetVilla.add(listVilla.get(t).getNameService());
       }

        int i=1;
        for (String str : treeSetVilla) {
            System.out.println(i +". "+ str);
            i++;
        }
        System.out.println();
        System.out.print("Enter back to menu show services !!! Enter to continue ...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        showServices();

    }

//(2.5) show All House NotDuplicate
    private static void  showAllHouseNotDuplicate(){
        System.out.println();
        System.out.println(" ---------Show All House NotDuplicate---------  ");
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        TreeSet<String> treeSetHouse = new TreeSet<>(new HashSet<>());
        for (int t=0;t<listHouse.size();t++){
            treeSetHouse.add(listHouse.get(t).getNameService());
        }

        int i=1;
        for (String str : treeSetHouse) {
            System.out.println(i +". "+ str);
            i++;
        }
        System.out.println();
        System.out.print("Enter back to menu show services !!! Enter to continue ...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        showServices();
    }

    //(2.6) show All Room NotDuplicate
    private static void  showAllRoomNotDuplicate(){
        System.out.println();
        System.out.println(" ---------Show All Room NotDuplicate---------  ");
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        TreeSet<String> treeSetRoom = new TreeSet<>(new HashSet<>());
        for (int t=0;t<listRoom.size();t++){
            treeSetRoom.add(listRoom.get(t).getNameService());
        }

        int i=1;
        for (String str : treeSetRoom) {
            System.out.println(i +". "+ str);
            i++;
        }
        System.out.println();
        System.out.print("Enter back to menu show services !!! Enter to continue ...");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        showServices();
    }

// (3) Add new customer-----------------------------------------------------------------------------------------------------------
    // menu add new customer--------------------------------------------------------
    private static void addNewCustomer(){
        System.out.println("\n---------------------------------------------------------");
        System.out.println("-------------------Add New Customer-----------------------");
        System.out.println("Menu : " +
                "\n1.Add One New Customer" +
                "\n0.Back To Main Menu" +
                "\n00.Exit" +
                "\nPlease select one function below: ");

        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextLine()){
            case "1":
                addNewOneCustomer();
                break;
            case "0":
                System.out.print("Back to main menu !!!");
                backMainMenu();
                break;
            case "00":
                System.out.println("Exit !!!");
                System.exit(0);
                break;
            default:
                System.out.println("\nError!!!Back To Menu Add New Customer...");
                addNewCustomer();
        }
    }
    // exit menu add new customer--------------------------------------------------------

    // (3.1) add new one customer-------------------------------------------------------------------
    private static void addNewOneCustomer() {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name customer:");
        customer.setName(scanner.nextLine());
        while (!UserExceptionForCustomer.nameException(customer.getName())) {
            System.out.println("Name customer is invalid (Exam : Nguyen A )!!! Please try again !");
            customer.setName(scanner.nextLine());
        }

        System.out.println("Enter Date (DD/MM/YYYY) :");
        customer.setDate(scanner.nextLine());
        while (!UserExceptionForCustomer.birthdayException(customer.getDate())) {
            System.out.println("Birth day is invalid ( birth year from 1900 to 2002) !!! Please try again !!!");
            customer.setDate(scanner.nextLine());
        }

        boolean check=false;
        do {
            System.out.println("Enter Gender(male, female or unknown) : ");
            String choice = scanner.nextLine();
            choice = choice.toLowerCase();
            if (choice.equals("male") | choice.equals("female") | choice.equals("unknown")) {
                customer.setGender(choice);
                check=true;
            }else {
                System.out.println("Gender is invalid !!!");
                System.out.println("Please choose 1 of 3 categories: male, female or unknown .");
            }
        }while (!check);

        System.out.println("Enter idCard :");
        customer.setPassPort(scanner.nextLine());
        while (!UserExceptionForCustomer.idCardException(customer.getPassPort())) {
            System.out.println("IdCard is invalid!!!(Exam :123 456 789 ) .Please try again ! ");
            customer.setPassPort(scanner.nextLine());
        }

        System.out.println("Enter phoneNumber :");
        customer.setPhoneNumber(scanner.nextLine());
        while (!UserExceptionForCustomer.phoneException(customer.getPhoneNumber())){
            System.out.println("Phone number is invalid (phone number must have 9 to 11 number ) .Please try again !");
            customer.setPhoneNumber(scanner.nextLine());
        }

        System.out.println("Enter email:");
        customer.setEmail(scanner.nextLine());
        while (!UserExceptionForCustomer.emailException(customer.getEmail())) {
            System.out.println("Email is invalid (Exam abc@abc.abc) !!! Please try again ! ");
            customer.setEmail(scanner.nextLine());
        }

        check=false;
        do {
            System.out.println("Enter type customer : (Diamond, Platinum, Gold, Silver, Member) : ");
            String choice = scanner.nextLine();
            choice = choice.toLowerCase();
            if (choice.equals("diamond") | choice.equals("platinum") | choice.equals("gold") | choice.equals("silver") | choice.equals("member")) {
                customer.setTypeCustomer(choice);
                check=true;
            }else {
                System.out.println("Type Customer is invalid !!!");
                System.out.println("Please choose 1 of 5 categories: Diamond, Platinum, Gold, Silver, Member .");
            }
        }while (!check);

        System.out.println("Enter address:");
        customer.setAddress(scanner.nextLine());

        check=false;
        do {
            System.out.println("Enter type service (villa,room,house) :");
            String choice = scanner.nextLine();
            choice = choice.toLowerCase();
            if (choice.equals("villa") | choice.equals("house")) {
                customer.setTypeService(choice);
                 makeContract(customer);
                 check=true;
            }else if (choice.equals("room")){
                customer.setTypeService(choice);
                check=true;
            }else {
                System.out.println("Type Service is invalid !!!");
                System.out.println("Please choose 1 of 3 categories: Villa, Room, House .");
            }
        }while (!check);

        ArrayList<Customer> customersList = FuncWriteAndReadFileCSV.getCustomerFromCSV();
        customersList.add(customer);

        FuncWriteAndReadFileCSV.writeCustomerToFileCSV(customersList);
        System.out.print("\nAdd Customer: "
                + customer.getName() +
                " . Successfully!!!"
        );
        System.out.println();
        System.out.println("Back to menu add new customer. Enter to continue....  ");
        scanner.nextLine();
        addNewCustomer();
    }
    // (3.1) exit add new one customer---------------------------------------------------------------

    // makeContract if type service is villa or house-----------------------------------------------
    private static void makeContract(Customer customer){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type Service is "+ customer.getTypeService()+". Invite you to contract..");
        customer.setIdContract(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("Enter Start Day (DD/MM/YYYY) :");
        customer.setStartDay(scanner.nextLine());
        while (!UserExceptionForCustomer.startDayException(customer.getStartDay())) {
            System.out.println("Start day is invalid ( must from 2000 onwards ) !!! Please try again !!!");
            customer.setStartDay(scanner.nextLine());
        }

        System.out.println("Enter End Day (DD/MM/YYYY) :");
        customer.setEndDay(scanner.nextLine());
        while (!UserExceptionForCustomer.endDayException(customer.getEndDay())) {
            System.out.println("End day is invalid ( must from 2000 onwards ) !!! Please try again !!!");
            customer.setEndDay(scanner.nextLine());
        }

        boolean checkMoney=false;
        do {
            try {
                System.out.println("Enter Deposit Amount : ");
                Scanner scannerMoney= new Scanner(System.in);
                customer.setDepositAmount(scannerMoney.nextDouble());
                if (customer.getDepositAmount()<0){
                    System.out.println("Error : Deposit Amount < 0 !!! Please try again");
                }else {
                    checkMoney=true;
                }
            }catch (Exception e){
                System.out.println("Deposit is invalid !!! Please try again");
            }
        }while (!checkMoney);

        checkMoney=false;
        do {
            try {
                System.out.println("Enter Total Money  : ");
                Scanner scannerMoney= new Scanner(System.in);
                customer.setTotalMoney(scannerMoney.nextDouble());
                if (customer.getTotalMoney()<0){
                    System.out.println("Error :Total Money < 0 !!! Please try again");
                }else {
                    checkMoney=true;
                }
            }catch (Exception e){
                System.out.println("Total Money is invalid !!! Please try again");
            }
        }while (!checkMoney);
    }

// (4) show Information Customers-------------------------------------------------------------------------------------------------
private static void showInformationCustomer() {
    System.out.println();
    System.out.println(" --------------Show All Customers--------------  ");
    System.out.println("Sort by name ....");
    ArrayList<Customer> listCustomers = FuncWriteAndReadFileCSV.getCustomerFromCSV();
    Collections.sort(listCustomers, new AgeComparator());
    Collections.sort(listCustomers, new NameComparator());
    for (Customer customer : listCustomers) {
        System.out.println("\n-------------------------------------------");
        System.out.print(customer.showInformation());
        System.out.println("\n-------------------------------------------");
    }
    System.out.println();
    System.out.print("Back to main menu !!! Enter to continue ...");
    Scanner scanner=new Scanner(System.in);
    scanner.nextLine();
    displayMainMenu();
}

//(5) add new Booking-------------------------------------------------------------------------------------------------------------
private static void addNewBooking() {
    int choiceCustomer = 0;

    System.out.println("\n---------------------------------------------------------");
    System.out.println("-------------------Add New Booking-----------------------");
    System.out.println("Choice Customer booking with service !");
    ArrayList<Customer> listCustomers = FuncWriteAndReadFileCSV.getCustomerFromCSV();
    Collections.sort(listCustomers, new AgeComparator());
    Collections.sort(listCustomers, new NameComparator());
    int i = 1;
    for (Customer customer : listCustomers) {
        System.out.println(i + ". " + customer.getName() + " (date: " + customer.getDate() + " ).");
        i++;
    }
    System.out.println("0.Back to main menu.");

    boolean check = false;
    do {
        try {
            System.out.println("Please choice one customer below :  ");
            Scanner scanner = new Scanner(System.in);
            choiceCustomer = scanner.nextInt();
            if (choiceCustomer > listCustomers.size() | choiceCustomer < 0) {
                System.out.println("Choose customer is failed !!! Please try again ! ");
            }else if (choiceCustomer==0){
                System.out.println("Back to main menu !!!");
                displayMainMenu();
            } else {
                check = true;
            }
        } catch (Exception e) {
            System.out.println("Choose customer is failed !!! Please try again ! ");
        }
    } while (!check);

    System.out.println();
    System.out.println("You choose customer : "+listCustomers.get(choiceCustomer-1).getName()+". Please choose service !");
    addCustomerToService();

}

private static void addCustomerToService(){
    System.out.println("Menu service : "+
                    "\n1.Booking villa."+
                    "\n2.Booking house."+
                    "\n3.Booking room."+
                    "\n0.Back to main menu."+
                    "\n00.Exit."
    );
    System.out.println("Choose service below : ");
    Scanner scanner=new Scanner(System.in);
    switch (scanner.nextLine()){
        case "1":
            int choiceVilla=0;
            boolean check=false;
            int i=1;

            System.out.println(" --------------Show All Villa--------------  ");
            ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
            for (Villa villa : listVilla) {
                System.out.print("\n------------------- "+i+" ---------------------");
                System.out.print(villa.showInformation());
                System.out.println("\n-------------------------------------------");
                i++;
            }

            do {
                try {
                    System.out.println("Choose 1 of "+listVilla.size()+" type villa : ");
                    Scanner scannerChooseType =new Scanner(System.in);
                    choiceVilla=scannerChooseType.nextInt();
                    if (choiceVilla>listVilla.size()|choiceVilla<=0){
                        System.out.println("Choose type villa is failed!!! Please try again !");
                    }else {
                        check=true;
                    }
                }catch (Exception e){
                    System.out.println("Choose type villa is failed!!! Please try again !");
                }
            }while (!check);
            System.out.println("Add booking villa successfully !!! Enter back to menu add new booking...");
            scanner.nextLine();
            addNewBooking();
            break;
        case "2":
            int choiceHouse=0;
             check=false;
             i=1;

            System.out.println(" --------------Show All House--------------  ");
            ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
            for (House house : listHouse) {
                System.out.print("\n------------------- "+i+" ---------------------");
                System.out.print(house.showInformation());
                System.out.println("\n-------------------------------------------");
                i++;
            }

            do {
                try {
                    System.out.println("Choose 1 of "+listHouse.size()+" type house : ");
                    Scanner scannerChooseType =new Scanner(System.in);
                    choiceHouse=scannerChooseType.nextInt();
                    if (choiceHouse>listHouse.size()|choiceHouse<=0){
                        System.out.println("Choose type house is failed!!! Please try again !");
                    }else {
                        check=true;
                    }
                }catch (Exception e){
                    System.out.println("Choose type house is failed!!! Please try again !");
                }
            }while (!check);
            System.out.println("Add booking house successfully !!! Enter back to menu add new booking...");
            scanner.nextLine();
            addNewBooking();
            break;
        case "3":
            int choiceRoom=0;
             check=false;
             i=1;

            System.out.println(" --------------Show All Room--------------  ");
            ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
            for (Room room : listRoom) {
                System.out.print("\n------------------- "+i+" ---------------------");
                System.out.print(room.showInformation());
                System.out.println("\n-------------------------------------------");
                i++;
            }

            do {
                try {
                    System.out.println("Choose 1 of "+listRoom.size()+" type room : ");
                    Scanner scannerChooseType =new Scanner(System.in);
                    choiceRoom=scannerChooseType.nextInt();
                    if (choiceRoom>listRoom.size()|choiceRoom<=0){
                        System.out.println("Choose type room is failed!!! Please try again !");
                    }else {
                        check=true;
                    }
                }catch (Exception e){
                    System.out.println("Choose type room is failed!!! Please try again !");
                }
            }while (!check);
            System.out.println("Add booking room successfully !!! Enter back to menu add new booking...");
            scanner.nextLine();
            addNewBooking();
            break;
        case "0":
            System.out.print("Back to main menu ...");
            backMainMenu();
            break;
        case "00":
            System.out.println("Exit !!!");
            System.exit(0);
        default:
            System.out.println("Choose service is failed !!! Back to menu service ! ");
            addCustomerToService();
    }

}

//(6) ShowInformationCustomer
private static void showInformationEmployee(){
        int i=1;
    ArrayList<Employee> listEmployee = FuncWriteAndReadFileCSV.getEmployeeFromCSV();
    for (Employee employee : listEmployee) {
        System.out.println("\n----------------- "+"Id: 00"+i+" -------------------");
        System.out.print(employee.showInformation());
        System.out.println("\n-------------------------------------------");
        i++;
    }
}

// (7)  buy Cinema Ticket 4D
private static void  buyCinemaTicket4D(){
    System.out.println("\n---------------------------------------------------------");
    System.out.println("-------------------- Cinema 4D ------------------------");
    System.out.println();

    int choiceCustomer=0;
    boolean check = false;
    int row=1;

    Queue<String> queueCustomer = new ArrayDeque<>();

    ArrayList<Customer> listCustomers = FuncWriteAndReadFileCSV.getCustomerFromCSV();
    int numberCustomer=listCustomers.size();

    while (numberCustomer!=0) {
        System.out.println("Buy tickets for row "+row+" ...");

        int i = 1;
        for (Customer customer : listCustomers) {
            System.out.println(i + ". " + customer.getName() + " (date: " + customer.getDate() + " ).");
            i++;
        }

        do {
            try {
                System.out.println("Please choice one customer below :  ");
                Scanner scanner = new Scanner(System.in);
                choiceCustomer = scanner.nextInt();
                if (choiceCustomer <= listCustomers.size() && choiceCustomer > 0) {
                    queueCustomer.offer(listCustomers.get(choiceCustomer-1).getName());
                    listCustomers.remove((choiceCustomer-1));
                   check=true;
                } else {
                    System.out.println("Choose customer is failed !!! Please try again ! ");
                }
            } catch (Exception e) {
                System.out.println("Choose customer is failed !!! Please try again ! ");
            }
        } while (!check);


        System.out.println("-----------------------------------------------------");
        row++;
        numberCustomer--;
        check=false;
    }
    printQueueCustomer(queueCustomer);
}

    //print Queue customer
    private static void printQueueCustomer(Queue<String> queueCustomer){
        int i=1;
        while (queueCustomer.size()!=0){
            System.out.println("Row "+i+": "+queueCustomer.peek());
            queueCustomer.poll();
            i++;
        }
        System.out.println("Wishing customer  fun movie !!! Enter back to menu");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        displayMainMenu();
    }

// find Employee
private static void findEmployee(){
    ArrayList<Employee> listEmployee = FuncWriteAndReadFileCSV.getEmployeeFromCSV();
    System.out.println("\n---------------------------------------------------------");
    System.out.println("--------------------Find Employee-----------------------");

    int idFind=0;
    boolean check=false;

    do {
        try {
            System.out.println("Enter id employee need to find (enter 0 to back to find menu) : ");
            Scanner scanner=new Scanner(System.in);
            idFind=scanner.nextInt();
            if (0<idFind&&idFind<11){
                check=true;
            }else {
                System.out.println("Not found !!! Please try again !");
            }
        }catch (Exception e){
            System.out.println("Not found !!! Please try again !");
        }
    }while (!check);

    System.out.println("-----------------------------------------------");
    System.out.println(listEmployee.get(idFind-1).showInformation());
    System.out.println("-----------------------------------------------");
    System.out.println();
    System.out.println("Enter back to main menu .... ");
    Scanner scanner=new Scanner(System.in);
    scanner.nextLine();
    displayMainMenu();

}

// back main menu
    private static void backMainMenu() {
        System.out.println();
        displayMainMenu();
    }
}
