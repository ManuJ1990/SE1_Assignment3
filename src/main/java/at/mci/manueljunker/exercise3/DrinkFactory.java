package at.mci.manueljunker.exercise3;

public class DrinkFactory {
    public static Drink createDrink(int currentHour) {
        if (currentHour >= 6 && currentHour < 15) {
            return new Coffee();
        } else if (currentHour >= 16 && currentHour < 21) {
            return new Tea();
        } else {
            return new Water();
        }
    }
}
