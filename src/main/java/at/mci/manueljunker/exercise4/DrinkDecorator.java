package at.mci.manueljunker.exercise4;

/**
 * Abstract decorator class for adding ingredients to drinks.
 */
public abstract class DrinkDecorator implements Drink {
    protected Drink decoratedDrink;

    /**
     * Constructor for the decorator.
     *
     * @param decoratedDrink the drink to decorate
     */
    public DrinkDecorator(Drink decoratedDrink) {
        this.decoratedDrink = decoratedDrink;
    }

    @Override
    public void output() {
        decoratedDrink.output();
    }

    @Override
    public void setTemperature(Temperature temperature) {
        decoratedDrink.setTemperature(temperature);
    }

    @Override
    public Temperature getTemperature() {
        return decoratedDrink.getTemperature();
    }

    @Override
    public void setSize(Size size) {
        decoratedDrink.setSize(size);
    }

    @Override
    public Size getSize() {
        return decoratedDrink.getSize();
    }
}
