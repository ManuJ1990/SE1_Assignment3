package at.mci.manueljunker.exercise4;

/**
 * Factory class to create drinks based on the current hour.
 */
public class DrinkFactory {

    /**
     * Creates a drink based on the current hour.
     *
     * @param currentHour the current hour (0-23)
     * @return a Drink object
     */
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
