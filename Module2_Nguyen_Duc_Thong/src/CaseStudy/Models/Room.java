package CaseStudy.Models;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, double areUsed, double rentCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areUsed, rentCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return "\nId Service : "+super.getId()+
                "\nName Service : "+super.getNameService()+
                "\nArea Used : "+super.getAreUsed()+
                "\nRental Costs : "+super.getRentCosts()+
                "\nMax Number Of People : "+super.getMaxNumberOfPeople()+
                "\nType Rent : "+super.getTypeRent()+
                "\nRoom Standard : "+this.getFreeService();
    }
}
