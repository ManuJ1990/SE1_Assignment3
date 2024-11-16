package at.mci.manueljunker.exercise3;

/**
 * Represents a Water drink.
 */
public class Water implements Drink {
    @Override
    public void output() {
        // Output message when water is being prepared
        System.out.println("es ist zwischen 21:00 und 06 Uhr. Wasser wird zubereitet");
    }
}
