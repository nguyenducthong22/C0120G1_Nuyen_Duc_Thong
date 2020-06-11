package CCaseStudy.Model.Bean;
import CCaseStudy.Model.Dao.Room;
import CCaseStudy.Model.Dao.Service;

import static CCaseStudy.Common.DocVaLuuFile.loadFileRoom;
import static CCaseStudy.Common.DocVaLuuFile.saveFileRoom;
import static CCaseStudy.Controller.MainController.listRoom;
import static CCaseStudy.Controller.MainController.sc;
public class AddRoom {
    public static void addRoom() {
        Service room = new Room();
        AddService.addService(room);
        System.out.println("Mời bạn nhập Free Service: ");
        ((Room) room).setFreeService(sc.nextLine());

        loadFileRoom();
        listRoom.add((Room) room);
        saveFileRoom();
    }
}
