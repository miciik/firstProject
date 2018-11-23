package mili.services;

import java.time.LocalDate;
import java.util.Date;

public class Food {

    private  LocalDate expiresOn;
    public FoodType type;

    public Food (LocalDate date, FoodType type) {
        this.expiresOn = date;
        this.type = type;
    }

    public boolean isExpired() {
        return this.expiresOn.isBefore(LocalDate.now());
    }

    public static enum FoodType {
        MEAT,
        FISH,
        VEGETABLES;
    }

}
