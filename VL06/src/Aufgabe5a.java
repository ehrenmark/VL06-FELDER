public class Aufgabe5a {

        public static void main(String[] args) {
            // Beispielaufruf
            int[] vektor1 = {1, 2, 3};
            int[] vektor2 = {4, 5, 6};

            int ergebnis = skalarProdukt(vektor1, vektor2);
            System.out.println("Das Skalarprodukt der Vektoren ist: " + ergebnis);
        }

        public static int skalarProdukt(int[] v, int[] w) {
            // Überprüfen, ob die Arrays die gleiche Länge haben
            if (v.length != w.length) {
                throw new IllegalArgumentException("Die Arrays haben unterschiedliche Längen.");
            }

            int produkt = 0;

            // Berechnung des Skalarprodukts
            for (int i = 0; i < v.length; i++) {
                produkt += v[i] * w[i];
            }

            return produkt;
        }
    }


