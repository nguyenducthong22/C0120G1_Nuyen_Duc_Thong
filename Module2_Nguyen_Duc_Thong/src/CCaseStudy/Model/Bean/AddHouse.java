package CCaseStudy.Model.Bean;
import CCaseStudy.Model.Dao.House;
import CCaseStudy.Model.Dao.Service;

import static CCaseStudy.Common.DocVaLuuFile.loadFileHouse;
import static CCaseStudy.Common.DocVaLuuFile.saveFileHouse;
import static CCaseStudy.Common.ValiDate.*;
import static CCaseStudy.Controller.MainController.listHouse;
public class AddHouse {
    public static void addHouse() {
    Service house = new House();
        AddService.addService(house);
        System.out.println("Mời bạn nhập Room Standard (Standard,Superior,Deluxe,Suite,Executive Suite): ");
    String regex="^(?i)(Standard|Superior|Deluxe|Suite|Executive Suite)$";
        ((House) house).setRoomStandard(checkStringLowerCase(regex,"Enter Room Standard Failed!"));
        System.out.println("Mời bạn nhập Accompany Service (Massage,Karaoke,Food,Drink,Car): ");
    regex="^(?i)(Massage|Karaoke|Food|Drink|Car)$";
        ((House) house).setAccompanyService(checkStringLowerCase(regex,"Enter Accompany Service Failed!"));
    regex="^[1-9]|[1][0-9]|20$";
        System.out.println("Mời bạn nhập Number Off Floors (from 1 to 20): ");
        ((House) house).setNumberOffFloors(checkInterger(regex,"Enter Number Off Floors Failed!"));

    loadFileHouse();
        listHouse.add( ((House) house));
    saveFileHouse();
}
}

