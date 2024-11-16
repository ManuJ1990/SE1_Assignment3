package at.mci.manueljunker.exercise2;

import java.util.HashMap;
import java.util.Map;

/**
 * Die Klasse {@code PeriodicalTable} implementiert das **Singleton-Patterns** und verwaltet eine Sammlung von Elementen.
 */
public class PeriodicalTable {
    /**
     * Die einzige Instanz des Periodensystems.
     */
    private static PeriodicalTable instance;

    /**
     * Eine Map zur Speicherung der Elemente anhand ihrer Ordnungszahl.
     */
    private Map<Integer, Element> elements;

    /**
     * Privater Konstruktor, um die Instanziierung von außen zu verhindern.
     */
    private PeriodicalTable() {
        elements = new HashMap<>();
    }

    /**
     * Gibt die einzige Instanz des Periodensystems zurück.
     *
     * @return die Instanz des Periodensystems
     */
    public static synchronized PeriodicalTable getInstance() {
        if (instance == null) {
            instance = new PeriodicalTable();
        }
        return instance;
    }

    /**
     * Fügt ein Element zum Periodensystem hinzu.
     *
     * @param element das hinzuzufügende Element
     */
    public void addElement(Element element) {
        elements.put(element.getAtomicNumber(), element);
    }

    /**
     * Gibt ein Element anhand der Ordnungszahl zurück.
     *
     * @param atomicNumber die Ordnungszahl des Elements
     * @return das entsprechende Element oder {@code null}, wenn nicht vorhanden
     */
    public Element getElement(int atomicNumber) {
        return elements.get(atomicNumber);
    }

    /**
     * Zeigt alle im Periodensystem gespeicherten Elemente an.
     */
    public void displayAllElements() {
        for (Element element : elements.values()) {
            System.out.println(element);
        }
    }

}
