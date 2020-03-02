package _5_AbstractAndInterface.ThucHanh.LopAnimalVaEdible;

public class main {
    public static void main(String[] args) {
        Orange orange=new Orange();
        System.out.println(orange.howToEat());
        Apple apple=new Apple();
        System.out.println(apple.howToEat());
        Chicken chicken=new Chicken();
        System.out.println(chicken.howToEat());
        System.out.println(chicken.makeSound());
        Tiger tiger=new Tiger();
        System.out.println(tiger.makeSound());
    }
}
