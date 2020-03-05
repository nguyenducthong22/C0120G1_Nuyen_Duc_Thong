package CaseStudy.Commons;

import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';//cac tham so cach nhau boi dau phay //
    private static final char DEFAULT_QUOTE = '"';//day nhay mo dong la 1 tham so //
    private static final String pathVilla = "src/CaseStudy/Data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"id", "nameService", "areaUsed", "rentalCosts",
            "maxNumberOfPeople", "typeRent", "roomStandard", "conventDescription", "areaPool", "numberOfFloor"
    };

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
                        villa.getId(), villa.getNameService(),
                        String.valueOf(villa.getAreUsed()), String.valueOf(villa.getRentCosts()),
                        String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getTypeRent(), villa.getTypeRent(), villa.getRoomStandard(), villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloor())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}