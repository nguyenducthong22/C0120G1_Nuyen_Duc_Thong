package CaseStudy2.Models;

public class Room extends Services {
    private String Bonus;
    public Room(String id, String nameService, double area, double rentCost, int maxNumberOfPeople, String typeRent, String bonus) {
        super(id, nameService, area, rentCost, maxNumberOfPeople, typeRent);
        this.Bonus = bonus;
    }
    public Room() {

    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String bonus) {
        Bonus = bonus;
    }

    @Override
    public String showInformation() {
        return "\nId Service:" + super.getId() +
                "\nName service:" + super.getNameService() +
                "\nArea used:" + super.getArea() +
                "\nRental cost:" + super.getRentCost() +
                "\nMax number people:" + super.getMaxNumberOfPeople() +
                "\nType rent:" + super.getTypeRent() +
                "\nNumber of floor:" + getBonus();
    }
}
