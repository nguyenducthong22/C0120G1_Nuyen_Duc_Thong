package CCaseStudy.Model.Bean;
import CCaseStudy.Model.Dao.Villa;

import static CCaseStudy.Common.DocVaLuuFile.loadFileVilla;
import static CCaseStudy.Common.DocVaLuuFile.saveFileVilla;
import static CCaseStudy.Common.ValiDate.*;
import static CCaseStudy.Controller.MainController.listVilla;
import static CCaseStudy.Model.Bean.AddService.addService;
public class AddVilla {
    public static void addVilla() {
        Villa villa = new Villa();
        String regex = "";
        addService(villa);
        System.out.println("Mời bạn nhập Room Standard (Standard,Superior,Deluxe,Suite,Executive Suite): ");
        regex = "^(?i)(Standard|Superior|Deluxe|Suite|Executive Suite)$";
        villa.setRoomStandard(checkString(regex, "Room Standard Faill"));
        System.out.println("Mời bạn nhập Accompany Service (Massage,Karaoke,Food,Drink,Car): ");
        regex = "^(?i)(Massage|Karaoke|Food|Drink|Car)$";
        villa.setAccompanyService(checkString(regex, "Accompany Service Faill"));
        regex = "^[1-9][0-9]|100$";
        System.out.println("Mời bạn nhập Area Pool: (from 10 to 100)");
        villa.setAreaPool(checkDouble(regex, "Area Pool Faill"));
        regex = "^[1-9]|[1][0-9]|20$";
        System.out.println("Mời bạn nhập Number Off Floors: (from 1 to 20)");
        villa.setNumberOffFloors(checkInterger(regex, "Number Off Floors Faill"));

        loadFileVilla();
        listVilla.add(villa);
        saveFileVilla();
    }
}

