package CaseStudy.Models;

public class House extends Service {
    private String roomStandard;
    private String conventDescription;
    private int numberOfFloor;

    public House() {
    }

    public House(String id, String nameService, double areUsed, double rentCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String conventDescription, int numberOfFloor) {
        super(id, nameService, areUsed, rentCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.conventDescription = conventDescription;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConventDescription() {
        return conventDescription;
    }

    public void setConventDescription(String conventDescription) {
        this.conventDescription = conventDescription;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfo() {
        return "\nId Service : "+super.getId()+
                "\nName Service : "+super.getNameService()+
                "\nArea Used : "+super.getAreUsed()+
                "\nRental Costs : "+super.getRentCosts()+
                "\nMax Number Of People : "+super.getMaxNumberOfPeople()+
                "\nType Rent : "+super.getTypeRent()+
                "\nRoom Standard : "+this.getRoomStandard()+
                "\nNumber Of Floor : "+this.getNumberOfFloor();
    }
}
