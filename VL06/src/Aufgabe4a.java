public class Aufgabe4a {


    public static class AnzahlSterne {
        public static void main(String[] args) {
            // Beispielaufruf
            char[][] feld = {
                    {'*', '*', '*', ' ', ' '},
                    {'*', ' ', '*', '*', '*'},
                    {'*', ' ', ' ', '*'}
            };

            berechneSterneProZeile(feld);
        }

        public static void berechneSterneProZeile(char[][] feld) {
            for (int i = 0; i < feld.length; i++) {
                int sterneInZeile = 0;

                for (int j = 0; j < feld[i].length; j++) {
                    if (feld[i][j] == '*') {
                        sterneInZeile++;
                    }
                }

                System.out.println("In Zeile " + (i + 1) + " gibt es " + sterneInZeile + " Sterne.");
            }
        }
    }
}
