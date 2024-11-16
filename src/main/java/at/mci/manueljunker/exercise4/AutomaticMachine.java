package at.mci.manueljunker.exercise4;

import java.util.Scanner;

/**
 * Singleton class representing an automatic drink machine.
 */
public class AutomaticMachine {
    private static AutomaticMachine instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private AutomaticMachine() {
    }

    /**
     * Gets the single instance of AutomaticMachine.
     *
     * @return the instance
     */
    public static synchronized AutomaticMachine getInstance() {
        if (instance == null) {
            instance = new AutomaticMachine();
        }
        return instance;
    }

    /**
     * Creates a drink based on the current hour and user preferences.
     *
     * @param currentHour the current hour (0-23)
     */
    public void createDrink(int currentHour) {
        Drink drink = DrinkFactory.createDrink(currentHour);

        if (drink != null) {
            Scanner scanner = new Scanner(System.in);

            // Select size
            System.out.println("Please select the size:");
            System.out.println("1 - Small");
            System.out.println("2 - Medium");
            System.out.println("3 - Large");
            System.out.print("Your choice: ");
            int sizeChoice = scanner.nextInt();
            switch (sizeChoice) {
                case 1:
                    drink.setSize(Size.SMALL);
                    break;
                case 2:
                    drink.setSize(Size.MEDIUM);
                    break;
                case 3:
                    drink.setSize(Size.LARGE);
                    break;
                default:
                    System.out.println("Invalid input, default size Medium selected.");
                    drink.setSize(Size.MEDIUM);
                    break;
            }

            // Select temperature
            System.out.println("Please select the temperature:");
            System.out.println("1 - Cold");
            System.out.println("2 - Warm");
            System.out.println("3 - Hot");
            System.out.print("Your choice: ");
            int tempChoice = scanner.nextInt();
            switch (tempChoice) {
                case 1:
                    drink.setTemperature(Temperature.COLD);
                    break;
                case 2:
                    drink.setTemperature(Temperature.WARM);
                    break;
                case 3:
                    drink.setTemperature(Temperature.HOT);
                    break;
                default:
                    System.out.println("Invalid input, default temperature Hot selected.");
                    drink.setTemperature(Temperature.HOT);
                    break;
            }

            // Add ingredients
            scanner.nextLine(); // Consume newline

            System.out.print("Would you like to add Milk? (y/n): ");
            String milkChoice = scanner.nextLine();
            if (milkChoice.equalsIgnoreCase("y")) {
                drink = new Milk(drink);
            }

            System.out.print("Would you like to add Cream? (y/n): ");
            String creamChoice = scanner.nextLine();
            if (creamChoice.equalsIgnoreCase("y")) {
                drink = new Cream(drink);
            }

            System.out.print("Would you like to add Sugar? (y/n): ");
            String sugarChoice = scanner.nextLine();
            if (sugarChoice.equalsIgnoreCase("y")) {
                drink = new Sugar(drink);
            }

            // Output the final drink
            System.out.println("\nYour drink is being prepared:");
            drink.output();
            System.out.println();
        } else {
            System.out.println("No drink available at this time.");
        }
    }
}
