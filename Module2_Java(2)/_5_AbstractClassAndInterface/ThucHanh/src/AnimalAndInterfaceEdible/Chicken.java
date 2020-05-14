package AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "O...O...O";
    }

    @Override
    public String howToEat() {
        return "An Thit ";
    }
}
