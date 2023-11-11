public class Aufgabe2c {

    //public static void main(String[] args) {
    //    // Deklaration und Initialisierung des zweidimensionalen Arrays
    //    int[][] zweidimensionalesFeld = {
    //            {2, 3, 4, 5, 6, 7, 8, 9},
    //            {3, 4, 5, 6, 7, 8, 9, 10},
    //            {4, 5, 6, 7, 8, 9, 10, 11},
    //            {5, 6, 7, 8, 9, 10, 11, 12},
    //            {6, 7, 8, 9, 10, 11, 12, 13},
    //            {7, 8, 9, 10, 11, 12, 13, 14},
    //            {8, 9, 10, 11, 12, 13, 14, 15},
    //            {9, 10, 11, 12, 13, 14, 15, 16}
    //    };
//
    //    // Ausgabe des zweidimensionalen Arrays
    //    for (int i = 0; i < zweidimensionalesFeld.length; i++) {
    //        for (int j = 0; j < zweidimensionalesFeld[i].length; j++) {
    //            System.out.print(zweidimensionalesFeld[i][j] + " ");
    //        }
    //        System.out.println();
    //    }
    //}

    public static void main(String[] args) {
        // Größe des Arrays
        int zeilen = 8;
        int spalten = 8;

        // Erstellung und Füllen des zweidimensionalen Arrays
        int[][] zweidimensionalesFeld = new int[zeilen][spalten];

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                zweidimensionalesFeld[i][j] = i + j + 2;
            }
        }

        // Ausgabe des zweidimensionalen Arrays
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(zweidimensionalesFeld[i][j] + " ");
            }
            System.out.println();
        }
    }
}
