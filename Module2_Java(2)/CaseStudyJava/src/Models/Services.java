package Models;



public abstract class Services   {
    private String id;
    private String  nameService;
    private double area;
    private double rentCost;
    private int maxNumberOfPeople;
    private String typeRent;

    public Services() {
    }

    public Services(String id, String nameService, double area, double rentCost, int maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.rentCost = rentCost;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInformation();
}
