package CaseStudy.Models;

public abstract class Service {
    private String id;
    private String nameService;
    private double areUsed;
    private double rentCosts;
    private int maxNumberOfPeople;
    private String typeRent;

    public Service() {
    }

    public Service(String id, String nameService, double areUsed, double rentCosts, int maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areUsed = areUsed;
        this.rentCosts = rentCosts;
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

    public double getAreUsed() {
        return areUsed;
    }

    public void setAreUsed(double areUsed) {
        this.areUsed = areUsed;
    }

    public double getRentCosts() {
        return rentCosts;
    }

    public void setRentCosts(double rentCosts) {
        this.rentCosts = rentCosts;
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

    public abstract String showInfo();

}
