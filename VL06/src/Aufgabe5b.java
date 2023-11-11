public class Aufgabe5b {

    public static void main(String[] args) {
        // Beispielaufruf
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int zeilenIndex = 1; // Beispielindex

        int[] zeile = getZeile(matrix, zeilenIndex);

        // Ausgabe der i-ten Zeile
        System.out.print("Die " + zeilenIndex + "-te Zeile: ");
        for (int element : zeile) {
            System.out.print(element + " ");
        }
    }

    public static int[] getZeile(int[][] A, int i) {
        // Überprüfen, ob der Index i gültig ist
        if (i < 0 || i >= A.length) {
            throw new IllegalArgumentException("Ungültiger Zeilenindex.");
        }

        // Kopie der i-ten Zeile erstellen
        int[] zeile = new int[A[i].length];
        System.arraycopy(A[i], 0, zeile, 0, A[i].length);

        return zeile;
    }
}
