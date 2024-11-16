package at.mci.manueljunker.exercise2;

/**
 * Die Klasse {@code Element} repräsentiert ein chemisches Element mit Name, Symbol und Ordnungszahl.
 */
public class Element {
    /**
     * Der Name des Elements.
     */
    private String name;

    /**
     * Das Symbol des Elements.
     */
    private String symbol;

    /**
     * Die Ordnungszahl des Elements.
     */
    private int atomicNumber;

    /**
     * Konstruktor zur Initialisierung eines neuen Elements mit den angegebenen Attributen.
     *
     * @param name         der Name des Elements
     * @param symbol       das Symbol des Elements
     * @param atomicNumber die Ordnungszahl des Elements
     */
    public Element(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    /**
     * Gibt den Namen des Elements zurück.
     *
     * @return der Name des Elements
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt das Symbol des Elements zurück.
     *
     * @return das Symbol des Elements
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gibt die Ordnungszahl des Elements zurück.
     *
     * @return die Ordnungszahl des Elements
     */
    public int getAtomicNumber() {
        return atomicNumber;
    }

    /**
     * Gibt eine String-Repräsentation des Elements zurück.
     *
     * @return eine String-Darstellung des Elements
     */
    @Override
    public String toString() {
        return "Element{" +
                "Name='" + name + '\'' +
                ", Symbol='" + symbol + '\'' +
                ", Ordnungszahl=" + atomicNumber +
                '}';
    }
}
