package at.mci.manueljunker.exercise4;

/**
 * Concrete decorator class for adding cream to a drink.
 */
public class Cream extends DrinkDecorator {

    /**
     * Constructor for Cream decorator.
     *
     * @param decoratedDrink the drink to decorate
     */
    public Cream(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public void output() {
        decoratedDrink.output();
        System.out.print(" + Cream");
    }
}
