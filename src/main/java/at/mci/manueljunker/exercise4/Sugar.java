package at.mci.manueljunker.exercise4;

/**
 * Concrete decorator class for adding sugar to a drink.
 */
public class Sugar extends DrinkDecorator {

    /**
     * Constructor for Sugar decorator.
     *
     * @param decoratedDrink the drink to decorate
     */
    public Sugar(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public void output() {
        decoratedDrink.output();
        System.out.print(" + Sugar");
    }
}
