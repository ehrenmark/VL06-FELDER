public class Aufgabe2b {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 2, 1};
        int value = 1;
        System.out.println(count(nums, value)); // Beispielaufruf
    }

    public static int count(int[] nums, int value) {
        // Zähler für das Vorkommen des Werts initialisieren
        int count = 0;

        // Durch das Feld laufen und zählen, wie oft der Wert vorkommt
        for (int num : nums) {
            if (num == value) {
                count++;
            }
        }

        // Die Anzahl zurückgeben
        return count;
    }
}