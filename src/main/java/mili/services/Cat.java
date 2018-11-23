package mili.services;

public class Cat implements Animal{


    @Override
    public String eat(Food food) {
        if (food.type == Food.FoodType.MEAT )
        {
            this.purr();
            return "meow";
        } else
            return "hiss";
    }

    private void purr() {

    }

}
