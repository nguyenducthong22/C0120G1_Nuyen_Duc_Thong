package CaseStudy2.Models;

public class Villa extends Services {
    private String roomStandard;
    private String description;
    private double poolArea;
    private int floor;

    public Villa() {
    }
    public Villa(String id, String nameService, double area, double rentCost,
                 int maxNumberOfPeople, String typeRent, String roomStandard,
                 String description, double poolArea, int floor) {
        super(id, nameService, area, rentCost, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }



    @Override
    public String showInformation() {
        return "\nId Service:" + super.getId() +
                "\nName service:" + super.getNameService() +
                "\nArea used:" + super.getArea() +
                "\nRental cost:" + super.getRentCost() +
                "\nMax number people:" + super.getMaxNumberOfPeople() +
                "\nType rent:" + super.getTypeRent() +
                "\nRoom standard:" + getRoomStandard() +
                "\nDescription:" + getDescription() +
                "\nPool Area:" + getPoolArea() +
                "\nNumber of floor:" + getFloor();
    }

}