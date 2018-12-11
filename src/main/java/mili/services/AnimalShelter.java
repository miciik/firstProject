package mili.services;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiConsumer;

public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();

    private Animal[] animalsarray = new Animal[10];

    private Map<Integer, Animal> animalmap = new HashMap<>();

    public void feed() {
        // 1. same as iterator
        for (Animal animal : this.animals) {
            String eat = null;
            try {
                eat = animal.eat(new Food(LocalDate.now().plusDays(1), Food.FoodType.MEAT));
            } catch (FoodException e) {
                e.printStackTrace();
            }
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
        try {
            Animal zivotinja = new GoldenRetriver();
            zivotinja.eat(null);
        }
        /* catch (Exception e) {

        } */
        catch (NullPointerException e) {
            System.out.println("The animal didn't like the food");
            e.printStackTrace();
        }
        catch (FoodException e) {
            System.out.println("Handled exception");
        }

        as.animalsarray[0] = new Cat();
        //as.animalsarray[11] = new Cat();
        for (Animal a : as.animalsarray) {

        }

        as.animalmap.put(1, new GoldenRetriver());
        as.animalmap.put(12, new Cat());

        System.out.println("Value at index 1: " + Objects.toString(as.animalmap.get(1)));
        System.out.println("Value at index 2: " + Objects.toString(as.animalmap.get(2)));

        for (Animal a : as.animalmap.values()) {

        }

        for (Integer i : as.animalmap.keySet()) {
           Animal a = as.animalmap.get(i); // don't do this!  Bad performance
        }

       final AnimalMapFunction function = new AnimalMapFunction();

        for (Map.Entry<Integer, Animal> entry : as.animalmap.entrySet()) {
            function.accept(entry.getKey(), entry.getValue());
        }

         as.animalmap.forEach(new BiConsumer<Integer, Animal>() {
             @Override
             public void accept(Integer integer, Animal animal) {
                 function.accept(integer, animal);
             }
         });

        as.animalmap.forEach((integer, animal) -> {
            function.accept(integer, animal);
        });

    }

    private static class AnimalMapFunction implements BiConsumer<Integer, Animal> {
        @Override
        public void accept(Integer key, Animal value) {
            System.out.println("The Animal at " + key + " is a " + value.getClass());
        }
    }

}
