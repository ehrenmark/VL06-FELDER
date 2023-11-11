//a)
public class Aufgabe2a {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println(checkNum(nums)); // Beispielaufruf
    }

    public static boolean checkNum(int[] nums) {
        // Überprüfen, ob das Feld mindestens Länge 1 hat
        // und ob das erste und das letzte Element den gleichen Wert haben
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
}
