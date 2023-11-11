public class Aufgabe5d {

    public static class MatrixOperationen {

        public static void main(String[] args) {
            // Beispielaufruf
            int[][] matrixA = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrixB = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            int[][] produktMatrix = matrixProdukt(matrixA, matrixB);

            // Ausgabe der Produktmatrix
            System.out.println("Das Produkt der Matrizen A und B ist:");
            for (int[] row : produktMatrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        public static int[][] matrixProdukt(int[][] A, int[][] B) {
            // Überprüfen, ob die Matrizen für das Produkt geeignet sind
            if (A[0].length != B.length) {
                throw new IllegalArgumentException("Die Anzahl der Spalten von A muss gleich der Anzahl der Zeilen von B sein.");
            }

            int zeilenA = A.length;
            int spaltenA = A[0].length;
            int spaltenB = B[0].length;

            // Produktmatrix initialisieren
            int[][] produktMatrix = new int[zeilenA][spaltenB];

            // Berechnung des Matrixprodukts
            for (int i = 0; i < zeilenA; i++) {
                for (int j = 0; j < spaltenB; j++) {
                    int[] zeileA = Aufgabe5b.getZeile(A, i);
                    int[] spalteB = Aufgabe5c.getSpalte(B, j);
                    produktMatrix[i][j] = Aufgabe5a.skalarProdukt(zeileA, spalteB);
                }
            }

            return produktMatrix;
        }

        // Die vorherigen Methoden (skalarProdukt, getZeile, getSpalte) aus den vorherigen Antworten müssen hier ebenfalls vorhanden sein.
    }

}
