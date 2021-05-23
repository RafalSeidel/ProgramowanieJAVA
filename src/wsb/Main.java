package wsb;

import wsb.devices.Car;
import wsb.devices.Phone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Human andrzej = new Human("Andrzej", "Kowalski", "CEO");
        Human human = new Human("Homo", "Sapiens", "first human");
        Human baska = new Human("Baśka", "Nowak", "developer");
        Human rysiek = new Human("Ryszard", "Lewandowski", "king of a jungle");

        Animal fox = new Animal("Lis", false, Species.CATS);
        Animal bociek = new Animal("Bocian", true, Species.BIRDS);
        Animal bulldog = new Animal("Reksio", false, 16.7, Species.DOGS);
        Animal fish = new Animal("Nemo", false, Species.FISHES);

        Phone cegla = new Phone("Nokia", "3310", 0.5f, false);
        Phone smart = new Phone("Xiaomi", "Redmi 8T", 6.8f, true);
        Phone cegla2 = new Phone("Nokia", "6380i", 1.5f, false);

        Animal.weightCompare(bociek, fox);

        ArrayList<Human> humans = new ArrayList<>(Arrays.asList(andrzej, human, baska, rysiek));

        humans.forEach(human1 -> {
            System.out.println(human1.getFirstName());
            System.out.println(human1.getPosition() + '\n');
        });

        fish.takeForAWalk();
        fish.takeForAWalk();
        fish.takeForAWalk();
        fish.feed();
        fish.feed();
        fish.feed();
        fish.takeForAWalk();

        Car car1 = new Car(CarBrands.PEUGEOT, "508", 2020);
        Car car2 = new Car(CarBrands.PEUGEOT, "508", 2020);
        Car car3 = new Car(CarBrands.PEUGEOT, "RCZ", 2016);
        car3.setCarValue(15000);
        human.setCar(car1);

        System.out.println(car1.equals(car2));

        System.out.println(car3);
        System.out.println(cegla2);
        System.out.println(rysiek);
        System.out.println(bociek);

        andrzej.getSalary();
        andrzej.setSalary(2500);
        andrzej.getSalary();
        andrzej.setCar(car3);
        andrzej.getCar();
    }
}