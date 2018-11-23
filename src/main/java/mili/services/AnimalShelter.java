package mili.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();

    public void feed() {
        // 1. same as iterator
        for (Animal animal : this.animals) {
            String eat = animal.eat(new Food(LocalDate.now().plusDays(1), Food.FoodType.MEAT));
            System.out.println(eat);
        }
        // 2.
        /*
        for (int i=0; i<animals.size(); i++){
            Animal animal = animals.get(i);
        }
        // 3.
        Iterator<Animal> iterator = this.animals.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
        }
        */
    }

    public static void main(String[] args) {
        AnimalShelter as = new AnimalShelter();
        GoldenRetriver gr = new GoldenRetriver();
        as.animals.add(gr);
        as.animals.add(new Cat());
        as.feed();
    }

}
