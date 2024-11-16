package at.mci.manueljunker.exercise4;

/**
 * Concrete decorator class for adding milk to a drink.
 */
public class Milk extends DrinkDecorator {

    /**
     * Constructor for Milk decorator.
     *
     * @param decoratedDrink the drink to decorate
     */
    public Milk(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public void output() {
        decoratedDrink.output();
        System.out.print(" + Milk");
    }
}
