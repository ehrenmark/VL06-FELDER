public class Aufgabe5c {

    public static void main(String[] args) {
        // Beispielaufruf
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int spaltenIndex = 1; // Beispielindex

        int[] spalte = getSpalte(matrix, spaltenIndex);

        // Ausgabe der j-ten Spalte
        System.out.print("Die " + spaltenIndex + "-te Spalte: ");
        for (int element : spalte) {
            System.out.print(element + " ");
        }
    }

    public static int[] getSpalte(int[][] B, int j) {
        // Überprüfen, ob der Index j gültig ist
        if (j < 0 || j >= B[0].length) {
            throw new IllegalArgumentException("Ungültiger Spaltenindex.");
        }

        // Kopie der j-ten Spalte erstellen
        int[] spalte = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            spalte[i] = B[i][j];
        }

        return spalte;
    }
}
