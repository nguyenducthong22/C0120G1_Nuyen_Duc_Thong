package CaseStudy.Commons;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
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
    private static final char DEFAULT_SEPARATOR = ',';//cac tham so cach nhau boi dau phay //
    private static final char DEFAULT_QUOTE = '"';//day nhay mo dong la 1 tham so //
    private static final int NUMBER_OF_LINE_SKIP=1;//So cua dong bo qua de khi doc file bo qua dong tieu de //
    private static final String pathVilla = "src/CaseStudy/Data/Villa.csv";
    private static final String pathHouse = "src/CaseStudy/Data/House.csv";
    private static final String pathRoom = "src/CaseStudy/Data/Room.csv";
    private static final String pathCustomer = "src/CaseStudy/Data/Customer.csv";
    private static String[] headerRecordVilla = new String[]{"id", "nameService", "areaUsed", "rentalCosts",
            "maxNumberOfPeople", "typeRent", "roomStandard", "conventDescription", "areaPool", "numberOfFloor"
    };
    private static String[] headerRecordHouse = new String[]{"id", "nameService", "areaUsed", "rentCosts", "maxNumberOfPeople",
            "typeRent", "roomStandard", "conventDescription", "numberOfFloor"
    };
    private static String[] headerRecordRoom =  new String[]{"id", "nameService", "areaUsed", "rentCosts", "maxNumberOfPeople",
            "typeRent", "freeService"
    };
    private static String[] headerRecordCustomer=new String[]{"id", "name", "gender", "idCard", "phone", "email", "type", "address"
    ,"birthDay"};

    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(),
                        villa.getNameService(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentCosts()),
                        String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getTypeRent(),
                        villa.getRoomStandard(),
                        villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloor())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeHouseToFileCSV(ArrayList<House> arrayListHouse) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayListHouse) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getNameService(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentCosts()),
                        String.valueOf(house.getMaxNumberOfPeople()),
                        house.getTypeRent(), house.getTypeRent(),
                        house.getRoomStandard(),
                        house.getConventDescription(),
                        String.valueOf(house.getNumberOfFloor())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeRoomToFileCSV(ArrayList<Room> arrayListRoom) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayListRoom) {
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getNameService(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRentCosts()),
                        String.valueOf(room.getMaxNumberOfPeople()),
                        room.getTypeRent(), room.getTypeRent(),
                        room.getFreeService()
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Doc file tung dong //
//    public static ArrayList<Villa> getFileCSVToListVilla(){
//        BufferedReader br =null;
//        ArrayList<Villa> listVilla=new ArrayList<>();
//        Path path= Paths.get(pathVilla);
//        if (!Files.exists(path)){
//            try {
//                Writer writer=new FileWriter(pathVilla);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        try {
//            String line;
//            br=new BufferedReader(new FileReader(pathVilla));
//
//            while ((line=br.readLine())!=null){
//                String[] splitData=line.split(",");
//                Villa villa=new Villa();
//                villa.setId(splitData[0]);
//                villa.setNameService(splitData[1]);
//                villa.setAreaUsed(Double.parseDouble(splitData[2]));
//                villa.setRentCosts(Double.parseDouble(splitData[3]));
//                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
//                villa.setTypeRent(splitData[5]);
//                villa.setRoomStandard(splitData[6]);
//                villa.setConvenientDescription(splitData[7]);
//                villa.setAreaPool(Double.parseDouble(splitData[8]));
//                villa.setNumberOfFloor(Integer.parseInt(splitData[9]));
//                listVilla.add(villa);
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return listVilla;
//    }

// doc file voi thu vien //
    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        // noi lai theo dung nhu tieu de cua villa //

        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                .withMappingStrategy(strategy)
                .withSeparator(DEFAULT_SEPARATOR)
                .withQuoteChar(DEFAULT_QUOTE)
                .withSkipLines(NUMBER_OF_LINE_SKIP)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
        } catch (FileNotFoundException ex ) {
            System.out.println(ex.getMessage());
        }
        return(ArrayList<Villa>)csvToBean.parse();
    }

    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getId(),
                        customer.getName(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhone()),
                        customer.getEmail(),
                        customer.getType(),
                        customer.getAddress(),
                        customer.getBirthDay(),
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Customer> getCustomerFromCSV() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        // noi lai theo dung nhu tieu de cua villa //

        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex ) {
            System.out.println(ex.getMessage());
        }
        return(ArrayList<Customer>)csvToBean.parse();
    }
}