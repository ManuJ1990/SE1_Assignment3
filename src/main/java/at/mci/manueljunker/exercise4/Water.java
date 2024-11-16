package at.mci.manueljunker.exercise4;

/**
 * Class representing a Water drink.
 */
public class Water implements Drink {
    private Temperature temperature;
    private Size size;

    /**
     * Constructor initializes default temperature and size.
     */
    public Water() {
        // Set default values
        this.temperature = Temperature.COLD;
        this.size = Size.MEDIUM;
    }

    @Override
    public void output() {
        System.out.print(size + " Water (" + temperature + ")");
    }

    @Override
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public Temperature getTemperature() {
        return this.temperature;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public Size getSize() {
        return this.size;
    }
}
