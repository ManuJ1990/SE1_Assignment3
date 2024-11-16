package at.mci.manueljunker.exercise2;

/**
 * Die Klasse {@code ElementFactory} kapselt die Erstellung von {@code Element}-Objekten.
 * <p>
 * Dies ist eine Implementierung des **Factory Method** Patterns.
 * </p>
 */
public class ElementFactory {
    /**
     * Erstellt ein neues {@code Element}-Objekt mit den angegebenen Attributen.
     *
     * @param name         der Name des Elements
     * @param symbol       das Symbol des Elements
     * @param atomicNumber die Ordnungszahl des Elements
     * @return ein neues {@code Element}-Objekt
     */
    public Element createElement(String name, String symbol, int atomicNumber) {
        return new Element(name, symbol, atomicNumber);
    }
}
