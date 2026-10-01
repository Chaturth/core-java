package Programs;

public class CountEvenOdd {
    public static void main(String[] args) {

        int[] numbers = {10, 21, 30, 45, 50, 63};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
