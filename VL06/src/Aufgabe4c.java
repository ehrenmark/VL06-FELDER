public class Aufgabe4c {

    public static class AnzahlSterne {
        public static void main(String[] args) {
            // Beispielaufruf
            char[][] feld = {
                    {'*', ' ', ' ', ' ', ' '},
                    {'*', ' ', '*', '*', '*'},
                    {'*', ' ', ' ', '*', ' '}
            };

            berechneAnzahlZeilen(feld);
        }

        public static void berechneAnzahlZeilen(char[][] feld) {
            int anzahlZeilenMitMindestensZweiSterne = 0;

            for (int i = 0; i < feld.length; i++) {
                int sterneInZeile = 0;

                for (int j = 0; j < feld[i].length; j++) {
                    if (feld[i][j] == '*') {
                        sterneInZeile++;
                    }
                }

                if (sterneInZeile >= 2) {
                    anzahlZeilenMitMindestensZweiSterne++;
                }
            }

            System.out.println("Es gibt " + anzahlZeilenMitMindestensZweiSterne + " Zeilen mit mindestens 2 Sternen.");
        }
    }

}
