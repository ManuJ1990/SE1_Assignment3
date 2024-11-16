package at.mci.manueljunker.exercise4;

/**
 * Interface representing a generic drink.
 */
public interface Drink {

    /**
     * Outputs the details of the drink.
     */
    void output();

    /**
     * Sets the temperature of the drink.
     *
     * @param temperature the desired temperature
     */
    void setTemperature(Temperature temperature);

    /**
     * Gets the temperature of the drink.
     *
     * @return the current temperature
     */
    Temperature getTemperature();

    /**
     * Sets the size of the drink.
     *
     * @param size the desired size
     */
    void setSize(Size size);

    /**
     * Gets the size of the drink.
     *
     * @return the current size
     */
    Size getSize();
}
