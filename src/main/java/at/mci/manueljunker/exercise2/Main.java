package at.mci.manueljunker.exercise2;

/**
 * Die Klasse {@code Main} enthält die Hauptmethode und demonstriert die Verwendung des Periodensystems mit Testdaten.
 * <p>
 * In dieser Klasse werden die Entwurfsmuster **Singleton** und **Factory Method** angewendet.
 * </p>
 */
public class Main {
    /**
     * Die Hauptmethode der Anwendung.
     *
     * @param args die Befehlszeilenargumente
     */
    public static void main(String[] args) {
        // Abrufen der einzigen Instanz des Periodensystems (Singleton-Muster)
        PeriodicalTable periodicalTable = PeriodicalTable.getInstance();

        // Erstellung einer ElementFactory zur Erzeugung von Elementen (Factory Method Muster)
        ElementFactory factory = new ElementFactory();

        // Hinzufügen von Testdaten
        periodicalTable.addElement(factory.createElement("Wasserstoff", "H", 1));
        periodicalTable.addElement(factory.createElement("Helium", "He", 2));
        periodicalTable.addElement(factory.createElement("Lithium", "Li", 3));
        periodicalTable.addElement(factory.createElement("Beryllium", "Be", 4));
        periodicalTable.addElement(factory.createElement("Bor", "B", 5));

        // Anzeige aller Elemente
        System.out.println("Alle Elemente im Periodensystem:");
        periodicalTable.displayAllElements();

        // Abrufen und Anzeigen eines spezifischen Elements
        int atomicNumberToFind = 3;
        Element foundElement = periodicalTable.getElement(atomicNumberToFind);
        if (foundElement != null) {
            System.out.println("\nElement mit Ordnungszahl " + atomicNumberToFind + ":");
            System.out.println(foundElement);
        } else {
            System.out.println("Element nicht gefunden.");
        }
    }
}
