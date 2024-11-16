package at.mci.manueljunker.exercise4;

/**
 * Class representing a Coffee drink.
 */
public class Coffee implements Drink {
    private Temperature temperature;
    private Size size;

    /**
     * Constructor initializes default temperature and size.
     */
    public Coffee() {
        // Set default values
        this.temperature = Temperature.HOT;
        this.size = Size.MEDIUM;
    }

    @Override
    public void output() {
        System.out.print(size + " Coffee (" + temperature + ")");
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
