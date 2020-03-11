package CCaseStudy.Model.Bean;
import CCaseStudy.Model.Dao.House;
import CCaseStudy.Model.Dao.Room;
import CCaseStudy.Model.Dao.Service;
import CCaseStudy.Model.Dao.Villa;

import java.util.UUID;

import static CCaseStudy.Common.ValiDate.*;
import static CCaseStudy.Controller.MainController.sc;
public class AddService {
    public static Service addService(Service service){
        String regex = "";
        service.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        if (service instanceof Villa){
            System.out.println("Enter name'vilaa (Exam : V1) : ");
            regex = "^[V][0-9]$";
        }else if (service instanceof House){
            System.out.println("Enter name'house (Exam : H1) : ");
            regex = "^[H][0-9]$";
        }else if (service instanceof Room){
            System.out.println("Enter name'room (Exam : R1) : ");
            regex = "^[R][0-9]$";
        }
        service.setServiceName(checkString(regex,"Name Service is invalid !!!"));

        System.out.println("Enter Area Used (Area Used must more than 30): ");
        regex="^[3-9][1-9]+$";
        service.setAreaUser(checkInterger(regex,"Area Used is invalid !!!"));

        System.out.println("Enter Rental Costs (more than 0):");
        regex="^[1-9]+$";
        service.setRentalCosts(checkDouble(regex,"Rental Costs is invalid !!!"));

        System.out.println("Enter Number Of People(more than 0 ):");
        regex="^[1-9]+$";
        service.setMaxNumberOfPeople(checkInterger(regex,"Number of people is invalid !!!"));
        sc.nextLine();

        System.out.println("Enter Type Rent :");
        regex="^[A-z]$";
        service.setTypeRent(checkString(regex,"Type Rent is invalid !!!"));
        return service;
    }
}
