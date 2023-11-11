public class Aufgabe4d {
    public static void main(String[] args) {
        // Erstes Feld
        char[][] erstesFeld = {
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', '*', '*', '*'},
                {'*', ' ', ' ', '*', ' '}
        };

        // Zweites Feld
        char[][] zweitesFeld = {
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', '*', '*', ' '},
                {'*', ' ', ' ', '*', ' '}
        };

        // Aufruf der Methoden für das erste Feld
        System.out.println("Für das erste Feld:");
        Aufgabe4a.AnzahlSterne.berechneSterneProZeile(erstesFeld);
        Aufgabe4b.AnzahlSterne.berechneSterneProSpalte(erstesFeld);
        Aufgabe4c.AnzahlSterne.berechneAnzahlZeilen(erstesFeld);

        // Trennlinie zwischen den Ausgaben für die beiden Felder
        System.out.println("\n-----------------------------\n");

        // Aufruf der Methoden für das zweite Feld
        System.out.println("Für das zweite Feld:");
        Aufgabe4a.AnzahlSterne.berechneSterneProZeile(zweitesFeld);
        Aufgabe4b.AnzahlSterne.berechneSterneProSpalte(zweitesFeld);
        Aufgabe4c.AnzahlSterne.berechneAnzahlZeilen(zweitesFeld);
    }
}
