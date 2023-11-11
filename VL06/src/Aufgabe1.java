

//a) Heap-Speicher
//b) Jedes Element wird zu Anfang false sein.
//c)
public class Aufgabe1 {
    public static void main(String[] args) {
            // Annahme: Ein 2D-Feld mit dem Namen "zweidimensionalesFeld"
                    int[][] zweidimensionalesFeld = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    };

            // Bestimmen Sie die Länge der 3. Zeile
                    int laengeDerDrittenZeile = zweidimensionalesFeld[2].length;

            // Ausgabe der Länge
                    System.out.println("Länge der 3. Zeile: " + laengeDerDrittenZeile);

    }
}