package mili.services;

public abstract class Dog implements Animal {

    private final String color;
    private Integer nrLegs = DEF_LEGS;
    public static final int DEF_LEGS = 4;

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String eat(Food food) throws FoodException {

        int currentLegs = this.nrLegs;

        if (food == null){
            throw new FoodException("food is null");
        }
        if (food.type == Food.FoodType.MEAT && !food.isExpired())
        {
            this.grow();
            return "bark";
        } else
            return "whimper";
    }

    protected abstract void grow ();
}
