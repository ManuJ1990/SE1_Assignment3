package at.mci.manueljunker.exercise4;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Main class to test the automatic drink machine.
 */
public class Main {
    public static void main(String[] args) {
        // Generate a random hour between 0 and 23
        int currentHour = ThreadLocalRandom.current().nextInt(0, 24);
        System.out.println("Current time: " + currentHour + " o'clock");

        // Get the singleton instance of the automatic machine
        AutomaticMachine machine = AutomaticMachine.getInstance();

        // Create and prepare the drink based on the current hour
        machine.createDrink(currentHour);
    }
}
