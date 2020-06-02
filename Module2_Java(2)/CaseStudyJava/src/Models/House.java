package Models;

public class House extends Services {
    private String roomStandard;
    private String description;
    private int floor;

    public House() {
    }

    public House(String id, String nameService, double area, double rentCost, int maxNumberOfPeople, String typeRent, String roomStandard, String description, int floor) {
        super(id, nameService, area, rentCost, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.description = description;

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
                "\nNumber of floor:" + getFloor();
    }

}
