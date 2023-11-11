public class Aufgabe4b {

    public static class AnzahlSterne {
        public static void main(String[] args) {
            // Beispielaufruf
            char[][] rechteckigesFeld = {
                    {'*', '*', '*', ' ', ' '},
                    {'*', ' ', '*', '*', '*'},
                    {'*', ' ', ' ', '*', ' '}
            };

            berechneSterneProSpalte(rechteckigesFeld);
        }

        public static void berechneSterneProSpalte(char[][] feld) {
            if (feld.length == 0) {
                System.out.println("Das Feld ist leer.");
                return;
            }

            int zeilen = feld.length;
            int spalten = feld[0].length;

            for (int j = 0; j < spalten; j++) {
                int sterneInSpalte = 0;

                for (int i = 0; i < zeilen; i++) {
                    if (feld[i][j] == '*') {
                        sterneInSpalte++;
                    }
                }

                System.out.println("In Spalte " + (j + 1) + " gibt es " + sterneInSpalte + " Sterne.");
            }
        }
    }

}
