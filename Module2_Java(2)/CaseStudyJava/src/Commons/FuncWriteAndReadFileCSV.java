package Commons;


import Models.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathCustomer="src/Data/Customer.csv";
    private static final String pathEmployee="src/Data/Employee.csv";

    private static String[] headerRecordVilla= new String[]{
            "id", "nameService", "area", "rentCost", "maxNumberOfPeople", "typeRent",
            "roomStandard", "description", "poolArea", "floor"
    };
    private static String[] headerRecordHouse= new String[]{
            "id", "nameService", "area", "rentCost", "maxNumberOfPeople", "typeRent",
            "roomStandard", "description","floor"
    };
    private static String[] headerRecordRoom= new String[]{
            "id", "nameService", "area", "rentCost", "maxNumberOfPeople", "typeRent", "bonus"
    };
    private static String[] headerRecordCustomer = new String[]{
            "name", "date", "gender",  "passPort", "phoneNumber", "email", "typeCustomer", "address",  "typeService"
            ,"idContract" ,"startDay" ,"endDay" ,"depositAmount" ,"totalMoney"
    };
    private static String[] getHeaderRecordEmployee= new String[]{
            "id", "name", "Date", "gender", "passPort", "phoneNumber", "Email", "academicLevel", "position", "salary"
    };
    private static final int NUM_OF_LINE_SKIP = 1;

    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList) {
        try(Writer writer = new FileWriter(pathCustomer);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)){
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getName(),
                        customer.getDate(),
                        customer.getGender(),
                        customer.getPassPort(),
                        customer.getPhoneNumber(),
                        customer.getEmail(),
                        customer.getTypeCustomer(),
                        customer.getAddress(),
                        String.valueOf(customer.getTypeService()),
                        customer.getIdContract(),
                        customer.getStartDay(),
                        customer.getEndDay(),
                        String.valueOf(customer.getDepositAmount()),
                        String.valueOf(customer.getTotalMoney()),

                });
            }
        } catch (IOException ex){
            System.out.print(ex.getMessage());
        }
    }

    public static ArrayList<Customer> getCustomerFromCSV() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }


    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)){
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getNameService(),
                        String.valueOf(villa.getArea()),
                        String.valueOf(villa.getRentCost()),
                        String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getTypeRent(), villa.getRoomStandard(),
                        villa.getDescription(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getFloor())
                });
            }
        } catch (IOException ex){
            System.out.print(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    public static void writeHouseToFileCSV(ArrayList<House> arrayList) {
        try(Writer writer = new FileWriter(pathHouse);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)){
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getNameService(),
                        String.valueOf(house.getArea()),
                        String.valueOf(house.getRentCost()),
                        String.valueOf(house.getMaxNumberOfPeople()),
                        house.getTypeRent(), house.getRoomStandard(),
                        house.getDescription(),
                        String.valueOf(house.getFloor())
                });
            }
        } catch (IOException ex){
            System.out.print(ex.getMessage());
        }
    }

    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try(Writer writer = new FileWriter(pathRoom);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)){
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getNameService(),
                        String.valueOf(room.getArea()),
                        String.valueOf(room.getRentCost()),
                        String.valueOf(room.getMaxNumberOfPeople()),
                        room.getTypeRent(),
                        String.valueOf(room.getBonus())
                });

            }
        } catch (IOException ex){
            System.out.print(ex.getMessage());
        }
    }

    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

    public static void writeEmployeeToFileCSV(ArrayList<Employee> arrayList) {
        try(Writer writer = new FileWriter(pathEmployee);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)){
            csvWriter.writeNext(getHeaderRecordEmployee);
            for (Employee employee : arrayList) {
                csvWriter.writeNext(new String[]{
                        employee.getId(),
                        employee.getName(),
                        employee.getDate(),
                        employee.getGender(),
                        employee.getPassPort(),
                        employee.getPhoneNumber(),
                        employee.getEmail(),
                        employee.getAcademicLevel(),
                        employee.getPosition(),
                        employee.getSalary(),
                });
            }
        } catch (IOException ex){
            System.out.print(ex.getMessage());
        }
    }

    public static ArrayList<Employee> getEmployeeFromCSV() {
        Path path = Paths.get(pathEmployee);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathEmployee);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Employee.class);
        strategy.setColumnMapping(getHeaderRecordEmployee);
        CsvToBean<Employee> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Employee>(new FileReader(pathEmployee))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Employee>) csvToBean.parse();
    }


}
