package CaseStudy.Models;

public class Villa extends Service {
    private String roomStandard;// Tieu chuan phong //
    private String convenientDescription;// Tien ich //
    private double areaPool;// dien tich ho boi //
    private int numberOfFloor;// So tang //

    public Villa() {
    }

    public Villa(String id, String nameService, double areUsed, double rentCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloor) {
        super(id, nameService, areUsed, rentCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
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
               "\nConvent Description : "+this.getConvenientDescription()+
               "\nArea Pool : "+this.getAreaPool()+
               "\nNumber Of Floor : "+this.getNumberOfFloor();
    }
}
