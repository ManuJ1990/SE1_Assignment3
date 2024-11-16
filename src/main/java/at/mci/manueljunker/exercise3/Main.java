package at.mci.manueljunker.exercise3;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Main class to test the functionality of the AutomaticMachine.
 */
public class Main {
    public static void main(String[] args) {
        // Generate random hours for different drink scenarios
        int coffeTime = ThreadLocalRandom.current().nextInt(6, 15); // Random hour between 6 and 14 for coffee
        int teaTime = ThreadLocalRandom.current().nextInt(16, 21); // Random hour between 16 and 20 for tea
        int rndTime = ThreadLocalRandom.current().nextInt(0, 24);  // Random hour between 0 and 23 for any drink
        int earlyMorningTime = 3; // Early morning hour for water

        // Get the singleton instance of the AutomaticMachine
        AutomaticMachine machine = AutomaticMachine.getInstance();
        // Create drinks based on different hours
        machine.createDrink(coffeTime);
        machine.createDrink(teaTime);
        machine.createDrink(earlyMorningTime);
        machine.createDrink(rndTime);
    }
}
