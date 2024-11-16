package at.mci.manueljunker.exercise3;

/**
 * Represents a Tea drink.
 */
public class Tea implements Drink {
    @Override
    public void output() {
        // Output message when tea is being prepared
        System.out.println("es ist zwischen 16:00 und 21 Uhr. Tee wird zubereitet");
    }
}