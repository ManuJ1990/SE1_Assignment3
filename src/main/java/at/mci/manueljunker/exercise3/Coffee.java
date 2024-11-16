package at.mci.manueljunker.exercise3;

/**
 * Represents a Coffee drink.
 */
public class Coffee implements Drink {
    @Override
    public void output() {
        // Output message when coffee is being prepared
        System.out.println("es ist zwischen 06:00 und 15 Uhr. Kaffee wird zubereitet");
    }

}
