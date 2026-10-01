package Programs;

public class CopyArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
