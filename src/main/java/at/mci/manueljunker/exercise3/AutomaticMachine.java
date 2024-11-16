package at.mci.manueljunker.exercise3;

/**
 * Singleton class representing an automatic drink machine.
 * Depending on the time of day, the machine will provide different types of drinks: Coffee, Tea, or Water.
 */
public class AutomaticMachine {
    private static AutomaticMachine instance;
    private Drink drink;

    /**
     * Private constructor to prevent instantiation from outside (Singleton pattern).
     */
    private AutomaticMachine() {
    }

    /**
     * Returns the singleton instance of AutomaticMachine.
     * Uses lazy initialization to create the instance only when needed.
     *
     * @return the singleton instance of AutomaticMachine
     */
    public static synchronized AutomaticMachine getInstance() {
        if (instance == null)
            return new AutomaticMachine();

        return instance;
    }


    /**
     * Creates the drink based on the current state of the machine.
     * Outputs the drink that is being prepared.
     *
     * @param currentHour the current hour of the day (0-23)
     */
    public void createDrink(int currentHour) {
        Drink drink = DrinkFactory.createDrink(currentHour);

        if (drink != null) {
            drink.output();
        } else {
            System.out.println("Kein Getränk verfügbar");
        }
    }
}
